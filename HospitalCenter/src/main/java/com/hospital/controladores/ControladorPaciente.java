/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controladores;

import com.hospital.coneccion.ModeloPaciente;
import com.hospital.entidades.Paciente;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis
 */
@WebServlet("/ControladorPaciente")
public class ControladorPaciente extends HttpServlet {

    private ModeloPaciente modeloPaciente = new ModeloPaciente();
    private Paciente paciente;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        paciente = new Paciente(request.getParameter("codigo"),
                request.getParameter("nombre"),
                request.getParameter("sexo"),
                request.getParameter("fechaNacimiento"),
                request.getParameter("dpi"),
                request.getParameter("telefono"),
                request.getParameter("peso"),
                request.getParameter("sangre"),
                request.getParameter("email"),
                request.getParameter("contraseña"));
        try {
            modeloPaciente.agregarPaciente(paciente.getCodigo(),
                    paciente.getNombre(),
                    paciente.getSexo(),
                    paciente.getFechaNacimiento(),
                    paciente.getDpi(),
                    paciente.getTelefono(),
                    paciente.getPeso(),
                    paciente.getTipoSangre(),
                    paciente.getEmail(),
                    paciente.getContraseña());

        } catch (SQLException e) {
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
