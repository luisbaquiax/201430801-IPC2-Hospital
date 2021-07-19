/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author luis
 */
public class Laboratorista implements Serializable {

    private static final String COL_CODIGO = "CODIGO";
    private static final String COL_NOMBRE = "nombre";
    private static final String COL_REGISTRO = "registro";
    private static final String COL_DPI = "dpi";
    private static final String COL_TELEFONO = "telefono";
    private static final String COL_TIPO_EXAMEN = "tipo_examen";
    private static final String COL_EMAIL = "email";
    private static final String COL_FECHA_INICO_TRABAJO = "fecha_inicio_trabajo";
    private static final String COL_CONTRSEÑA = "contraseña";

    private String codigo;
    private String nombre;
    private String registro;
    private String dpi;
    private String telefono;
    private String tipoExamen;
    private String email;
    private String fechaInicioTrabajo;
    private String contraseña;

    /**
     * COnstruye una laboratorista para la DB
     *
     * @param codigo
     * @param nombre
     * @param registro
     * @param dpi
     * @param telefono
     * @param tipoExamen
     * @param email
     * @param fechaInicioTrabajo
     * @param contraseña
     */
    public Laboratorista(String codigo,
            String nombre,
            String registro,
            String dpi,
            String telefono,
            String tipoExamen,
            String email,
            String fechaInicioTrabajo,
            String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.registro = registro;
        this.dpi = dpi;
        this.telefono = telefono;
        this.tipoExamen = tipoExamen;
        this.email = email;
        this.fechaInicioTrabajo = fechaInicioTrabajo;
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
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
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
     * @return the tipoExamen
     */
    public String getTipoExamen() {
        return tipoExamen;
    }

    /**
     * @param tipoExamen the tipoExamen to set
     */
    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
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
     * @return the fechaInicioTrabajo
     */
    public String getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }

    /**
     * @param fechaInicioTrabajo the fechaInicioTrabajo to set
     */
    public void setFechaInicioTrabajo(String fechaInicioTrabajo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
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
