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
public class Medico implements Serializable {

    //nombre de las columnas en la base de datos
    public static final String NOMBRE = "MEDICO";
    public static final String COL_CODIGO = "CODIGO";
    public static final String COL_NOMBRE = "nombre";
    public static final String COL_COLEGIADO = "colegiado";
    public static final String COL_DPI = "dpi";
    public static final String COL_TELEFONO = "telefono";
    public static final String COL_EMAIL = "email";
    public static final String COL_HORARIO_INICIO = "horario_inicio";
    public static final String COL_HORARIO_FIN = "horario_fin";
    public static final String COL_FECHA_INICO_TRABAJO = "fecha_inicio_trabajo";
    public static final String COL_CONTRASEÑA = "contraseña";

    private String codigo;
    private String nombre;
    private String colegiado;
    private String dpi;
    private String telefono;
    private String email;
    private String horarioInicio;
    private String horarioFin;
    private String fechaInicioTrabajo;
    private String contraseña;

    /**
     * Construe un médico
     *
     * @param codigo
     * @param nombre
     * @param colegiado
     * @param dpi
     * @param telefono
     * @param email
     * @param horarioInicio
     * @param horarioFin
     * @param fechaInicioTrabajo
     * @param contraseña
     */
    public Medico(String codigo,
            String nombre,
            String colegiado,
            String dpi,
            String telefono,
            String email,
            String horarioInicio,
            String horarioFin,
            String fechaInicioTrabajo,
            String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.colegiado = colegiado;
        this.dpi = dpi;
        this.telefono = telefono;
        this.email = email;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
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
     * @return the colegiado
     */
    public String getColegiado() {
        return colegiado;
    }

    /**
     * @param colegiado the colegiado to set
     */
    public void setColegiado(String colegiado) {
        this.colegiado = colegiado;
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
     * @return the horarioInicio
     */
    public String getHorarioInicio() {
        return horarioInicio;
    }

    /**
     * @param horarioInicio the horarioInicio to set
     */
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    /**
     * @return the horarioFin
     */
    public String getHorarioFin() {
        return horarioFin;
    }

    /**
     * @param horarioFin the horarioFin to set
     */
    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
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
