/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import com.os.atm.encapsulateClasses.DebitCard;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author smourya
 */
public class Success extends javax.swing.JFrame {

    /**
     * Creates new form success
     */
    int amount1;
    private String txnType;
    String amount2;
    private String benificiaryAccount=null;
    private DebitCard objDebitCard = null;
     Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer success");
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
    public Success(){
        initComponents();
    }
    
    public Success(int amount1, DebitCard db) {
        initComponents();
        this.amount1 = amount1;
        this.objDebitCard = db;
        SuccessMessage.setText("Your Transaction of Rs."+ amount1 +" was successful");
        timer.schedule(tt, 60000);
    }
    
    public Success(int amount1,String tType, DebitCard db, String benificiaryAccount) {
        initComponents();
        this.amount1 = amount1;
        this.objDebitCard = db;
        this.txnType = tType;

        this.benificiaryAccount = benificiaryAccount;
        SuccessMessage.setText("Your Transaction of Rs."+ amount1 +" was successful");
        timer.schedule(tt, 60000);
    }
    
//    public void 
    
    public Success(String amount2,String tType, DebitCard db) {
        initComponents();
        this.txnType = tType;
        this.amount1 =  Integer.parseInt(amount2);
        this.objDebitCard = db;
        SuccessMessage.setText("Your Transaction of Rs."+ amount1 +" was successful");
       
        timer.schedule(tt, 60000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SuccessMessage = new javax.swing.JLabel();
        printReceiptBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SuccessMessage.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SuccessMessage.setText("Your Transaction of Rs. 5000 was successfull");

        printReceiptBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        printReceiptBtn.setText("PRINT RECEIPT");
        printReceiptBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(SuccessMessage)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(SuccessMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(printReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tt.cancel();
          timer.cancel();
          timer.purge();
        Services objServices = new Services();
        objServices.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        
        tt.cancel();
          timer.cancel();
          timer.purge();
        WelcomePage objPage = new WelcomePage();
        objPage.createAndShow();
        objPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void printReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptBtnActionPerformed
        // TODO add your handling code here:
        tt.cancel();
          timer.cancel();
          timer.purge();
        PrintReceipt pr = new PrintReceipt(txnType, objDebitCard, Integer.toString(amount1), benificiaryAccount);
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_printReceiptBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Success().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SuccessMessage;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton printReceiptBtn;
    // End of variables declaration//GEN-END:variables
}
