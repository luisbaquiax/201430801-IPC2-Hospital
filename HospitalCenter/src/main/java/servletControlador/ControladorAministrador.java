/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.SolicitudDB;
import entidades.Administrador;
import entidades.Paciente;
import java.io.IOException;
import java.util.List;
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

    private final SolicitudDB solicitudDB;

    public ControladorAministrador() {
        this.solicitudDB = new SolicitudDB();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        if (tarea != null) {
            if (tarea.equalsIgnoreCase("mostrar")) {
                System.out.println("enviado las solicitudes");
                List<Paciente> solicitantes = this.solicitudDB.getSolicitudes();
                request.getSession().setAttribute("solicitudes", solicitantes);
                response.sendRedirect("/HospitalCenter/jsp/admin/listaAdmin.jsp");
            } else if (tarea.equals("perfil")) {
                Administrador administrador = (Administrador) request.getSession().getAttribute("administrador");
                request.getSession().setAttribute("admin", administrador);
                response.sendRedirect("/HospitalCenter/jsp/admin/miPerfil.jsp");
            }
        } else {
            response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //response.sendRedirect("/HospitalCenter/jsp/admin/perfilAdmin.jsp");
    }
}
