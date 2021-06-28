/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class ModeloHistorialMedico {

    private static Connection connection = Coneccion.getConeccion();

    public ModeloHistorialMedico(){
    }

    /**
     * Agregamos un historial medico a la base de datos
     *
     * @param codigoResultado
     * @param codigoCita
     * @param codigoPaciente
     * @throws SQLException
     */
    public void agregarHistoryMedic(
            String codigoResultado,
            String codigoCita,
            String codigoPaciente
    ) throws SQLException {

        String query = "INSERT INTO HISTORIAL_MEDICO (codigo_resultado, codigo_cita, codigo_paciente) VALUES (?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigoResultado);
        preSt.setString(2, codigoCita);
        preSt.setString(3, codigoPaciente);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }
}
