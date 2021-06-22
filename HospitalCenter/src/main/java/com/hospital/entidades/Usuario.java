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
public class Usuario implements Serializable {

    private String contraseña;
    private String tipo;
    private String codigo;

    /**
     * Agrear un usuario a la BD
     *
     * @param contraseña
     * @param tipo
     */
    public Usuario(String contraseña, String tipo, String codigo) {
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    /**
     * Buscar un usuario
     *
     * @param contraseña
     * @param tipo
     */
    public Usuario(String contraseña, String tipo) {
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

}
