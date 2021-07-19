/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloExamnen;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis
 */
@WebServlet("/controladorExamen")
public class ControladorExamen extends HttpServlet {

    private ModeloExamnen modeloExamnen;

    public ControladorExamen() {
        this.modeloExamnen = new ModeloExamnen();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "nuevo": {
                try {
                    agrearNuevoExamen(request, response);
                } catch (SQLException ex) {
                    String mensaje = "El codigo del examen ya existe.";
                    request.getSession().setAttribute("mensaje", mensaje);
                    response.sendRedirect("/HospitalCenter/jsp/mensaje.jsp");
                }
            }
            break;

            default:
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    private void agrearNuevoExamen(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombreExamen");
        String orden = request.getParameter("orden");
        String descripcion = request.getParameter("descripcion");
        String costo = request.getParameter("costo");
        String informeTipo = request.getParameter("formato");
        this.modeloExamnen.agregarExamen(codigo, nombre, Boolean.parseBoolean(orden), descripcion, costo, informeTipo);
        String mensaje = "Examen agregado";
        request.getSession().setAttribute("mensaje", mensaje);
        response.sendRedirect("/HospitalCenter/jsp/mensaje.jsp");
    }
}
