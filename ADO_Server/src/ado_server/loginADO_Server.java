/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ado_server;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Window
 */
public class loginADO_Server extends javax.swing.JFrame {
    
    public int[] clave = {1, 2, 3, 5, 9, 0, 0, 0, 0};
    public int [] miClave = new int [9];
    
    public int indice = 0, primero = 0;
    public boolean inicio = false;
    /**
     * Creates new form loginADO_Server
     */
    public loginADO_Server() {
        initComponents();
        Arrays.fill(miClave,0);
        this.setLocationRelativeTo(null);
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
        RBcuatro = new javax.swing.JRadioButton();
        RBcinco = new javax.swing.JRadioButton();
        RBseis = new javax.swing.JRadioButton();
        RBsiete = new javax.swing.JRadioButton();
        RBocho = new javax.swing.JRadioButton();
        RBnueve = new javax.swing.JRadioButton();
        RBuno = new javax.swing.JRadioButton();
        RBdos = new javax.swing.JRadioButton();
        RBtres = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        RBcuatro.setBackground(new java.awt.Color(255, 0, 0));
        RBcuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBcuatroMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBcuatroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBcuatroMouseReleased(evt);
            }
        });

        RBcinco.setBackground(new java.awt.Color(255, 0, 0));
        RBcinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBcincoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBcincoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBcincoMouseReleased(evt);
            }
        });

        RBseis.setBackground(new java.awt.Color(255, 0, 0));
        RBseis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBseisMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBseisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBseisMouseReleased(evt);
            }
        });

        RBsiete.setBackground(new java.awt.Color(255, 0, 0));
        RBsiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBsieteMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBsieteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBsieteMouseReleased(evt);
            }
        });

        RBocho.setBackground(new java.awt.Color(255, 0, 0));
        RBocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBochoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBochoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBochoMouseReleased(evt);
            }
        });

        RBnueve.setBackground(new java.awt.Color(255, 0, 0));
        RBnueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBnueveMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBnueveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBnueveMouseReleased(evt);
            }
        });

        RBuno.setBackground(new java.awt.Color(255, 0, 0));
        RBuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBunoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBunoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBunoMouseReleased(evt);
            }
        });

        RBdos.setBackground(new java.awt.Color(255, 0, 0));
        RBdos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBdosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBdosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBdosMouseReleased(evt);
            }
        });

        RBtres.setBackground(new java.awt.Color(255, 0, 0));
        RBtres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBtresMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBtresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBtresMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBsiete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBocho))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBcuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBcinco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBuno)
                        .addGap(70, 70, 70)
                        .addComponent(RBdos)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RBtres)
                    .addComponent(RBseis)
                    .addComponent(RBnueve))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBtres)
                    .addComponent(RBdos)
                    .addComponent(RBuno))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBcuatro)
                    .addComponent(RBcinco)
                    .addComponent(RBseis))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBsiete)
                    .addComponent(RBocho)
                    .addComponent(RBnueve))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void insertando(int index){
        if(indice < miClave.length){
            miClave[indice] = index;
            indice++;
        }
    }
    public void termine(){
        indice = 0;
        inicio = false;
        primero = 0;
        if(Arrays.equals(clave, miClave)){
            JOptionPane.showMessageDialog(null, "Correcto");
            Arrays.fill(miClave, 0);
            interfaceADO_Server server = new interfaceADO_Server();
            server.setVisible(true);
        }
    }
    private void RBunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBunoMousePressed
        // TODO add your handling code here:
        if(!inicio){
            primero = 1;
            inicio = true;
            insertando(1);
        }
    }//GEN-LAST:event_RBunoMousePressed

    private void RBunoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBunoMouseReleased
        termine();
    }//GEN-LAST:event_RBunoMouseReleased

    private void RBdosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBdosMousePressed
        if(!inicio){
            primero = 2;
            inicio = true;
            insertando(2);
        }
    }//GEN-LAST:event_RBdosMousePressed

    private void RBtresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBtresMousePressed
        if(!inicio){
            primero = 3;
            inicio = true;
            insertando(3);
        }
    }//GEN-LAST:event_RBtresMousePressed

    private void RBcuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcuatroMousePressed
        if(!inicio){
            primero = 4;
            inicio = true;
            insertando(4);
        }
    }//GEN-LAST:event_RBcuatroMousePressed

    private void RBcincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcincoMousePressed
        if(!inicio){
            primero = 5;
            inicio = true;
            insertando(5);
        }
    }//GEN-LAST:event_RBcincoMousePressed

    private void RBseisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBseisMousePressed
        if(!inicio){
            primero = 6;
            inicio = true;
            insertando(6);
        }
    }//GEN-LAST:event_RBseisMousePressed

    private void RBsieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBsieteMousePressed
        if(!inicio){
            primero = 7;
            inicio = true;
            insertando(7);
        }
    }//GEN-LAST:event_RBsieteMousePressed

    private void RBochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBochoMousePressed
        if(!inicio){
            primero = 8;
            inicio = true;
            insertando(8);
        }
    }//GEN-LAST:event_RBochoMousePressed

    private void RBnueveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBnueveMousePressed
        if(!inicio){
            primero = 9;
            inicio = true;
            insertando(9);
        }
    }//GEN-LAST:event_RBnueveMousePressed

    private void RBdosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBdosMouseReleased
        termine();
    }//GEN-LAST:event_RBdosMouseReleased

    private void RBtresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBtresMouseReleased
        termine();
    }//GEN-LAST:event_RBtresMouseReleased

    private void RBcuatroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcuatroMouseReleased
        termine();
    }//GEN-LAST:event_RBcuatroMouseReleased

    private void RBcincoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcincoMouseReleased
        termine();
    }//GEN-LAST:event_RBcincoMouseReleased

    private void RBseisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBseisMouseReleased
        termine();
    }//GEN-LAST:event_RBseisMouseReleased

    private void RBsieteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBsieteMouseReleased
        termine();
    }//GEN-LAST:event_RBsieteMouseReleased

    private void RBochoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBochoMouseReleased
        termine();
    }//GEN-LAST:event_RBochoMouseReleased

    private void RBnueveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBnueveMouseReleased
        termine();
    }//GEN-LAST:event_RBnueveMouseReleased

    private void RBunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBunoMouseEntered
        if(primero != 1 && primero > 0 && inicio ){
            insertando(1);
        }
    }//GEN-LAST:event_RBunoMouseEntered

    private void RBdosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBdosMouseEntered
        if(primero != 2 && primero > 0 && inicio ){
            insertando(2);
        }
    }//GEN-LAST:event_RBdosMouseEntered

    private void RBtresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBtresMouseEntered
        if(primero != 3 && primero > 0 && inicio ){
            insertando(3);
        }
    }//GEN-LAST:event_RBtresMouseEntered

    private void RBcuatroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcuatroMouseEntered
        if(primero != 4 && primero > 0 && inicio ){
            insertando(4);
        }
    }//GEN-LAST:event_RBcuatroMouseEntered

    private void RBcincoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBcincoMouseEntered
        if(primero != 5 && primero > 0 && inicio ){
            insertando(5);
        }
    }//GEN-LAST:event_RBcincoMouseEntered

    private void RBseisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBseisMouseEntered
        if(primero != 6 && primero > 0 && inicio ){
            insertando(6);
        }
    }//GEN-LAST:event_RBseisMouseEntered

    private void RBsieteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBsieteMouseEntered
        if(primero != 7 && primero > 0 && inicio ){
            insertando(7);
        }
    }//GEN-LAST:event_RBsieteMouseEntered

    private void RBochoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBochoMouseEntered
        if(primero != 8 && primero > 0 && inicio ){
            insertando(8);
        }
    }//GEN-LAST:event_RBochoMouseEntered

    private void RBnueveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBnueveMouseEntered
        if(primero != 9 && primero > 0 && inicio ){
            insertando(9);
        }
    }//GEN-LAST:event_RBnueveMouseEntered

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
            java.util.logging.Logger.getLogger(loginADO_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginADO_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginADO_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginADO_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginADO_Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBcinco;
    private javax.swing.JRadioButton RBcuatro;
    private javax.swing.JRadioButton RBdos;
    private javax.swing.JRadioButton RBnueve;
    private javax.swing.JRadioButton RBocho;
    private javax.swing.JRadioButton RBseis;
    private javax.swing.JRadioButton RBsiete;
    private javax.swing.JRadioButton RBtres;
    private javax.swing.JRadioButton RBuno;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
