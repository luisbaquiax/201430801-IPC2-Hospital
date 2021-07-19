/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador.login;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis
 */
@WebServlet("/salir")
public class Salir extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        if (request.getSession().getAttribute("administrador") != null) {
//            request.getSession().removeAttribute("administrador");
//            //se invalida la sesion === cerrar sesion
//            request.getSession().invalidate();
//        }
//        if (request.getSession().getAttribute("laboratorista") != null) {
//            request.getSession().removeAttribute("laboratorista");
//            //se invalida la sesion === cerrar sesion
//            request.getSession().invalidate();
//        }
//        if (request.getSession().getAttribute("medico") != null) {
//            request.getSession().removeAttribute("medico");
//            //se invalida la sesion === cerrar sesion
//            request.getSession().invalidate();
//        }
//        if (request.getSession().getAttribute("paciente") != null) {
//            request.getSession().removeAttribute("paciente");
//            request.getSession().invalidate();
//        }
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
