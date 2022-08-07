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