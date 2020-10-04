/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class ModeloExamnen {

    public ModeloExamnen() throws SQLException {
    }

    public void agregarExamen(Connection connection,
            String codigo,
            String nombre,
            boolean orden,
            String descripcion,
            String costo,
            String informe
    ) {

        String query = "INSERT INTO EXAMEN VALUES (?,?,?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, nombre);
            preSt.setBoolean(3, orden);
            preSt.setString(4, descripcion);
            preSt.setDouble(5, Double.parseDouble(costo));
            preSt.setString(6, informe);

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
