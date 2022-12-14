/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto_5.view;

import java.awt.Image;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import reto_5.consult.Consulta;
import reto_5.controller.ReportController;
import reto_5.view.MainPanel;

/**
 *
 * @author Daniel Murillo
 */
public class ReportView extends javax.swing.JFrame implements ActionListener {

    Informe informe = new Informe();
    MainPanel mainPanel = new MainPanel();
    ReportController controller = new ReportController();

    /**
     * Creates new form ReportView
     */
    public ReportView() {
        initComponents();

        this.setLocationRelativeTo(null);

        JContenedor.add(mainPanel);
        mainPanel.setVisible(true);
        informe.setVisible(false);

        btnInicio.addActionListener(this);
        btnInforme1.addActionListener(this);
        btnInforme2.addActionListener(this);
        btnInforme3.addActionListener(this);

        deshabilitarBoton();
    }

    private void deshabilitarBoton() {
        if (mainPanel.isVisible()) {
            btnInicio.setEnabled(false);
            mainPanel.progressBar();
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    btnInforme1.setEnabled(false);
                    btnInforme2.setEnabled(false);
                    btnInforme3.setEnabled(false);
                    for (int i = 1; i <= 100; i++) {
                        try {
                            sleep(15);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    btnInforme1.setEnabled(true);
                    btnInforme2.setEnabled(true);
                    btnInforme3.setEnabled(true);
                }
            };
            hilo.start();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInforme1 = new javax.swing.JButton();
        btnInforme2 = new javax.swing.JButton();
        btnInforme3 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        JContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 73, 89));

        btnInforme1.setBackground(new java.awt.Color(0, 73, 89));
        btnInforme1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btnInforme1.setForeground(new java.awt.Color(255, 255, 255));
        btnInforme1.setText("1. Informe Lider");
        btnInforme1.setBorder(null);
        btnInforme1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme1ActionPerformed(evt);
            }
        });

        btnInforme2.setBackground(new java.awt.Color(0, 73, 89));
        btnInforme2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btnInforme2.setForeground(new java.awt.Color(255, 255, 255));
        btnInforme2.setText("2. Informe Casa Campestre");
        btnInforme2.setBorder(null);
        btnInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme2ActionPerformed(evt);
            }
        });

        btnInforme3.setBackground(new java.awt.Color(0, 73, 89));
        btnInforme3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btnInforme3.setForeground(new java.awt.Color(255, 255, 255));
        btnInforme3.setText("3. Informe Homecenter");
        btnInforme3.setBorder(null);
        btnInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme3ActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 73, 89));
        btnInicio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(btnInforme3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(btnInforme1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInforme2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnInforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnInforme2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnInforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        JContenedor.setBackground(new java.awt.Color(0, 123, 149));
        JContenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme3ActionPerformed
        // TODO add your handling code here:
        btnInicio.setEnabled(true);
        btnInforme1.setEnabled(true);
        btnInforme2.setEnabled(true);
        btnInforme3.setEnabled(false);
        mainPanel.setVisible(false);
        informe.inicializar(3, controller.consulta3());
        informe.setVisible(true);
        informe.setInforme(3);
        JContenedor.add(informe);
        mainPanel.setVisible(false);
        mainPanel.getjProgressBar().setVisible(false);
    }//GEN-LAST:event_btnInforme3ActionPerformed

    private void btnInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme2ActionPerformed
        // TODO add your handling code here:
        btnInicio.setEnabled(true);
        btnInforme1.setEnabled(true);
        btnInforme2.setEnabled(false);
        btnInforme3.setEnabled(true);
        mainPanel.setVisible(false);
        informe.inicializar(2, controller.consulta2());
        informe.setVisible(true);
        JContenedor.add(informe);
        mainPanel.setVisible(false);
        mainPanel.getjProgressBar().setVisible(false);
    }//GEN-LAST:event_btnInforme2ActionPerformed

    private void btnInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme1ActionPerformed
        // TODO add your handling code here:
        btnInicio.setEnabled(true);
        btnInforme1.setEnabled(false);
        btnInforme2.setEnabled(true);
        btnInforme3.setEnabled(true);
        mainPanel.setVisible(false);
        informe.inicializar(1, controller.consulta1());
        informe.setVisible(true);
        JContenedor.add(informe);
        mainPanel.setVisible(false);
        mainPanel.getjProgressBar().setVisible(false);
    }//GEN-LAST:event_btnInforme1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        btnInicio.setEnabled(false);
        btnInforme1.setEnabled(true);
        btnInforme2.setEnabled(true);
        btnInforme3.setEnabled(true);
        mainPanel.setVisible(true);
        informe.setVisible(false);
        JContenedor.add(mainPanel);
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JContenedor;
    private javax.swing.JButton btnInforme1;
    private javax.swing.JButton btnInforme2;
    private javax.swing.JButton btnInforme3;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
