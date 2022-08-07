/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.util;

import java.sql.*;

/**
 *
 * @author Daniel Murillo
 */
public class JDBCUtilities {
    //Atributos de clase para gestion de conexion con la base de datos
   
    private static final String database = "ProyectosConstruccion.db";
    //Class.forName("org.sqlite.JDBC");
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+database;
        return DriverManager.getConnection(url);
    }
}
