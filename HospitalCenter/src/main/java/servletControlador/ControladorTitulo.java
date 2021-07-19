/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloTitulo;
import entidades.Titulo;
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
@WebServlet("/controladorTitulo")
public class ControladorTitulo extends HttpServlet {

    private ModeloTitulo modeloTitulo;

    public ControladorTitulo() {
        this.modeloTitulo = new ModeloTitulo();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "modificarEspecialidad":
                try {
                modificarEspecialidad(request, response);
            } catch (SQLException ex) {
            }
            break;
            default:
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "actualizar":
                try {
                actualizarEspecialidad(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTitulo.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            default:
        }
    }

    private void modificarEspecialidad(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("titulo"));
        System.out.println(id);
        Titulo buscado = this.modeloTitulo.buscarTituloID(id);
        request.getSession().setAttribute("titulo", buscado);
        response.sendRedirect("/HospitalCenter/jsp/medico/ModificarEspecialidad.jsp");
    }

    private void actualizarEspecialidad(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombreEspecialidad = request.getParameter("titulo");
        this.modeloTitulo.actualizarTitulo(nombreEspecialidad, id);
        response.sendRedirect("/HospitalCenter/jsp/medico/listaMedicos.jsp");
    }
}
