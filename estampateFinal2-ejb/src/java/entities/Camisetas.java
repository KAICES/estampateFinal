/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TIC-SCI
 */
@Entity
@Table(name = "camisetas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camisetas.findAll", query = "SELECT c FROM Camisetas c"),
    @NamedQuery(name = "Camisetas.findByIdCamisetas", query = "SELECT c FROM Camisetas c WHERE c.idCamisetas = :idCamisetas"),
    @NamedQuery(name = "Camisetas.findByTalla", query = "SELECT c FROM Camisetas c WHERE c.talla = :talla"),
    @NamedQuery(name = "Camisetas.findByColor", query = "SELECT c FROM Camisetas c WHERE c.color = :color"),
    @NamedQuery(name = "Camisetas.findByEstilo", query = "SELECT c FROM Camisetas c WHERE c.estilo = :estilo")})
public class Camisetas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCamisetas")
    private Integer idCamisetas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "talla")
    private String talla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "estilo")
    private String estilo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camisetasidCamisetas")
    private Collection<FacturaVenta> facturaVentaCollection;

    public Camisetas() {
    }

    public Camisetas(Integer idCamisetas) {
        this.idCamisetas = idCamisetas;
    }

    public Camisetas(Integer idCamisetas, String talla, String color, String estilo) {
        this.idCamisetas = idCamisetas;
        this.talla = talla;
        this.color = color;
        this.estilo = estilo;
    }

    public Integer getIdCamisetas() {
        return idCamisetas;
    }

    public void setIdCamisetas(Integer idCamisetas) {
        this.idCamisetas = idCamisetas;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @XmlTransient
    public Collection<FacturaVenta> getFacturaVentaCollection() {
        return facturaVentaCollection;
    }

    public void setFacturaVentaCollection(Collection<FacturaVenta> facturaVentaCollection) {
        this.facturaVentaCollection = facturaVentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCamisetas != null ? idCamisetas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camisetas)) {
            return false;
        }
        Camisetas other = (Camisetas) object;
        if ((this.idCamisetas == null && other.idCamisetas != null) || (this.idCamisetas != null && !this.idCamisetas.equals(other.idCamisetas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Camisetas[ idCamisetas=" + idCamisetas + " ]";
    }
    
}
