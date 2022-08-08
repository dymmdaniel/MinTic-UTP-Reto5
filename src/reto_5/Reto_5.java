/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto_5;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reto_5.consult.Consulta;
import reto_5.controller.ReportController;
import reto_5.view.ReportView;

/**
 * Construccion de una aplicacion de escritorio
 * Daniel Yesid Murillo Morales
 * Universida Tecnologica Pereira
 * Reto 5
 */
public class Reto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReportView view=new ReportView();
        view.setVisible(true);
        ReportController controller=new ReportController();
        Consulta consulta=new Consulta();
        consulta.query1(consulta.getConsulta1());
        System.out.println();
        consulta.query2(consulta.getConsulta2());
        System.out.println();
        consulta.query3(consulta.getConsulta3());
    }
    
}
