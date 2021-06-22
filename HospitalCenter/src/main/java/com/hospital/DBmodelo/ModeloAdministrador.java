/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.DBmodelo;

import com.hospital.DBconeccion.Coneccion;
import com.hospital.entidades.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ModeloAdministrador {

    private static Connection connection = Coneccion.getConeccion();

    private final String CREAR_ADMINISTRADOR = "INSERT INTO " + Administrador.NOMBRE + " (" + Administrador.COL_CODIGO + "," + Administrador.COL_DPI + "," + Administrador.COL_NOMBRE + "," + Administrador.COL_CONTRASEÑA + ") VALUES (?,?,?,?)";

    public ModeloAdministrador() {
    }

    /**
     * Se agrega un administrador
     *
     * @param codigo
     * @param dpi
     * @param nombre
     * @param contraseña
     * @throws java.sql.SQLException
     */
    public void agregarAdministrador(
            String codigo,
            String dpi,
            String nombre,
            String contraseña) throws SQLException {

        PreparedStatement preSt = connection.prepareStatement(CREAR_ADMINISTRADOR, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, dpi);
        preSt.setString(3, nombre);
        preSt.setString(4, contraseña);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

    /**
     * Metodo que me servirá para listar a todos los usuarios, esto para
     * controlar la carga de datos
     *
     * @return
     * @throws SQLException
     */
    public List<Administrador> listarAdministradores() throws SQLException {

        String query = "SELECT * FROM ADMINISTRADOR";

        PreparedStatement preSt = connection.prepareStatement(query);
        ResultSet result = preSt.executeQuery();

        List<Administrador> administradores = new LinkedList<>();
        while (result.next()) {
            administradores.add(new Administrador(result.getString(Administrador.COL_CODIGO),
                    result.getString(Administrador.COL_DPI),
                    result.getString(Administrador.COL_NOMBRE),
                    result.getString(Administrador.COL_CONTRASEÑA)));
        }
        return administradores;

    }

    /**
     * Buscamos un administrador en base al codigo y a la contrasena
     *
     * @param codigo
     * @param contrseña
     * @return
     * @throws SQLException
     */
    public Administrador buscarAdministrador(String codigo, String contrseña) throws SQLException {

        String query = "select * from ADMINISTRADOR A where A.CODIGO = '" + codigo + "' AND A.contraseña = '" + contrseña + "'";

        PreparedStatement preSt = connection.prepareStatement(query);
        ResultSet result = preSt.executeQuery();

        Administrador administrador = null;
        while (result.next()) {
            administrador = new Administrador(result.getString(Administrador.COL_CODIGO),
                    result.getString(Administrador.COL_DPI),
                    result.getString(Administrador.COL_NOMBRE),
                    result.getString(Administrador.COL_CONTRASEÑA));
        }
        return administrador;
    }

}
