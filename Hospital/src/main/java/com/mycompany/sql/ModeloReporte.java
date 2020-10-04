/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author luis
 */
public class ModeloReporte {
 
    public void agregarReporte(Connection connection,
            String codigo,
            String codigoPaciente,
            String codigoMedico,
            String informe,
            String fecha,
            String hora
    ) {

        String query = "INSERT INTO REPORTE VALUES (?,?,?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, codigoPaciente);
            preSt.setString(3, codigoMedico);
            preSt.setString(4, informe);
            preSt.setDate(5, Date.valueOf(fecha));
            preSt.setTime(6, Time.valueOf(hora));

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
