/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.coneccion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author luis
 */
public class ModeloCita {

    public ModeloCita() {
    }

    public void agregarCita(Connection connection,
            String codigo,
            String codigoPaciente,
            String codigoMedico,
            String fecha,
            String hora
    ) {

        String query = "INSERT INTO CITA VALUES (?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, codigoPaciente);
            preSt.setString(3, codigoMedico);
            preSt.setDate(4, Date.valueOf(fecha));
            preSt.setTime(5, Time.valueOf(hora));

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
