/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.coneccion;

import com.hospital.entidades.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.*;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ModeloMedico {

    private Connection connection = Coneccion.getInstance();

    private final String MEDICOS = "SELECT * FROM " + Medico.NOMBRE;

    public ModeloMedico() throws SQLException {
    }

    /**
     * Se agrega un medico a la base de datos
     *
     * @param codigo
     * @param nombre
     * @param colegiado
     * @param dpi
     * @param telefono
     * @param email
     * @param horarioInicio
     * @param horarioFin
     * @param fechaInicioTrabajo
     * @param contraseña
     * @throws java.sql.SQLException
     */
    public void agregarMedico(
            String codigo,
            String nombre,
            String colegiado,
            String dpi,
            String telefono,
            String email,
            String horarioInicio,
            String horarioFin,
            String fechaInicioTrabajo,
            String contraseña
    ) throws SQLException {

        String query = "INSERT INTO MEDICO VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, codigo);
        preSt.setString(2, nombre);
        preSt.setString(3, colegiado);
        preSt.setString(4, dpi);
        preSt.setString(5, telefono);
        preSt.setString(6, email);
        preSt.setString(7, horarioInicio);
        preSt.setString(8, horarioFin);
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

        //return -1;
    }

    /**
     * Se agrega un titulo de medico a la base de datos
     *
     * @param nombreEspeciaidad
     * @param codigoMedico
     * @throws java.sql.SQLException
     */
    public void agregarTituloMedico(
            String nombreEspeciaidad,
            String codigoMedico
    ) throws SQLException {

        String query = "INSERT INTO TITULO (nombre_especialidad, codigo_medico) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, nombreEspeciaidad);
        preSt.setString(2, codigoMedico);
        preSt.executeUpdate();

    }

    public List<Medico> agregarBuscarMedicoPorNombre(
            String nombreEspeciaidad,
            String codigoMedico
    ) throws SQLException {

        String query = "INSERT INTO TITULO (nombre_especialidad, codigo_medico) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query);
        ResultSet resultado = preSt.executeQuery();
        
//        List<Medico> medicosNombre
//        while (resultado.next()) {            
//            
//        }
     return null;

    }

    public List<Medico> listarMedicos() throws SQLException {
        PreparedStatement preSt = connection.prepareStatement(MEDICOS);
        ResultSet result = preSt.executeQuery();

        List<Medico> medicos = new LinkedList<>();

        while (result.next()) {
            medicos.add(new Medico(result.getString(Medico.COL_CODIGO),
                    result.getString(Medico.COL_NOMBRE),
                    result.getString(Medico.COL_COLEGIADO),
                    result.getString(Medico.COL_DPI),
                    result.getString(Medico.COL_TELEFONO),
                    result.getString(Medico.COL_EMAIL),
                    result.getString(Medico.COL_HORARIO_INICIO),
                    result.getString(Medico.COL_HORARIO_FIN),
                    result.getString(Medico.COL_FECHA_INICO_TRABAJO),
                    result.getString(Medico.COL_CONTRASEÑA))
            );
        }
        System.out.println("Usuarios: " + medicos.size());
        return medicos;
    }
}
