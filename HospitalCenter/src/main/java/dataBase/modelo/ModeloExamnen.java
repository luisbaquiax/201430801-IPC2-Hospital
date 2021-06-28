/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luis
 */
public class ModeloExamnen {

    private static Connection connection = Coneccion.getConeccion();

    public ModeloExamnen() {
    }

    /**
     * *
     * Agreamos un examen a la base de datos
     *
     * @param codigo
     * @param nombre
     * @param orden
     * @param descripcion
     * @param costo
     * @param informeTipo
     * @throws java.sql.SQLException
     */
    public void agregarExamen(
            String codigo,
            String nombre,
            boolean orden,
            String descripcion,
            String costo,
            String informeTipo
    ) throws SQLException {

        String query = "INSERT INTO EXAMEN VALUES (?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, nombre);
        preSt.setBoolean(3, orden);
        preSt.setString(4, descripcion);
        preSt.setDouble(5, Double.parseDouble(costo));
        preSt.setString(6, informeTipo);

        preSt.executeUpdate();

    }
}
