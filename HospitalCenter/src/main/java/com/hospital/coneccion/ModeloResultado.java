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
public class ModeloResultado {

    public ModeloResultado() throws SQLException {
    }

    public void agregarResultado(Connection connection,
            String codigo,
            String codigoPaciente,
            String codigoExamen,
            String codigoLaboratorista,
            String ordenPath,
            String informePath,
            String fecha,
            String hora
    ) {

        String query = "INSERT INTO RESULTADO VALUES (?,?,?,?,?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, codigoPaciente);
            preSt.setString(3, codigoExamen);
            preSt.setString(4, codigoLaboratorista);
            preSt.setString(5, ordenPath);
            preSt.setString(6, informePath);
            preSt.setDate(7, Date.valueOf(fecha));
            preSt.setTime(8, Time.valueOf(hora));

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
