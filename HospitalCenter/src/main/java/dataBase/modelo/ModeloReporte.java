/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

/**
 *
 * @author luis
 */
public class ModeloReporte {

    private static Connection connection = Coneccion.getConeccion();

    public ModeloReporte() {
    }

    /**
     * Agrega un reporte a la base de datos
     *
     * @param codigo
     * @param codigoPaciente
     * @param codigoMedico
     * @param informe
     * @param fecha
     * @param hora
     */
    public void agregarReporte(String codigo,
            String codigoPaciente,
            String codigoMedico,
            String informe,
            String fecha,
            String hora
    ) throws SQLException {

        String query = "INSERT INTO REPORTE VALUES (?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, codigoPaciente);
        preSt.setString(3, codigoMedico);
        preSt.setString(4, informe);
        preSt.setString(5, fecha);
        preSt.setString(6, hora);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }
}
