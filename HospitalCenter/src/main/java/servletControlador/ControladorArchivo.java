/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloAdministrador;
import entidades.carga.Archivo;
import entidades.Administrador;
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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
@WebServlet("/carga")
public class ControladorArchivo extends HttpServlet {

    private Archivo archivo;
    private final ModeloAdministrador modeloAdministrador;

    public ControladorArchivo() {
        this.modeloAdministrador = new ModeloAdministrador();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (modeloAdministrador.listarAdministradores().size() > 0) {
                response.sendRedirect("listo.jsp");
            } else {
                this.archivo = new Archivo();

                this.archivo.cargarDatos();
                this.archivo.subirDatos();
                HttpSession sesion = request.getSession();
                sesion.setAttribute("medicos", this.archivo.getMedicos());
                sesion.setAttribute("labs", this.archivo.getLaboratoristas());
                sesion.setAttribute("pacientes", this.archivo.getPacientes());
                sesion.setAttribute("examenes", this.archivo.getExamens());
                sesion.setAttribute("reportes", this.archivo.getReportes());
                sesion.setAttribute("resultados", this.archivo.getResultados());
                sesion.setAttribute("citas", this.archivo.getCitas());
                sesion.setAttribute("consultas", this.archivo.getConsultas());

                response.sendRedirect("infCarga.jsp");
            }

        } catch (ParserConfigurationException | SAXException | SQLException ex) {
            Logger.getLogger(ControladorArchivo.class.getName()).log(Level.SEVERE, null, ex);

        }
        //request.getRequestDispatcher("infCarga.jsp").forward(request, response);
    }

}
