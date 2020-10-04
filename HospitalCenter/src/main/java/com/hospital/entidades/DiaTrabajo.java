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
public class DiaTrabajo implements Serializable {

    //columnas en la base de datos
    private static final String COL_ID = "ID";
    private static final String COL_DIA = "dia";
    private static final String COL_LABORATORISTA = "laboratorista";

    private int id;
    private String dia;
    private String laboratorista;

    public DiaTrabajo(int id, String dia, String laboratorista) {
        this.id = id;
        this.dia = dia;
        this.laboratorista = laboratorista;
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
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the laboratorista
     */
    public String getLaboratorista() {
        return laboratorista;
    }

    /**
     * @param laboratorista the laboratorista to set
     */
    public void setLaboratorista(String laboratorista) {
        this.laboratorista = laboratorista;
    }

}
