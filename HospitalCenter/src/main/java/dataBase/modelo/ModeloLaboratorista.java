/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Laboratorista;
import hospitalCenter.excepcion.ExcepcionHospital;
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

    private final static Connection connection = Coneccion.getConeccion();
    private static final String SELECT_LABORATORISTA_BY_CODIGO_CONTRA = "SELECT * FROM LABORATORISTA WHERE CODIGO = ? AND contraseña = ?";

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
     * @param dia jornada
     * @param laboratorista codigo del laboratorista
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

    /**
     * Busca el laboratorista por codigo y contraseña
     *
     * @param contraseña
     * @param codigo
     * @return
     * @throws SQLException
     */
    public Laboratorista buscarLaboratorista(String contraseña, String codigo) throws SQLException {
        PreparedStatement statement = null;
        ResultSet res = null;
        Laboratorista laboratorista = null;

        statement = connection.prepareStatement(SELECT_LABORATORISTA_BY_CODIGO_CONTRA);
        statement.setString(1, codigo);
        statement.setString(2, contraseña);
        res = statement.executeQuery();

        while (res.next()) {
            laboratorista = new Laboratorista(
                    res.getString("CODIGO"),
                    res.getString("nombre"),
                    res.getString("registro"),
                    res.getString("dpi"),
                    res.getString("telefono"),
                    res.getString("tipo_examen"),
                    res.getString("email"),
                    res.getString("fecha_inicio_trabajo"),
                    res.getString("contraseña"));
        }

        return laboratorista;
    }
}
