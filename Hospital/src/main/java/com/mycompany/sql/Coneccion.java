/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class Coneccion {

//    private String url = "jdbc:mysql://localhost:3306/HOSPITAL?useSSL=false&serverTimezone=UTC";
//    private String user = "userHospital";
//    private String password = "userHospital.123";

    private static Connection connection = null;
    private static Coneccion coneccion;

    public Coneccion() {
        String url = "jdbc:mysql://localhost:3306/HOSPITAL?useSSL=false&serverTimezone=UTC";
        String user = "userHospital";
        String password = "userHospital.123";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Error DB: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (coneccion == null) {
            coneccion = new Coneccion();
        }
        return connection;
    }
}
