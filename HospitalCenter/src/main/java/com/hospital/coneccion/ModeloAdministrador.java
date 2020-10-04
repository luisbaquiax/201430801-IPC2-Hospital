/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.coneccion;

import com.hospital.entidades.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class ModeloAdministrador {

    private static Connection connection = Coneccion.getInstance();

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
            String contraseña
    ) throws SQLException {

        String query = "INSERT INTO ADMINISTRADOR VALUES (?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

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
}
