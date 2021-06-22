/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.DBmodelo;

import com.hospital.DBconeccion.Coneccion;
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
public class ModeloResultado {

    private static final Connection connection = Coneccion.getConeccion();

    public ModeloResultado() {
    }

    /**
     * Agregamos un resultado de un examen de laboratorio a la base de datos
     *
     * @param codigo
     * @param codigoPaciente
     * @param codigoExamen
     * @param codigoLaboratorista
     * @param ordenPath
     * @param informePath
     * @param fecha
     * @param hora
     * @throws SQLException
     */
    public void agregarResultado(String codigo,
            String codigoPaciente,
            String codigoExamen,
            String codigoLaboratorista,
            String ordenPath,
            String informePath,
            String fecha,
            String hora
    ) throws SQLException {

        String query = "INSERT INTO RESULTADO VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, codigoPaciente);
        preSt.setString(3, codigoExamen);
        preSt.setString(4, codigoLaboratorista);
        preSt.setString(5, ordenPath);
        preSt.setString(6, informePath);
        preSt.setString(7, fecha);
        preSt.setString(8, hora);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

}
