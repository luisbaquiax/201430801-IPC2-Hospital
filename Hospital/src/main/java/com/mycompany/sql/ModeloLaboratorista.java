/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class ModeloLaboratorista {

    public ModeloLaboratorista() throws SQLException {
    }

    public void agregarLaboratorista(Connection connection,
            String codigo,
            String nombre,
            String registro,
            String dpi,
            String telefono,
            String tipoExamen,
            String email,
            String fechaInicioTrabajo,
            String contraseña
    ) {

        String query = "INSERT INTO LABORATORISTA VALUES (?,?,?,?,?,?,?,?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, codigo);
            preSt.setString(2, nombre);
            preSt.setString(3, registro);
            preSt.setString(4, dpi);
            preSt.setString(5, telefono);
            preSt.setString(6, tipoExamen);
            preSt.setString(7, email);
            preSt.setString(8, fechaInicioTrabajo);
            preSt.setString(9, contraseña);

            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }

    public void agregarDiasTrabajoLaboratorista(Connection connection,
            String dia,
            String laboratorista
    ) {

        String query = "INSERT INTO DIAS_TRABAJO (dia, laboratorista) VALUES (?,?)";

        try ( PreparedStatement preSt = connection.prepareStatement(query)) {

            preSt.setString(1, dia);
            preSt.setString(2, laboratorista);
            preSt.executeUpdate();

        } catch (SQLException e) {

        }
    }
}
