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
public class ModeloHistorialMedico {

    public ModeloHistorialMedico() throws SQLException {
    }

    public void agregarHistoryMedic(Connection connection,
            String codigoResultado,
            String codigoCita,
            String codigoPaciente
    ) {

        String query = "INSERT INTO HISTORIAL_MEDICO (codigo_resultado, codigo_cita, codigo_paciente) VALUES (?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigoResultado);
            preSt.setString(2, codigoCita);
            preSt.setString(3, codigoPaciente);

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
