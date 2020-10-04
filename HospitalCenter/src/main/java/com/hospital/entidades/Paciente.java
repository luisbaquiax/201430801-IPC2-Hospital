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
public class Paciente implements Serializable {

    //nombre de las columnas en la base de datos
    private static final String COL_CODIGO = "CODIGO";
    private static final String COL_NOMBRE = "nombre";
    private static final String COL_SEXO = "sexo";
    private static final String COL_FECHA_NACIMIENTO = "fecha_nacimiento";
    private static final String COL_DPI = "dpi";
    private static final String COL_TELEFONO = "telefono";
    private static final String COL_PESO = "peso";
    private static final String COL_TIPO_SANGRE = "tipo_sangre";
    private static final String COL_EMAIL = "email";
    private static final String COL_CONTRASEÑA = "contraseña";

    private String codigo;
    private String nombre;
    private String sexo;
    private String fechaNacimiento;
    private String dpi;
    private String telefono;
    private String peso;
    private String tipoSangre;
    private String email;
    private String contraseña;

    public Paciente(String codigo,
            String nombre,
            String sexo,
            String fechaNacimiento,
            String dpi,
            String telefono,
            String peso,
            String tipoSangre,
            String email,
            String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.dpi = dpi;
        this.telefono = telefono;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.email = email;
        this.contraseña = contraseña;
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
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
