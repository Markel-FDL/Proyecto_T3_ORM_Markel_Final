package com.mycompany;

import javax.persistence.*;

@Entity
@Table(name = "gestion", schema = "proyecto_t3", catalog = "")
@IdClass(GestionEntityPK.class)
public class GestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "proyectos_codigo", nullable = false, length = 6)
    private String proyectosCodigo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "proveedores_codigo", nullable = false, length = 6)
    private String proveedoresCodigo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "piezas_codigo", nullable = false, length = 6)
    private String piezasCodigo;
    @Basic
    @Column(name = "cantidad", nullable = true, precision = 0)
    private Double cantidad;

    public String getProyectosCodigo() {
        return proyectosCodigo;
    }

    public void setProyectosCodigo(String proyectosCodigo) {
        this.proyectosCodigo = proyectosCodigo;
    }

    public String getProveedoresCodigo() {
        return proveedoresCodigo;
    }

    public void setProveedoresCodigo(String proveedoresCodigo) {
        this.proveedoresCodigo = proveedoresCodigo;
    }

    public String getPiezasCodigo() {
        return piezasCodigo;
    }

    public void setPiezasCodigo(String piezasCodigo) {
        this.piezasCodigo = piezasCodigo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
