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
public class ModeloLaboratorista {

    private static Connection connection = Coneccion.getInstance();

    public ModeloLaboratorista() {
    }

    /**
     * Agregamos un laboratorista en la base de datos
     *
     * @param codigo
     * @param nombre
     * @param registro
     * @param dpi
     * @param telefono
     * @param tipoExamen
     * @param email
     * @param fechaInicioTrabajo
     * @param contraseña
     * @throws java.sql.SQLException
     */
    public void agregarLaboratorista(
            String codigo,
            String nombre,
            String registro,
            String dpi,
            String telefono,
            String tipoExamen,
            String email,
            String fechaInicioTrabajo,
            String contraseña
    ) throws SQLException {

        String query = "INSERT INTO LABORATORISTA VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, nombre);
        preSt.setString(3, registro);
        preSt.setString(4, dpi);
        preSt.setString(5, telefono);
        preSt.setString(6, tipoExamen);
        preSt.setString(7, email);
        preSt.setString(8, fechaInicioTrabajo);
        preSt.setString(9, contraseña);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

    /**
     * *
     * Agregamos los días de trabajo de un laboratorista
     *
     * @param dia
     * @param laboratorista
     * @throws SQLException
     */
    public void agregarDiasTrabajoLaboratorista(
            String dia,
            String laboratorista
    ) throws SQLException {

        String query = "INSERT INTO DIAS_TRABAJO (dia, laboratorista) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, dia);
        preSt.setString(2, laboratorista);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }
}
