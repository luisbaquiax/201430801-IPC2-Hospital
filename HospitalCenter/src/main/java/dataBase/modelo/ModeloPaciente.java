/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Paciente;
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
public class ModeloPaciente {

    private static Connection connection = Coneccion.getConeccion();
    private static final String SELECT_PACIENTE_BY_CODIGO_CONTRA = "SELECT * FROM PACIENTE WHERE CODIGO = ? AND contraseña = ?";

    public ModeloPaciente() {
    }

    /**
     * Agregamos un paciente a la base de datos
     *
     * @param codigo
     * @param nombre
     * @param sexo
     * @param fechaNacimiento
     * @param dpi
     * @param telefono
     * @param peso
     * @param tipoSangre
     * @param email
     * @param constrseña
     * @throws SQLException
     */
    public void agregarPaciente(String codigo,
            String nombre,
            String sexo,
            String fechaNacimiento,
            String dpi,
            String telefono,
            String peso,
            String tipoSangre,
            String email,
            String constrseña
    ) throws SQLException {

        String query = "INSERT INTO PACIENTE VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

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

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

    /**
     * Método que servirá para lista a todos los pacientes de la base de datos
     *
     * @return
     * @throws SQLException
     */
    public List<Paciente> listarPacientes() throws SQLException {
        String queryPacientes = "SELECT * FROM PACIENTE";
        PreparedStatement preSt = connection.prepareStatement(queryPacientes);
        ResultSet result = preSt.executeQuery();

        List<Paciente> pacientes = new LinkedList<>();

        while (result.next()) {
            pacientes.add(new Paciente(result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5),
                    result.getString(6),
                    result.getString(7),
                    result.getString(8),
                    result.getString(9),
                    result.getString(10))
            );

        }
        System.out.println("Usuarios: " + pacientes.size());
        return pacientes;
    }

    /**
     * Buscar paciente por codigo y contraseña
     *
     * @param codigo
     * @param contraseña
     * @return
     * @throws SQLException
     */
    public Paciente buscarPaciente(String codigo, String contraseña) throws SQLException {
        Paciente paciente = null;
        PreparedStatement pres = connection.prepareStatement(SELECT_PACIENTE_BY_CODIGO_CONTRA);
        pres.setString(1, codigo);
        pres.setString(2, contraseña);
        ResultSet result = pres.executeQuery();

        while (result.next()) {
            paciente = new Paciente(result.getString("CODIGO"),
                    result.getString("nombre"),
                    result.getString("sexo"),
                    result.getString("fecha_nacimiento"),
                    result.getString("dpi"),
                    result.getString("telefono"),
                    result.getString("peso"),
                    result.getString("tipo_sangre"),
                    result.getString("email"),
                    result.getString("contraseña"));
        }
        return paciente;
    }
}
