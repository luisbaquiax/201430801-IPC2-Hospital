/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class ModeloConsulta {

    private static Connection connection = Coneccion.getInstance();

    public ModeloConsulta() {
    }

    /**
     * Agregamos una consulta a la base de datos
     *
     * @param tipoConsulta
     * @param costo
     * @throws SQLException
     */
    public void agregarConsulta(
            String tipoConsulta,
            String costo
    ) throws SQLException {

        String query = "INSERT INTO CONSULTA (TIPO_CONSULTA, costo) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, tipoConsulta);
        preSt.setDouble(2, Double.parseDouble(costo));
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }
}
