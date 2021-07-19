/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase.modelo;

import dataBase.coneccion.Coneccion;
import entidades.Titulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ModeloTitulo {

    private static final Connection connection = Coneccion.getConeccion();
    private static final String SELECT_TITULOS = "SELECT * FROM TITULO WHERE codigo_medico = ?";
    private static final String UPDATE_ESPECIALIDAD = "UPDATE TITULO SET nombre_especialidad = ? WHERE ID = ?";
    private static final String SELECT_TITULO_BY_ID = "SELECT ID, codigo_medico, nombre_especialidad FROM TITULO WHERE ID = ? LIMIT 1";

    public ModeloTitulo() {
    }

    /**
     * Se agrega un titulo de medico a la base de datos
     *
     * @param nombreEspeciaidad
     * @param codigoMedico
     * @throws java.sql.SQLException
     */
    public void agregarTituloMedico(
            String nombreEspeciaidad,
            String codigoMedico
    ) throws SQLException {

        String query = "INSERT INTO TITULO (nombre_especialidad, codigo_medico) VALUES (?,?)";

        PreparedStatement preSt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preSt.setString(1, nombreEspeciaidad);
        preSt.setString(2, codigoMedico);
        preSt.executeUpdate();

        ResultSet result = preSt.getGeneratedKeys();
        if (result.first()) {
            result.getLong(1);
        }

    }

    /**
     * Titulos de un medico de acuerdo al código
     *
     * @param codigo
     * @return
     * @throws SQLException
     */
    public List<Titulo> titulosDeUnMedicos(String codigo) throws SQLException {
        PreparedStatement pres = connection.prepareStatement(SELECT_TITULOS);
        pres.setString(1, codigo);
        ResultSet result = pres.executeQuery();

        List<Titulo> titulos = new ArrayList<>();
        while (result.next()) {
            titulos.add(new Titulo(result.getInt("ID"),
                    result.getString("nombre_especialidad"),
                    result.getString("codigo_medico")));
        }
        return titulos;
    }

    /**
     * Actualiza titulo de un medico
     *
     * @param especialidad
     * @throws java.sql.SQLException
     */
    public void actualizarTitulo(String especialidad, int id) throws SQLException {
        PreparedStatement preS = null;
        int registros = 0;
        preS = connection.prepareStatement(UPDATE_ESPECIALIDAD);
        preS.setString(1, especialidad);
        preS.setInt(2, id);

        registros = preS.executeUpdate();
        //return registros;
    }

    /**
     * Search TITULO by ID in the database
     *
     * @param titulo
     * @return
     * @throws SQLException
     */
    public Titulo buscarTituloID(int titulo) throws SQLException {
        PreparedStatement statement = null;
        ResultSet res = null;
        Titulo buscado = null;

        statement = connection.prepareStatement(SELECT_TITULO_BY_ID);
        statement.setInt(1, titulo);
        res = statement.executeQuery();
        while (res.next()) {
            buscado = new Titulo(res.getInt("ID"),
                    res.getString("nombre_especialidad"),
                    res.getString("codigo_medico"));
        }
        return buscado;
    }
}
