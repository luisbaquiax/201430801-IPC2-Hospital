/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.DBmodelo;

import com.hospital.DBconeccion.Coneccion;
import com.hospital.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class UsuarioDB {

    private static final Connection connection = Coneccion.getConeccion();
    private static final String INSERTAR = "INSERT INTO USUARIOS(contraseña, tipo,codigo ) VALUES(?,?,?)";

    public UsuarioDB() {
    }

    /**
     * Insertar usuario a la DB
     *
     * @param usuario
     * @throws SQLException
     */
    public void insertarUsuario(Usuario usuario) throws SQLException {

        PreparedStatement preSt = connection.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, usuario.getContraseña());
        preSt.setString(2, usuario.getTipo());
        preSt.setString(3, usuario.getCodigo());
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }
}
