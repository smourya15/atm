/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import com.os.atm.encapsulateClasses.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.text.PlainDocument;

import javax.swing.JOptionPane;
import org.springframework.stereotype.Component;

/**
 *
 * @author smourya
 */
@Component
public class WithdrawMoney extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    
    public WithdrawMoney() {
        initComponents();
        confirmButton.setEnabled(Boolean.FALSE);
        
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
        timer.schedule(tt, 30000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     * 
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawLabel = new javax.swing.JLabel();
        withdrawAmountField = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        withdrawLabel.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        withdrawLabel.setText("WITHDRAW");

        withdrawAmountField.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        withdrawAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmountFieldActionPerformed(evt);
            }
        });
        withdrawAmountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                withdrawAmountFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                withdrawAmountFieldKeyTyped(evt);
            }
        });

        amountLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        amountLabel.setText("Amount");

        confirmButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        confirmButton.setText("CONFIRM");
        confirmButton.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(111, Short.MAX_VALUE)
                        .addComponent(withdrawLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addComponent(amountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(withdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(withdrawLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(withdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawAmountFieldActionPerformed
        
      
//        PlainDocument pd = (PlainDocument) withdrawAmountField.getDocument();
//        pd.setDocumentFilter(new IntFilter());




        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawAmountFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        int amount;
        if (withdrawAmountField.getText().isEmpty()){
            amount = 1;
        }
        else{
            amount = Integer.parseInt(withdrawAmountField.getText());
        }
        System.out.println(amount);
        
        if(amount%50==0){
            Denominations objDenomination= new Denominations(amount);
            objDenomination.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter The Amount In The Multiple Of Rs.50");
            withdrawAmountField.setText("");
            confirmButton.setEnabled(Boolean.FALSE);
        }
        
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void withdrawAmountFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawAmountFieldKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && withdrawAmountField.getText().length()<5)){
             evt.consume();
        }
    }//GEN-LAST:event_withdrawAmountFieldKeyTyped

    private void withdrawAmountFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawAmountFieldKeyReleased
        if (withdrawAmountField.getText().isEmpty()){
            confirmButton.setEnabled(Boolean.FALSE);
        }
        else{
            confirmButton.setEnabled(Boolean.TRUE);
        }
    }//GEN-LAST:event_withdrawAmountFieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        WelcomePage objPage = new WelcomePage();
        objPage.createAndShow();
        objPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField withdrawAmountField;
    private javax.swing.JLabel withdrawLabel;
    // End of variables declaration//GEN-END:variables
}
