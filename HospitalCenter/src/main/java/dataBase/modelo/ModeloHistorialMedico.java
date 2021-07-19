/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.HistorialMedico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ModeloHistorialMedico {

    private static Connection connection = Coneccion.getConeccion();
    /**
     * SELECT HISTORIAL_MEDICO FORM DATABASE
     */
    private static String SELECT = "SELECT * FROM HISTORIAL_MEDICO";

    public ModeloHistorialMedico() {
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

    /**
     * Select from database the Medic Histories
     *
     * @return
     * @throws SQLException
     */
    public List<HistorialMedico> getHistorialMedicos() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(SELECT);
        ResultSet res = statement.executeQuery();

        List<HistorialMedico> historiales = new LinkedList<>();
        while (res.next()) {
            historiales.add(new HistorialMedico(res.getInt("ID"),
                    res.getString("codigo_resultado"),
                    res.getString("codigo_cita"),
                    res.getString("codigo_paciente")));
        }
        return historiales;
    }
}
