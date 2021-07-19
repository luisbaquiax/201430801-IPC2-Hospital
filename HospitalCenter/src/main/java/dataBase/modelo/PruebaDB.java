/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import entidades.Paciente;
import entidades.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        UsuarioDB usuarioDB = new UsuarioDB();
//        Usuario usuario = usuarioDB.buscarUsuario("luis", "admin");
//        System.out.println(usuario.getCodigo());
//        System.out.println(usuario.getContraseña());
//        System.out.println(usuario.getTipo());
        ModeloResultado modeloResultado = new ModeloResultado();
        try {
            modeloResultado.agregarResultado("adf", "232018", 
                    "MED-115035", 
                    "555", 
                    "LAB-253", 
                    "", 
                    "sample4.pdf", 
                    "2019-11-11", 
                    "20:00");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
