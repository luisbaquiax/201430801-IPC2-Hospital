/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloLaboratorista;
import dataBase.modelo.UsuarioDB;
import entidades.Usuario;
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
@WebServlet("/ControladorLaboratorista")
public class ControladorLaboratorista extends HttpServlet {

    private final ModeloLaboratorista laboratoristaDB;
    private final UsuarioDB usuarioDB;

    public ControladorLaboratorista() {
        this.laboratoristaDB = new ModeloLaboratorista();
        this.usuarioDB = new UsuarioDB();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "insertar":
                try {
                insertar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorLaboratorista.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("codigo del laboratorista ya exixtente");
                response.sendRedirect("/HospitalCenter/jsp/medico/infError.jsp");
            }
            break;

        }
    }

    private void insertar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String registro = request.getParameter("registro");
        String dpi = request.getParameter("dpi");
        String telefono = request.getParameter("telefono");
        String tipoExamen = request.getParameter("tipoExamen");
        String email = request.getParameter("email");
        String fechaInicioTrabajo = request.getParameter("fechaInicioTrabajo");
        String contraseña = request.getParameter("contraseña");
        String[] dias = request.getParameterValues("dia");

        this.laboratoristaDB.agregarLaboratorista(codigo, nombre, registro, dpi, telefono, tipoExamen, email, fechaInicioTrabajo, contraseña);
        for (String dia : dias) {
            System.out.println("DIA AGREGADO: " + dia);
            this.laboratoristaDB.agregarDiasTrabajoLaboratorista(dia, codigo);
        }
        this.usuarioDB.insertarUsuario(new Usuario(contraseña, Usuario.TIPO_LABORATORISTA, codigo));
        response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
    }

}
