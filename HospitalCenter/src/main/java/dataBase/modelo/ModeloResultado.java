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
public class ModeloResultado {

    private static final Connection connection = Coneccion.getConeccion();

    public ModeloResultado() {
    }

    /**
     * Agregamos un resultado de un examen de laboratorio a la base de datos
     *
     * @param codigo
     * @param codigoPaciente
     * @param codigoMedico
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
            String codigoMedico,
            String codigoExamen,
            String codigoLaboratorista,
            String ordenPath,
            String informePath,
            String fecha,
            String hora
    ) throws SQLException {

        String query = "INSERT INTO RESULTADO(CODIGO, codigo_paciente, codigo_medico, codigo_examen, codigo_laboratorista, orden_path, informe_path, fecha, hora) VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, codigoPaciente);
        preSt.setString(3, codigoMedico);
        preSt.setString(4, codigoExamen);
        preSt.setString(5, codigoLaboratorista);
        preSt.setString(6, ordenPath);
        preSt.setString(7, informePath);
        preSt.setString(8, fecha);
        preSt.setString(9, hora);

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

}
