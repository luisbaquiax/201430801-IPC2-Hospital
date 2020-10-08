/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controladores;

import com.hospital.coneccion.ModeloAdministrador;
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
@WebServlet("/ControladorAministrador")
public class ControladorAministrador extends HttpServlet {

     ModeloAdministrador adminModel = new ModeloAdministrador();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            adminModel.agregarAdministrador("codigo admin", "dpi3", "admin6", "luis123");
        } catch (SQLException ex) {
            System.out.println("el error es este"+ex.getMessage());
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String profesion = request.getParameter("profesion");
        String pass = request.getParameter("pass");
        if (nombre != null && profesion != null && pass != null) {
//                long id = usuarioModel.agregarUsuario(new Usuario(0, nombre, profesion, pass));
//                System.out.println("New ID: " + id);
//                response.sendRedirect(request.getContextPath() + "/ControladorUsuario");
        }

    }
}
