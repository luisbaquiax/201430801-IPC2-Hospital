/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class UsuarioDB {

    private static final Connection connection = Coneccion.getConeccion();
    private static final String INSERTAR = "INSERT INTO USUARIOS(contraseña, tipo,codigo ) VALUES(?,?,?)";
    private static final String BUSCAR_USUARIO = "SELECT * FROM USUARIOS WHERE contraseña = ? AND CODIGO = ?";

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

    /**
     * Buscar usuario por contraseña y código
     *
     * @param contraseña
     * @param codigo
     * @return
     */
    public Usuario buscarUsuario(String contraseña, String codigo) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            stmt = connection.prepareStatement(BUSCAR_USUARIO);
            stmt.setString(1, contraseña);
            stmt.setString(2, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(rs.getInt("ID"),
                        rs.getString("contraseña"),
                        rs.getString("tipo"),
                        rs.getString("codigo"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return usuario;
    }
}
