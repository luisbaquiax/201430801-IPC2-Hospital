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
public class Consulta implements Serializable {

    //nombre de las columnas en la base de datos
    private static final String COL_ID = "ID";
    private static final String COL_TIPO_CONSULTA = "TIPO_CONSULTA";
    private static final String COL_COSTO = "costo";

    private int id;
    private String tipoConsulta;
    private String costo;

    /**
     * COnstruye una nueva consulta
     *
     * @param ide
     * @param tipoConsulta
     * @param costo
     */
    public Consulta(int ide, String tipoConsulta, String costo) {
        this.id = ide;
        this.tipoConsulta = tipoConsulta;
        this.costo = costo;
    }

    /**
     * @return the ide
     */
    public int getIde() {
        return id;
    }

    /**
     * @param ide the ide to set
     */
    public void setIde(int ide) {
        this.id = ide;
    }

    /**
     * @return the tipoConsulta
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * @param tipoConsulta the tipoConsulta to set
     */
    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    /**
     * @return the costo
     */
    public String getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

}
