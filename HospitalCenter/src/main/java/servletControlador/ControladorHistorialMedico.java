/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletControlador;

import dataBase.modelo.ModeloHistorialMedico;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis
 */
@WebServlet("/controladorHistorial")
public class ControladorHistorialMedico extends HttpServlet {
    
    private ModeloHistorialMedico historialMedico;

    public ControladorHistorialMedico() {
        this.historialMedico = new ModeloHistorialMedico();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String tarea = request.getParameter("tarea");
        switch (tarea) {
            case "verHistorial":
                break;
            default:
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        
    }
    
    private void verHistorialMedico(HttpServletRequest request, HttpServletResponse response){
        
    }
}
