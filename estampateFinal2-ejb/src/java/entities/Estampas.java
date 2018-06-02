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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "estampas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estampas.findAll", query = "SELECT e FROM Estampas e"),
    @NamedQuery(name = "Estampas.findByIdEstampas", query = "SELECT e FROM Estampas e WHERE e.idEstampas = :idEstampas"),
    @NamedQuery(name = "Estampas.findByNombreEstampa", query = "SELECT e FROM Estampas e WHERE e.nombreEstampa = :nombreEstampa"),
    @NamedQuery(name = "Estampas.findByDescripcion", query = "SELECT e FROM Estampas e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Estampas.findByTama\u00f1o", query = "SELECT e FROM Estampas e WHERE e.tama\u00f1o = :tama\u00f1o"),
    @NamedQuery(name = "Estampas.findByPrecio", query = "SELECT e FROM Estampas e WHERE e.precio = :precio"),
    @NamedQuery(name = "Estampas.findByUbicacion", query = "SELECT e FROM Estampas e WHERE e.ubicacion = :ubicacion"),
    @NamedQuery(name = "Estampas.findByAutor", query = "SELECT e FROM Estampas e WHERE e.autor = :autor"),
    @NamedQuery(name = "Estampas.findByRating", query = "SELECT e FROM Estampas e WHERE e.rating = :rating"),
    @NamedQuery(name = "Estampas.findByPopularidad", query = "SELECT e FROM Estampas e WHERE e.popularidad = :popularidad")})
public class Estampas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstampas")
    private Integer idEstampas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreEstampa")
    private String nombreEstampa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "autor")
    private String autor;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "popularidad")
    private Integer popularidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estampasUsuarioidUsuario")
    private Collection<FacturaVenta> facturaVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estampasidEstampas")
    private Collection<FacturaVenta> facturaVentaCollection1;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioidUsuario;

    public Estampas() {
    }

    public Estampas(Integer idEstampas) {
        this.idEstampas = idEstampas;
    }

    public Estampas(Integer idEstampas, String nombreEstampa, String descripcion, String tamaño, int precio, String ubicacion, String autor) {
        this.idEstampas = idEstampas;
        this.nombreEstampa = nombreEstampa;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.autor = autor;
    }

    public Integer getIdEstampas() {
        return idEstampas;
    }

    public void setIdEstampas(Integer idEstampas) {
        this.idEstampas = idEstampas;
    }

    public String getNombreEstampa() {
        return nombreEstampa;
    }

    public void setNombreEstampa(String nombreEstampa) {
        this.nombreEstampa = nombreEstampa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Integer popularidad) {
        this.popularidad = popularidad;
    }

    @XmlTransient
    public Collection<FacturaVenta> getFacturaVentaCollection() {
        return facturaVentaCollection;
    }

    public void setFacturaVentaCollection(Collection<FacturaVenta> facturaVentaCollection) {
        this.facturaVentaCollection = facturaVentaCollection;
    }

    @XmlTransient
    public Collection<FacturaVenta> getFacturaVentaCollection1() {
        return facturaVentaCollection1;
    }

    public void setFacturaVentaCollection1(Collection<FacturaVenta> facturaVentaCollection1) {
        this.facturaVentaCollection1 = facturaVentaCollection1;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstampas != null ? idEstampas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estampas)) {
            return false;
        }
        Estampas other = (Estampas) object;
        if ((this.idEstampas == null && other.idEstampas != null) || (this.idEstampas != null && !this.idEstampas.equals(other.idEstampas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Estampas[ idEstampas=" + idEstampas + " ]";
    }
    
}
