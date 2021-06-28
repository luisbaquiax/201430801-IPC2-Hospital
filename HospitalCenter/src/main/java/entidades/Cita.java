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
public class Cita implements Serializable {

    //nombre de las columnas en la base de datos
    public static final String NOMBRE = "CITA";
    public static final String COL_CODIGO = "CODIGO";
    public static final String COL_NOMBRE = "codigo_paciente";
    public static final String COL_COLEGIADO = "codigo_medico";
    public static final String COL_ESPECIALIDAD = "especialidad";
    public static final String COL_DPI = "fecha";
    public static final String COL_TELEFONO = "hora";

    private String codigo;
    private String codigoPaciente;
    private String codigoMedico;
    private String especialidad;
    private String fecha;
    private String hora;

    /**
     * SIrve para construir una cita
     *
     * @param codigo
     * @param codigoPaciente
     * @param codigoMedico
     * @param especialidad
     * @param fecha
     * @param hora
     */
    public Cita(String codigo,
            String codigoPaciente,
            String codigoMedico,
            String especialidad,
            String fecha,
            String hora) {
        this.codigo = codigo;
        this.codigoPaciente = codigoPaciente;
        this.codigoMedico = codigoMedico;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora = hora;
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
     * @return the codigoPaciente
     */
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * @param codigoPaciente the codigoPaciente to set
     */
    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    /**
     * @return the codigoMedico
     */
    public String getCodigoMedico() {
        return codigoMedico;
    }

    /**
     * @param codigoMedico the codigoMedico to set
     */
    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

}
