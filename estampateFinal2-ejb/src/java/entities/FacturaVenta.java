/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TIC-SCI
 */
@Entity
@Table(name = "factura_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacturaVenta.findAll", query = "SELECT f FROM FacturaVenta f"),
    @NamedQuery(name = "FacturaVenta.findByIdFacturaVenta", query = "SELECT f FROM FacturaVenta f WHERE f.idFacturaVenta = :idFacturaVenta"),
    @NamedQuery(name = "FacturaVenta.findByFecha", query = "SELECT f FROM FacturaVenta f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "FacturaVenta.findByDireccion", query = "SELECT f FROM FacturaVenta f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "FacturaVenta.findByTextoEstampa", query = "SELECT f FROM FacturaVenta f WHERE f.textoEstampa = :textoEstampa"),
    @NamedQuery(name = "FacturaVenta.findByCantidad", query = "SELECT f FROM FacturaVenta f WHERE f.cantidad = :cantidad"),
    @NamedQuery(name = "FacturaVenta.findByFormaPago", query = "SELECT f FROM FacturaVenta f WHERE f.formaPago = :formaPago"),
    @NamedQuery(name = "FacturaVenta.findByValorArtista", query = "SELECT f FROM FacturaVenta f WHERE f.valorArtista = :valorArtista"),
    @NamedQuery(name = "FacturaVenta.findByValorEmpresa", query = "SELECT f FROM FacturaVenta f WHERE f.valorEmpresa = :valorEmpresa"),
    @NamedQuery(name = "FacturaVenta.findByValorAdicionalTexto", query = "SELECT f FROM FacturaVenta f WHERE f.valorAdicionalTexto = :valorAdicionalTexto"),
    @NamedQuery(name = "FacturaVenta.findByValorNeto", query = "SELECT f FROM FacturaVenta f WHERE f.valorNeto = :valorNeto"),
    @NamedQuery(name = "FacturaVenta.findByValorTotal", query = "SELECT f FROM FacturaVenta f WHERE f.valorTotal = :valorTotal")})
public class FacturaVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFactura_Venta")
    private Integer idFacturaVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "textoEstampa")
    private String textoEstampa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "formaPago")
    private String formaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorArtista")
    private int valorArtista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorEmpresa")
    private int valorEmpresa;
    @Column(name = "valorAdicionalTexto")
    private Integer valorAdicionalTexto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorNeto")
    private int valorNeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotal")
    private int valorTotal;
    @JoinColumn(name = "Camisetas_idCamisetas", referencedColumnName = "idCamisetas")
    @ManyToOne(optional = false)
    private Camisetas camisetasidCamisetas;
    @JoinColumn(name = "Estampas_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario")
    @ManyToOne(optional = false)
    private Estampas estampasUsuarioidUsuario;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioidUsuario;
    @JoinColumn(name = "Estampas_idEstampas", referencedColumnName = "idEstampas")
    @ManyToOne(optional = false)
    private Estampas estampasidEstampas;

    public FacturaVenta() {
    }

    public FacturaVenta(Integer idFacturaVenta) {
        this.idFacturaVenta = idFacturaVenta;
    }

    public FacturaVenta(Integer idFacturaVenta, String fecha, String direccion, String textoEstampa, int cantidad, String formaPago, int valorArtista, int valorEmpresa, int valorNeto, int valorTotal) {
        this.idFacturaVenta = idFacturaVenta;
        this.fecha = fecha;
        this.direccion = direccion;
        this.textoEstampa = textoEstampa;
        this.cantidad = cantidad;
        this.formaPago = formaPago;
        this.valorArtista = valorArtista;
        this.valorEmpresa = valorEmpresa;
        this.valorNeto = valorNeto;
        this.valorTotal = valorTotal;
    }

    public Integer getIdFacturaVenta() {
        return idFacturaVenta;
    }

    public void setIdFacturaVenta(Integer idFacturaVenta) {
        this.idFacturaVenta = idFacturaVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTextoEstampa() {
        return textoEstampa;
    }

    public void setTextoEstampa(String textoEstampa) {
        this.textoEstampa = textoEstampa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getValorArtista() {
        return valorArtista;
    }

    public void setValorArtista(int valorArtista) {
        this.valorArtista = valorArtista;
    }

    public int getValorEmpresa() {
        return valorEmpresa;
    }

    public void setValorEmpresa(int valorEmpresa) {
        this.valorEmpresa = valorEmpresa;
    }

    public Integer getValorAdicionalTexto() {
        return valorAdicionalTexto;
    }

    public void setValorAdicionalTexto(Integer valorAdicionalTexto) {
        this.valorAdicionalTexto = valorAdicionalTexto;
    }

    public int getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(int valorNeto) {
        this.valorNeto = valorNeto;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Camisetas getCamisetasidCamisetas() {
        return camisetasidCamisetas;
    }

    public void setCamisetasidCamisetas(Camisetas camisetasidCamisetas) {
        this.camisetasidCamisetas = camisetasidCamisetas;
    }

    public Estampas getEstampasUsuarioidUsuario() {
        return estampasUsuarioidUsuario;
    }

    public void setEstampasUsuarioidUsuario(Estampas estampasUsuarioidUsuario) {
        this.estampasUsuarioidUsuario = estampasUsuarioidUsuario;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public Estampas getEstampasidEstampas() {
        return estampasidEstampas;
    }

    public void setEstampasidEstampas(Estampas estampasidEstampas) {
        this.estampasidEstampas = estampasidEstampas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacturaVenta != null ? idFacturaVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaVenta)) {
            return false;
        }
        FacturaVenta other = (FacturaVenta) object;
        if ((this.idFacturaVenta == null && other.idFacturaVenta != null) || (this.idFacturaVenta != null && !this.idFacturaVenta.equals(other.idFacturaVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FacturaVenta[ idFacturaVenta=" + idFacturaVenta + " ]";
    }
    
}
