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
public class HistorialMedico implements Serializable {

    //nombre de las columnas en la base de datos
    private static final String COL_ID = "ID";
    private static final String COL_CODIGO_RESULTADO = "codigo_resultado";
    private static final String COL_CODIGO_CITA = "codigo_cita";
    private static final String COL_CODIGO_PACIENTE = "codigo_paciente";

    private int id;
    private String codigoResultado;
    private String codigoCita;
    private String codigoPaciente;

    /**
     * Sirve para crear un objeto HistorialMedico
     *
     * @param id
     * @param codigoResultado
     * @param codigoCita
     * @param codigoPaciente
     */
    public HistorialMedico(int id,
            String codigoResultado,
            String codigoCita,
            String codigoPaciente) {
        this.id = id;
        this.codigoResultado = codigoResultado;
        this.codigoCita = codigoCita;
        this.codigoPaciente = codigoPaciente;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigoResultado
     */
    public String getCodigoResultado() {
        return codigoResultado;
    }

    /**
     * @param codigoResultado the codigoResultado to set
     */
    public void setCodigoResultado(String codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    /**
     * @return the codigoCita
     */
    public String getCodigoCita() {
        return codigoCita;
    }

    /**
     * @param codigoCita the codigoCita to set
     */
    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
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

}
