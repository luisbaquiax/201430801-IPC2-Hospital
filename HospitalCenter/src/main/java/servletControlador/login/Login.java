/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador.login;

import dataBase.modelo.ModeloAdministrador;
import dataBase.modelo.ModeloLaboratorista;
import dataBase.modelo.ModeloMedico;
import dataBase.modelo.ModeloPaciente;
import dataBase.modelo.UsuarioDB;
import entidades.Administrador;
import entidades.Laboratorista;
import entidades.Medico;
import entidades.Paciente;
import entidades.Usuario;
import hospitalCenter.excepcion.ExcepcionHospital;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

    private UsuarioDB usuarioDB;
    private ModeloAdministrador modeloAdministrador;
    private ModeloPaciente pacienteDB;
    private ModeloMedico medicoDB;
    private ModeloLaboratorista laboratoristaDB;

    public Login() {
        this.usuarioDB = new UsuarioDB();
        this.modeloAdministrador = new ModeloAdministrador();
        this.pacienteDB = new ModeloPaciente();
        this.medicoDB = new ModeloMedico();
        this.laboratoristaDB = new ModeloLaboratorista();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.getRequestDispatcher("/administracion.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            System.out.println("Login Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String codigo = request.getParameter("usuario");
            String password = request.getParameter("contra");
            //buscamos al usuario
            Usuario usuario = this.usuarioDB.buscarUsuario(password, codigo);
            if (usuario != null) {
                if (usuario.getTipo().equals(Usuario.TIPO_ADMINISTRADOR)) {
                    Administrador administrador = modeloAdministrador.buscarAdministrador(codigo, password);

                    if (administrador != null) {
                        System.out.println("admin elegido " + administrador.toString());
                        request.getSession().setAttribute("administrador", administrador);
                        response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
                    } else {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                } else if (usuario.getTipo().equals(Usuario.TIPO_LABORATORISTA)) {
                    Laboratorista laboratorista = this.laboratoristaDB.buscarLaboratorista(password, codigo);
                    if (laboratorista != null) {
                        request.getSession().setAttribute("laboratorista", laboratorista);
                        response.sendRedirect("/HospitalCenter/jsp/laboratorista/perfilLaboratorista.jsp");
                    } else {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                } else if (usuario.getTipo().equals(Usuario.TIPO_MEDICO)) {
                    Medico medico = this.medicoDB.buscarMedico(codigo, password);
                    if (medico != null) {
                        request.getSession().setAttribute("medico", medico);
                        response.sendRedirect("/HospitalCenter/jsp/medico/Medico.jsp");
                    } else {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                } else if (usuario.getTipo().equals(Usuario.TIPO_PACIENTE)) {
                    Paciente paciente = this.pacienteDB.buscarPaciente(codigo, password);
                    if (paciente != null) {
                        request.getSession().setAttribute("paciente", paciente);
                        response.sendRedirect("/HospitalCenter/jsp/paciente/perfilPaciente.jsp");
                    } else {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                }
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } catch (SQLException | IOException | NumberFormatException e) {
            System.out.println("Login Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
