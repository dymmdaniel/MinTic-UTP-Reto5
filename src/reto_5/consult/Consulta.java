/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.consult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import reto_5.util.JDBCUtilities;

/**
 *
 * @author Daniel Murillo
 */
public class Consulta {

    private String consulta1 = "SELECT id_lider,nombre,primer_apellido,ciudad_residencia from Lider l Order by Ciudad_Residencia ;";

    private String consulta2 = "SELECT id_proyecto,constructora,numero_habitaciones,ciudad  from Proyecto p \n"
            + "where Clasificacion = 'Casa Campestre' and (Ciudad = 'Santa Marta' or Ciudad = 'Cartagena' or Ciudad='Barranquilla');";

    private String consulta3 = "select c.id_compra,p.constructora,p.banco_vinculado from Compra c \n"
            + "inner join Proyecto p on p.ID_Proyecto = c.ID_Compra\n"
            + "where c.Proveedor = 'Homecenter' and p.Ciudad = 'Salento';";

    public ArrayList query1(String query) {
        try {
            //Implementar en pantalla la informacion del proyecto
            Connection db = JDBCUtilities.getConnection();
            Statement sta = null;
            ResultSet rs = null;
            sta = db.createStatement();
            rs = sta.executeQuery(query); //ejecuta consulta SQL
            ArrayList<Object[]> listota = new ArrayList<>();
            while (rs.next()) {
                Object[] lista = new Object[4];
                lista[0] = (String.valueOf(rs.getInt("id_lider")));
                lista[1] = (rs.getString("nombre"));
                lista[2] = (rs.getString("primer_apellido"));
                lista[3] = (rs.getString("ciudad_residencia"));
                listota.add(lista);
            }
            db.close();
            sta.close();
            rs.close();
            return listota;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList query2(String query) {
        try {
            //Implementar en pantalla la informacion del proyecto
            Connection db = JDBCUtilities.getConnection();
            Statement sta = null;
            ResultSet rs = null;
            sta = db.createStatement();
            rs = sta.executeQuery(query); //ejecuta consulta SQL
            ArrayList<Object[]> listota = new ArrayList<>();
            while (rs.next()) {
                Object[] lista = new Object[4];
                lista[0] = (String.valueOf(rs.getInt("ID_Proyecto")));
                lista[1] = (rs.getString("Constructora"));
                lista[2] = (rs.getInt("Numero_Habitaciones"));
                lista[3] = (rs.getString("Ciudad"));
                listota.add(lista);
            }

            db.close();
            sta.close();
            rs.close();
            return listota;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList query3(String query) {
        try {
            //Implementar en pantalla la informacion del proyecto
            Connection db = JDBCUtilities.getConnection();
            Statement sta = null;
            ResultSet rs = null;
            sta = db.createStatement();
            rs = sta.executeQuery(query); //ejecuta consulta SQL
            ArrayList<Object[]> listota = new ArrayList<>();

            while (rs.next()) {
                Object[] lista = new Object[3];
                lista[0] = (String.valueOf(rs.getInt("ID_COMPRA")));
                lista[1] = (rs.getString("Constructora"));
                lista[2] = (rs.getString("Banco_Vinculado"));
                listota.add(lista);
            }

            db.close();
            sta.close();
            rs.close();
            return listota;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public String getConsulta1() {
        return consulta1;
    }

    public String getConsulta2() {
        return consulta2;
    }

    public String getConsulta3() {
        return consulta3;
    }

    public void setConsulta1(String consulta1) {
        this.consulta1 = consulta1;
    }

    public void setConsulta2(String consulta2) {
        this.consulta2 = consulta2;
    }

    public void setConsulta3(String consulta3) {
        this.consulta3 = consulta3;
    }

}
