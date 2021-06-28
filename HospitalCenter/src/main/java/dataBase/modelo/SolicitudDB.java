/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class SolicitudDB {

    private static final Connection connection = Coneccion.getConeccion();
    private static final String INSERTAR = "INSERT INTO SOLICITUDES(nombre, sexo, fecha_nacimiento, dpi, telefono, peso, tipo_sangre, email, contraseña) VALUES(?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_SOLICITUD = "SELECT * FROM SOLICITUDES";
    private static final String SELECT_SOLICITUD_BY_ID ="SELECT * FROM SOLICITUDES WHERE ID = ?";

    public SolicitudDB() {
    }

    public void insertarSolicitud(Paciente paciente) throws SQLException {

        //PreparedStatement preSt = connection.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);
        PreparedStatement preSt = connection.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, paciente.getNombre());
        preSt.setString(2, paciente.getSexo());
        preSt.setDate(3, Date.valueOf(paciente.getFechaNacimiento()));
        preSt.setString(4, paciente.getDpi());
        preSt.setString(5, paciente.getTelefono());
        preSt.setString(6, paciente.getPeso());
        preSt.setString(7, paciente.getTipoSangre());
        preSt.setString(8, paciente.getEmail());
        preSt.setString(9, paciente.getContraseña());

        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }
    }

    public List<Paciente> getSolicitudes() {
        Connection conn = null;
        ResultSet res = null;
        Paciente paciente = null;
        List<Paciente> pacientes = new ArrayList<>();

        try {
            conn = Coneccion.getConeccion();
            PreparedStatement preStatement = conn.prepareStatement(SELECT_SOLICITUD);
            res = preStatement.executeQuery();
            while (res.next()) {
                int id = res.getInt("ID");
                String nombre = res.getString("nombre");
                String sexo = res.getString("sexo");
                String fechaNacimiento = res.getString("fecha_nacimiento");
                String dpi = res.getString("dpi");
                String telefono = res.getString("telefono");
                String peso = res.getString("peso");
                String tipoSangre = res.getString("tipo_sangre");
                String email = res.getString("email");
                String contraseña = res.getString("contraseña");

                paciente = new Paciente(nombre, sexo, fechaNacimiento, dpi, telefono, peso, tipoSangre, email, contraseña, id);

                pacientes.add(paciente);
                System.out.println("hola solicitudes");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            
        }

        return pacientes;
    }
    
    public Paciente buscarSolicitante(Paciente solicitante){
        Connection conn = null;
        ResultSet res = null;
        Paciente paciente = null;

        try {
            conn = connection;
            PreparedStatement preStatement = conn.prepareStatement(SELECT_SOLICITUD_BY_ID);
            preStatement.setInt(1, solicitante.getId());
            res = preStatement.executeQuery();
            while (res.next()) {
                int id = res.getInt("ID");
                String nombre = res.getString("nombre");
                String sexo = res.getString("sexo");
                String fechaNacimiento = res.getString("fecha_nacimiento");
                String dpi = res.getString("dpi");
                String telefono = res.getString("telefono");
                String peso = res.getString("peso");
                String tipoSangre = res.getString("tipo_sangre");
                String email = res.getString("email");
                String contraseña = res.getString("contraseña");

                paciente = new Paciente(nombre, sexo, fechaNacimiento, dpi, telefono, peso, tipoSangre, email, contraseña, id);

                System.out.println("hola solicitudes");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            
        }

        return paciente;
    }
}
