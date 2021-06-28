/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import entidades.Paciente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class PruebaDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SolicitudDB solicitudDB = new SolicitudDB();
        List<Paciente> solicitudes = solicitudDB.getSolicitudes();
        for (Paciente solicitude : solicitudes) {
            System.out.println(solicitude.toString());
        }
    }
    
}
