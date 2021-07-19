/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloPaciente;
import dataBase.modelo.SolicitudDB;
import dataBase.modelo.UsuarioDB;
import entidades.Paciente;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author luis
 */
@WebServlet("/ControladorPaciente")
public class ControladorPaciente extends HttpServlet {

    private ModeloPaciente modeloPaciente;
    private SolicitudDB solicitudDB;
    private UsuarioDB usuarioDB;

    public ControladorPaciente() {
        this.modeloPaciente = new ModeloPaciente();
        this.solicitudDB = new SolicitudDB();
        this.usuarioDB = new UsuarioDB();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("tarea");
        switch (accion) {
            case "editarSolicitud":
                editarSolicitud(request, response);
                break;
            case "edicion": {
                try {
                    agregarPaciente(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            default:
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("tarea");
        switch (accion) {
            case "enviar": 
                try {
                enviarSolicitud(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                System.out.println("falló el envio de la solicitud");
            }
            break;
            case "agregarPaciente": {
                try {
                    agregarPaciente(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            default:
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
        SolicitudDB solicitudBas = new SolicitudDB();
        HttpSession sesion = request.getSession();
        solicitudBas.insertarSolicitud(solicitante);
        response.sendRedirect("index.jsp");
    }

    private void editarSolicitud(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Paciente solicitante = this.solicitudDB.buscarSolicitante(new Paciente(id));
        if (solicitante != null) {
            request.getSession().setAttribute("solicitud", solicitante);
            response.sendRedirect("/HospitalCenter/jsp/admin/edicionSolicitud.jsp");
        } else {
            response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
        }

    }

    private void agregarPaciente(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Paciente solicitante = this.solicitudDB.buscarSolicitante(new Paciente(id));
        String codigo = request.getParameter("codigo");

        this.modeloPaciente.agregarPaciente(codigo,
                solicitante.getNombre(),
                solicitante.getSexo(),
                solicitante.getFechaNacimiento(),
                solicitante.getDpi(),
                solicitante.getTelefono(),
                solicitante.getPeso(),
                solicitante.getTipoSangre(),
                solicitante.getEmail(),
                solicitante.getContraseña());
        this.usuarioDB.insertarUsuario(new Usuario(solicitante.getContraseña(), Usuario.TIPO_PACIENTE, codigo));
        response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
    }
}
