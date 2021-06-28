/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador.login;

import dataBase.modelo.ModeloAdministrador;
import entidades.Administrador;
import entidades.Laboratorista;
import entidades.Medico;
import entidades.Paciente;
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
@WebServlet("/Login")
public class Login extends HttpServlet {

    private Administrador administrador;
    private Paciente paciente;
    private Laboratorista laboratorista;
    private Medico medico;
    private ModeloAdministrador modeloAdministrador = new ModeloAdministrador();

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

            administrador = modeloAdministrador.buscarAdministrador(codigo, password);

            if (administrador != null) {
                System.out.println("admin elegido " + administrador.toString());
                request.getSession().setAttribute("administrador", administrador);
                response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (SQLException | IOException | NumberFormatException e) {
            System.out.println("Login Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
