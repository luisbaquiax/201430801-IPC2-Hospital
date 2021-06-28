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
public class Examen implements Serializable {

    //columnas en la base de datos
    private static final String COL_CODIGO = "CODIGO";
    private static final String COL_NOMBRE = "nombre";
    private static final String COL_ORDEN = "orden";
    private static final String COL_DESCRIPCION = "descripcion";
    private static final String COL_COSTO = "costo";
    private static final String COL_INFORME = "informe_tipo";

    private String codigo;
    private String nombre;
    private String orden;
    private String descripcion;
    private String costo;
    private String informe;

    /**
     * COnstruye un examen
     *
     * @param codigo
     * @param nombre
     * @param orden
     * @param descripcion
     * @param costo
     * @param informe
     */
    public Examen(String codigo,
            String nombre,
            String orden,
            String descripcion,
            String costo,
            String informe) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.orden = orden;
        this.descripcion = descripcion;
        this.costo = costo;
        this.informe = informe;
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
     * @return the orden
     */
    public String getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(String orden) {
        this.orden = orden;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

}
