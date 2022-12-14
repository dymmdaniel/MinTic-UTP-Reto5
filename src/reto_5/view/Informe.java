/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package reto_5.view;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import reto_5.consult.Consulta;
import reto_5.controller.ReportController;

/**
 *
 * @author danie
 */
public class Informe extends javax.swing.JPanel {

    private int informe = 0;

    /**
     * Creates new form informe
     */
    public Informe() {
        initComponents();
        jTable1.enable(false);
    }

    public void inicializar(int x,DefaultTableModel consulta) {
        if (x == 1) {
            //Asignamos el nombre
            jLabel1.setText("1. Informe Lider");
            this.jTable1.setModel(consulta);

        } else if (x == 2) {
            //Asignamos el nombre
            jLabel1.setText("2. Informe Campestre");
            this.jTable1.setModel(consulta);
        } else if (x == 3) {
            //Asignamos el nombre
            jLabel1.setText("3. Informe Homecenter"); 
            this.jTable1.setModel(consulta);
        } else {
            jLabel1.setText("Escriba el comando SQL para realizar la consulta");
            DefaultTableModel modelTable = new DefaultTableModel();
            jTable1.setModel(modelTable);
        }

    }

    public int getInforme() {
        return informe;
    }

    public void setInforme(int informe) {
        this.informe = informe;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 149, 126));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
