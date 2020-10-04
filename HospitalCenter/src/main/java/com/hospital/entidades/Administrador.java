/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.entidades;

import java.io.Serializable;

/**
 *
 * @author luis
 */
public class Administrador implements Serializable {

    //nombre de las columnas en la base de datos
    public static final String NOMBRE = "ADMINISTRADOR";
    public static final String COL_CODIGO = "CODIGO";
    public static final String COL_DPI = "dpi";
    public static final String COL_NOMBRE = "nombre";
    public static final String COL_CONTRASEÑA = "contraseña";

    private String codigo;
    private String dpi;
    private String nombre;
    private String contreseña;

    public Administrador(String codigo, String dpi, String nombre, String contreseña) {
        this.codigo = codigo;
        this.dpi = dpi;
        this.nombre = nombre;
        this.contreseña = contreseña;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contreseña
     */
    public String getContreseña() {
        return contreseña;
    }

    /**
     * @param contreseña the contreseña to set
     */
    public void setContreseña(String contreseña) {
        this.contreseña = contreseña;
    }

}
