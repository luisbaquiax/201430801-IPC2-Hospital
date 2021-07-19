/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloMedico;
import dataBase.modelo.ModeloTitulo;
import dataBase.modelo.UsuarioDB;
import entidades.Medico;
import entidades.Titulo;
import entidades.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet("/controladorMedico")
public class ControladorMedico extends HttpServlet {

    private ModeloMedico modeloMedico;
    private ModeloTitulo modeloTitulo;
    private UsuarioDB usuarioDB;

    public ControladorMedico() {
        this.modeloMedico = new ModeloMedico();
        this.usuarioDB = new UsuarioDB();
        this.modeloTitulo = new ModeloTitulo();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "medicos": 
                try {
                listarMedicos(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "modificar":
                try {
                modificarMedicoHorario(request, response);
            } catch (SQLException ex) {
                String mensaje = "No se pudo modificar, los sentimos!!!";
                request.getSession().setAttribute("mensaje", mensaje);
                response.sendRedirect("/HospitalCenter/jsp/mensaje.jsp");
            }
            break;
            case "especialidad":
                try {
                verEspecialidades(request, response);
            } catch (SQLException ex) {

            }
            break;
            case "perfil":
                
                break;
            default:
                response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "insertar":
                try {
                insertar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("codigo del médio ya exixtente");
                response.sendRedirect("/HospitalCenter/jsp/medico/infError.jsp");
            }
            break;
            case "actualizarHorario":
                try {
                actualizarHorario(request, response);
            } catch (SQLException ex) {
                String mensaje = "No se pudo actualizar el horario del medico, lo sentimos!!!";
                request.getSession().setAttribute("mensaje", mensaje);
                response.sendRedirect("/HospitalCenter/jsp/mensaje.jsp");
            }
            break;
            case "":
                break;
            default:
                response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
        }
    }

    private void insertar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String colegiado = request.getParameter("colegiado");
        String dpi = request.getParameter("dpi");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String horarioInicio = request.getParameter("horarioInicio");
        String horarioFin = request.getParameter("horarioFin");
        String fechaInicioTrabajo = request.getParameter("fechaInicioTrabajo");
        String contraseña = request.getParameter("contraseña");
        String especialidad = request.getParameter("especialidad");
        this.modeloMedico.agregarMedico(codigo, nombre, colegiado, dpi, telefono, email, horarioInicio, horarioFin, fechaInicioTrabajo, contraseña);
        this.modeloTitulo.agregarTituloMedico(especialidad, codigo);
        this.usuarioDB.insertarUsuario(new Usuario(contraseña, Usuario.TIPO_MEDICO, codigo));
        String mensaje = "MEDICO AGREGADO EXITOSAMENTE";
        request.getSession().setAttribute("mensaje", mensaje);
        response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
    }

    private void listarMedicos(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        request.getSession().setAttribute("medicos", this.modeloMedico.listarMedicos());
        response.sendRedirect("/HospitalCenter/jsp/medico/listaMedicos.jsp");
    }

    private void modificarMedicoHorario(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String codigo = request.getParameter("doctor");
        Medico medico = (Medico) this.modeloMedico.buscarMedico(codigo);
        System.out.println(medico.toString());
        request.getSession().setAttribute("medico", medico);

        response.sendRedirect("/HospitalCenter/jsp/medico/editarMedico.jsp");
    }

    private void actualizarHorario(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String codigoMedico = request.getParameter("codigo");
        String horaInicio = request.getParameter("horarioInicio");
        String horaFin = request.getParameter("horarioFin");

        this.modeloMedico.cambiarHorarioMedico(horaInicio, horaFin, codigoMedico);
        response.sendRedirect("/HospitalCenter/jsp/admin/administracion.jsp");
    }

    private void verEspecialidades(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String codigo = request.getParameter("doctor");
        ArrayList<Titulo> titulos = (ArrayList<Titulo>) this.modeloTitulo.titulosDeUnMedicos(codigo);
        for (Titulo titulo : titulos) {
            System.out.println(titulo.toString());
        }
        Medico medico = (Medico) this.modeloMedico.buscarMedico(codigo);
        request.getSession().setAttribute("medico", medico);
        request.getSession().setAttribute("titulos", titulos);
        response.sendRedirect("/HospitalCenter/jsp/medico/Especialidades.jsp");
    }
    
  
}
