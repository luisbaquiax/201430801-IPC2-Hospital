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
public class Reporte implements Serializable {

    //nombre de las columnas en la base de datos
    private static final String COL_CODIGO = "CODIGO";
    private static final String COL_CODIGO_PACIENTE = "codigo_paciente";
    private static final String COL_CODIGO_MEDICO = "codigo_medico";
    private static final String COL_INFORME = "informe";
    private static final String COL_FECHA = "fecha";
    private static final String COL_HORA = "hora";

    private String codigo;
    private String codigoPaciente;
    private String codigoMedico;
    private String informe;
    private String fecha;
    private String hora;

    /**
     * Para crear un dato de tipo REPORTE
     *
     * @param codigo
     * @param codigoPaciente
     * @param codigoMedico
     * @param informe
     * @param fecha
     * @param hora
     */
    public Reporte(String codigo,
            String codigoPaciente,
            String codigoMedico,
            String informe,
            String fecha,
            String hora) {
        this.codigo = codigo;
        this.codigoPaciente = codigoPaciente;
        this.codigoMedico = codigoMedico;
        this.informe = informe;
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
     * @return the informe
     */
    public String getInforme() {
        return informe;
    }

    /**
     * @param informe the informe to set
     */
    public void setInforme(String informe) {
        this.informe = informe;
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
