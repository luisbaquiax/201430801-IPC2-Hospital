/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloPaciente;
import dataBase.modelo.SolicitudDB;
import entidades.Paciente;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        switch (accion) {
            case "enviar": {
                try {
                    enviarSolicitud(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getMessage());
                    System.out.println("falló el envio de la solicitud");
                }
            }
            break;
            case "editarSolicitud":
                
                break;
        }

    }

    private void enviarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("sexo");
        String fechaNacimiento = request.getParameter("birthday");
        String dpi = request.getParameter("dpi");
        String telefono = request.getParameter("telefono");
        String peso = request.getParameter("peso");
        String tipoSangre = request.getParameter("sangre");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("contraseña");
        Paciente solicitante = new Paciente(nombre, sexo, fechaNacimiento, dpi, telefono, peso, tipoSangre, email, contraseña);
        System.out.println(solicitante.toString());
        SolicitudDB solicitudDB = new SolicitudDB();
        HttpSession sesion = request.getSession();

        solicitudDB.insertarSolicitud(solicitante);
        response.sendRedirect("index.jsp");
    }

    private void editarSolicitud(HttpServletRequest request, HttpServletResponse response) {
        Paciente paciente = request.getParameter("");
    }
}
