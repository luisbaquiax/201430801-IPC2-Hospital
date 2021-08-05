/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import entidades.Paciente;
import entidades.Resultado;
import entidades.Usuario;
import entidades.carga.Archivo;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

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
//        try {
//            modeloResultado.agregarResultado("cod-res", "102641", 
//                    "MED-143099", 
//                    "123", 
//                    "LAB-123", 
//                    "ordenpath", 
//                    "sample4.pdf", 
//                    "2019-11-11", 
//                    "20:00");
//            System.out.println("ingresado");
//        } catch (SQLException ex) {
//            System.out.println("no ingresado"+ex.getMessage());
//        }
        Archivo archivo = new Archivo();
        try {
            archivo.cargarDatos();
        } catch (ParserConfigurationException | SAXException | IOException ex) {
        }
        for (Resultado result : archivo.getResultados()) {
            System.out.println(result.toString());
            try {
                
                modeloResultado.agregarResultado(result.getCodigo(), result.getCodigoPaciente(), result.getCodigoMedico(), result.getCodigoExamen(), result.getCodigoLaboratorista(), result.getOrdenPath(), result.getInformePath(), result.getFecha(), result.getHora());
            } catch (SQLException ex) {
                System.out.println("no ingresado " + ex.getMessage());
            }
        }

    }

}
