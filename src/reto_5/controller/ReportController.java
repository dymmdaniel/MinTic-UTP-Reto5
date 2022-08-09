/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.controller;

import reto_5.util.JDBCUtilities;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import reto_5.consult.Consulta;
import reto_5.view.Informe;
import reto_5.view.InformeSQL;
import reto_5.view.MainPanel;

/**
 *
 * @author Daniel Murillo
 */
public class ReportController {

    //Front end
    Informe informe = new Informe(); // Creamos un objeto tipo informe
    InformeSQL informeSql = new InformeSQL(); // Creamos un objeto tipo informeSQL
    MainPanel mainPanel = new MainPanel(); // Creamos un objeto tipo MainPanel
    
    //Backend
    Consulta consulta = new Consulta(); // Creamos un objeto tipo Consulta (Backend)

    public ReportController(){
        //Constructor vacio
    }
    
    public ReportController(Informe informe,InformeSQL informeSql,MainPanel mainPanel){
        this.informe=informe;
        this.informeSql=informeSql;
        this.mainPanel=mainPanel;
    }
    
    //Consulta 1
    public DefaultTableModel consulta1() {
        DefaultTableModel modelTable = new DefaultTableModel();
        ArrayList<String> cabecera = new ArrayList<>();
        ArrayList<Object[]> rows = new ArrayList<>();
        cabecera.add("ID lider");
        cabecera.add("Nombre");
        cabecera.add("Primer Apellido");
        cabecera.add("Ciudad");
        for (Object nombre : cabecera) {
            modelTable.addColumn(nombre);
        }
        rows = consulta.query1(consulta.getConsulta1());
        for (Object[] data : rows) {
            modelTable.addRow(data);
        }
        return modelTable;
    }

    //Consulta 2
    public DefaultTableModel consulta2() {
        DefaultTableModel modelTable = new DefaultTableModel();
        ArrayList<Object> cabecera = new ArrayList<>();
        ArrayList<Object[]> rows = new ArrayList<>();
        cabecera.add("ID Proyecto");
        cabecera.add("Constructora");
        cabecera.add("Numero Habitaciones");
        cabecera.add("Ciudad");
        for (Object nombre : cabecera) {
            modelTable.addColumn(nombre);
        }
        rows = consulta.query2(consulta.getConsulta2());
        for (Object[] data : rows) {
            modelTable.addRow(data);
        }
        return modelTable;
    }

    //Consulta 3
    public DefaultTableModel consulta3() {
        DefaultTableModel modelTable = new DefaultTableModel();
        ArrayList<Object> cabecera = new ArrayList<>();
        ArrayList<Object[]> rows = new ArrayList<>();
        cabecera.add("ID COMPRA");
        cabecera.add("Constructora");
        cabecera.add("Banco Vinculado");
        for (Object nombre : cabecera) {
            modelTable.addColumn(nombre);
        }
        rows = consulta.query3(consulta.getConsulta3());
        for (Object[] data : rows) {
            modelTable.addRow(data);
        }
        return modelTable;
    }

}
