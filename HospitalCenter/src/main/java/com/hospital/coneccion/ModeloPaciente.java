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
public class ModeloPaciente {

    public ModeloPaciente() throws SQLException {
    }

    public void agregarPaciente(Connection connection,
            String codigo,
            String nombre,
            String sexo,
            String fechaNacimiento,
            String dpi,
            String telefono,
            String peso,
            String tipoSangre,
            String email,
            String constrseña
    ) {

        String query = "INSERT INTO PACIENTE VALUES (?,?,?,?,?,?,?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, nombre);
            preSt.setString(3, sexo);
            preSt.setString(4, fechaNacimiento);
            preSt.setString(5, dpi);
            preSt.setString(6, telefono);
            preSt.setString(7, peso);
            preSt.setString(8, tipoSangre);
            preSt.setString(9, email);
            preSt.setString(10, constrseña);

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
