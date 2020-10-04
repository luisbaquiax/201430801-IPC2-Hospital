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
public class Resultado implements Serializable {

    //nombre de las columnas en la base de datos
    private static final String COL_CODIGO = "CODIGO";
    private static final String COL_CODIGO_PACIENTE = "codigo_paciente";
    private static final String COL_CODIGO_EXAMEN = "codigo_examen";
    private static final String COL_CODIGO_LABORATORISTA = "codigo_laboratorista";
    private static final String COL_ORDEN_PATH = "orden_path";
    private static final String COL_INFORME_PATH = "informe_path";
    private static final String COL_FEHCA = "fecha";
    private static final String COL_HORA = "hora";

    private String codigo;
    private String codigoPaciente;
    private String codigoExamen;
    private String codigoLaboratorista;
    private String ordenPath;
    private String informePath;
    private String fecha;
    private String hora;

    public Resultado(String codigo,
            String codigoPaciente,
            String codigoExamen,
            String codigoLaboratorista,
            String ordenPath,
            String informePath,
            String fecha,
            String hora) {
        this.codigo = codigo;
        this.codigoPaciente = codigoPaciente;
        this.codigoExamen = codigoExamen;
        this.codigoLaboratorista = codigoLaboratorista;
        this.ordenPath = ordenPath;
        this.informePath = informePath;
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
     * @return the codigoExamen
     */
    public String getCodigoExamen() {
        return codigoExamen;
    }

    /**
     * @param codigoExamen the codigoExamen to set
     */
    public void setCodigoExamen(String codigoExamen) {
        this.codigoExamen = codigoExamen;
    }

    /**
     * @return the codigoLaboratorista
     */
    public String getCodigoLaboratorista() {
        return codigoLaboratorista;
    }

    /**
     * @param codigoLaboratorista the codigoLaboratorista to set
     */
    public void setCodigoLaboratorista(String codigoLaboratorista) {
        this.codigoLaboratorista = codigoLaboratorista;
    }

    /**
     * @return the ordenPath
     */
    public String getOrdenPath() {
        return ordenPath;
    }

    /**
     * @param ordenPath the ordenPath to set
     */
    public void setOrdenPath(String ordenPath) {
        this.ordenPath = ordenPath;
    }

    /**
     * @return the informePath
     */
    public String getInformePath() {
        return informePath;
    }

    /**
     * @param informePath the informePath to set
     */
    public void setInformePath(String informePath) {
        this.informePath = informePath;
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
