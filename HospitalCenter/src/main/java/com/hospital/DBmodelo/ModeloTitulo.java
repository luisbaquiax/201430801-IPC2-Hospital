/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.DBmodelo;

import com.hospital.DBconeccion.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class ModeloTitulo {

    private static Connection connection = Coneccion.getConeccion();

    public ModeloTitulo() {
    }

    /**
     * Se agrega un titulo de medico a la base de datos
     *
     * @param nombreEspeciaidad
     * @param codigoMedico
     * @throws java.sql.SQLException
     */
    public void agregarTituloMedico(
            String nombreEspeciaidad,
            String codigoMedico
    ) throws SQLException {

        String query = "INSERT INTO TITULO (nombre_especialidad, codigo_medico) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, nombreEspeciaidad);
        preSt.setString(2, codigoMedico);
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }

}
