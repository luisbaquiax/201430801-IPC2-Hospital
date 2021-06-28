/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ModeloMedico {

    private Connection connection = Coneccion.getConeccion();

    private final String MEDICOS = "SELECT * FROM " + Medico.NOMBRE;

    public ModeloMedico() {
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
            String contraseña) throws SQLException {

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
         preSt.setString(9, fechaInicioTrabajo);
        preSt.setString(10, contraseña);
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

        //return -1;
    }

    /**
     * Busca un medico por el nombre en la base de datos
     *
     * @param nombreMedico
     * @return
     * @throws SQLException
     */
    public List<Medico> buscarMedicosPorNombre(
            String nombreMedico
    ) throws SQLException {

        String query = "SELECT * FROM MEDICO C WHERE C.nombre LIKE '%" + nombreMedico + "%';";

        PreparedStatement preSt = connection.prepareStatement(query);
        ResultSet result = preSt.executeQuery();

        List<Medico> medicosNombre = new ArrayList<>();
        while (result.next()) {
            medicosNombre.add(new Medico(result.getString(Medico.COL_CODIGO),
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
        return medicosNombre;

    }

    /**
     * Método para lista a todos los médicos por codigo
     *
     * @param codigoMedico
     * @return
     * @throws SQLException
     */
    public List<Medico> buscarMedicosPorCodigo(
            String codigoMedico
    ) throws SQLException {

        String query = "SELECT * FROM MEDICO C WHERE C.nombre LIKE '%" + codigoMedico + "%';";

        PreparedStatement preSt = connection.prepareStatement(query);
        ResultSet result = preSt.executeQuery();

        List<Medico> medicosNombre = new ArrayList<>();
        while (result.next()) {
            medicosNombre.add(new Medico(result.getString(Medico.COL_CODIGO),
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
        return medicosNombre;

    }

    /**
     * Método que servirá para listar a todos los médicos de la base de datos
     *
     * @return
     * @throws SQLException
     */
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
