/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Imani
 */
@Entity
@Table(name = "EVALUACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluaciones.findAll", query = "SELECT e FROM Evaluaciones e"),
    @NamedQuery(name = "Evaluaciones.findById", query = "SELECT e FROM Evaluaciones e WHERE e.id = :id"),
    @NamedQuery(name = "Evaluaciones.findByNombres", query = "SELECT e FROM Evaluaciones e WHERE e.nombres = :nombres"),
    @NamedQuery(name = "Evaluaciones.findByApellidos", query = "SELECT e FROM Evaluaciones e WHERE e.apellidos = :apellidos"),
    @NamedQuery(name = "Evaluaciones.findByMateria", query = "SELECT e FROM Evaluaciones e WHERE e.materia = :materia"),
    @NamedQuery(name = "Evaluaciones.findByNota", query = "SELECT e FROM Evaluaciones e WHERE e.nota = :nota"),
    @NamedQuery(name = "Evaluaciones.findByEstado", query = "SELECT e FROM Evaluaciones e WHERE e.estado = :estado")})
public class Evaluaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="eva_sec", sequenceName="sec_evaluaciones", allocationSize = 1 )
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="eva_sec")
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 150)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 150)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 150)
    @Column(name = "MATERIA")
    private String materia;
    @Column(name = "NOTA")
    private BigDecimal nota;
    @Column(name = "ESTADO")
    private BigInteger estado;

    public Evaluaciones() {
    }

    public Evaluaciones(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
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
        if (!(object instanceof Evaluaciones)) {
            return false;
        }
        Evaluaciones other = (Evaluaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyectoejb.entidades.Evaluaciones[ id=" + id + " ]";
    }
    
}
