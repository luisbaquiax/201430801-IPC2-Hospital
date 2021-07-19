/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author luis
 */
public class Usuario {

    //TIPO DE USUARIO
    public static final String TIPO_LABORATORISTA = "laboratorista";
    public static final String TIPO_MEDICO = "medico";
    public static final String TIPO_ADMINISTRADOR = "administrador";
    public static final String TIPO_PACIENTE = "paciente";
    //Atributos
    private int id;
    private String contraseña;
    private String tipo;
    private String codigo;

    /**
     * DB
     *
     * @param contraseña
     * @param tipo
     * @param codigo
     */
    public Usuario(String contraseña, String tipo, String codigo) {
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    /**
     * LIST FROM DB
     *
     * @param id
     * @param contraseña
     * @param tipo
     * @param codigo
     */
    public Usuario(int id, String contraseña, String tipo, String codigo) {
        this.id = id;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

}
