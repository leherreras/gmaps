/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corralitosjys.gmap.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luis Herrera
 */
@Entity
@Table(name = "ubicaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubicaciones.findAll", query = "SELECT u FROM Ubicaciones u"),
    @NamedQuery(name = "Ubicaciones.findById", query = "SELECT u FROM Ubicaciones u WHERE u.id = :id"),
    @NamedQuery(name = "Ubicaciones.findByLongitud", query = "SELECT u FROM Ubicaciones u WHERE u.longitud = :longitud"),
    @NamedQuery(name = "Ubicaciones.findByLatitud", query = "SELECT u FROM Ubicaciones u WHERE u.latitud = :latitud"),
    @NamedQuery(name = "Ubicaciones.findByTitulo", query = "SELECT u FROM Ubicaciones u WHERE u.titulo = :titulo"),
    @NamedQuery(name = "Ubicaciones.findByDetalle", query = "SELECT u FROM Ubicaciones u WHERE u.detalle = :detalle")})
public class Ubicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitud")
    private double longitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitud")
    private double latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "detalle")
    private String detalle;

    public Ubicaciones() {
    }

    public Ubicaciones(Integer id) {
        this.id = id;
    }

    public Ubicaciones(Integer id, double longitud, double latitud, String titulo, String detalle) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
        this.titulo = titulo;
        this.detalle = detalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicaciones)) {
            return false;
        }
        Ubicaciones other = (Ubicaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.gmap.Entity.Ubicaciones[ id=" + id + " ]";
    }
    
}
