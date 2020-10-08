/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controladores.cargaDatos;

import com.hospital.coneccion.ModeloAdministrador;
import com.hospital.coneccion.ModeloCita;
import com.hospital.coneccion.ModeloConsulta;
import com.hospital.coneccion.ModeloExamnen;
import com.hospital.coneccion.ModeloHistorialMedico;
import com.hospital.coneccion.ModeloLaboratorista;
import com.hospital.coneccion.ModeloMedico;
import com.hospital.coneccion.ModeloPaciente;
import com.hospital.coneccion.ModeloReporte;
import com.hospital.coneccion.ModeloResultado;
import com.hospital.coneccion.ModeloTitulo;
import com.hospital.controladores.ControladorAministrador;
import com.hospital.entidades.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
@WebServlet("/CargaDatos")
public class ControladorCargaDatos extends HttpServlet {

    private List<String> errores = new ArrayList<>();
    private Archivo carga = new Archivo((ArrayList<String>) errores);

    private ModeloAdministrador administrador = new ModeloAdministrador();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("hola aqui tratando de cargar datos");
        try {
            String tamaño = "0";
            if (administrador.listarAdministradores().size() < 0) {
                carga.cargarDatos();
                tamaño = "ya";
                request.setAttribute("tamano", tamaño);
            } else {
                tamaño = "0";
                request.setAttribute("tamano", tamaño);
            }
            request.getRequestDispatcher("/infCarga.jsp").forward(request, response);
        } catch (IOException | ServletException | ParserConfigurationException | SAXException e) {
            System.out.println("fallo la carga de datos");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
