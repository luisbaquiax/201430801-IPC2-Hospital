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
public class Titulo implements Serializable {

    //columnas en la base de datos
    private static final String COL_ID = "ID";
    private static final String COL_ESPECIALIDADA = "nombre_especialidad";
    private static final String COL_CODIGO_MEDICO = "codigo_medico";

    private int id;
    private String nombreEspecialidad;
    private String codigoMedico;

    /**
     * CONTRUCTOR PARA INICIALIZAR EL OBJETO DE TIPO TITULO
     *
     * @param id
     * @param nombreEspecialidad
     * @param codigoMedico
     */
    public Titulo(int id, String nombreEspecialidad, String codigoMedico) {
        this.id = id;
        this.nombreEspecialidad = nombreEspecialidad;
        this.codigoMedico = codigoMedico;
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
     * @return the nombreEspecialidad
     */
    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    /**
     * @param nombreEspecialidad the nombreEspecialidad to set
     */
    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
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

}
