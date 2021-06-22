package com.hospital.DBconeccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author orlan
 */
public class Coneccion {

    private static Connection connection = null;
    private static Coneccion connectionDB;

    Coneccion() {
        String url = "jdbc:mysql://localhost:3306/HOSPITALCENTER?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Luis@basi1234";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("coneccion exisosa");

        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
            System.out.println("coneccion fallida");
        } catch (SQLException ex) {
            System.out.println("Error DB: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static Connection getConeccion() {
        if (connectionDB == null) {
            connectionDB = new Coneccion();
        }
        return connection;
    }
}
