/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class ModeloConsulta {

    public ModeloConsulta() throws SQLException {
    }

    public void agregarConsulta(Connection connection,
            String tipoConsulta,
            String costo
    ) {

        String query = "INSERT INTO CONSULTA (TIPO_CONSULTA, costo) VALUES (?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, tipoConsulta);
            preSt.setDouble(2, Double.parseDouble(costo));

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
