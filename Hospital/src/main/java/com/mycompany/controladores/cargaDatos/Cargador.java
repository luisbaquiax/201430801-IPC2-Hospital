/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controladores.cargaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author luis
 */
public class Cargador {

    public void cargarDatos() {

        JFileChooser seleccionar = new JFileChooser();

        int selecionado = seleccionar.showOpenDialog(null);

        if (selecionado == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();

            try {
                FileReader leerArchivo = new FileReader(archivo.getAbsoluteFile());

                BufferedReader leyendo = new BufferedReader(leerArchivo);//para leer linea por linea

                String linea = "";

                String datos = "";

                while (leyendo.ready()) {
                    linea = leyendo.readLine();
                    datos += linea + "\n";
                    System.out.println(linea);

                }

            } catch (IOException ex) {

            }
        }

    }

}
