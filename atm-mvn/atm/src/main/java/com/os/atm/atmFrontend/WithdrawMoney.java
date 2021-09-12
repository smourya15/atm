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

import com.os.atm.encapsulateClasses.DebitCard;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author smourya
 */
@Component
public class WithdrawMoney extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
      Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                 System.out.println("timer withdrawMoney");
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
    private DebitCard objDebitCard;
    String debitcard;
    PreparedStatement pst = null;
    
    
    public WithdrawMoney(StringBuilder c){
        System.out.print(c);
    }
    public WithdrawMoney() {
        initComponents();
        confirmButton.setEnabled(Boolean.FALSE);
        timer.schedule(tt, 120000);
    }

    WithdrawMoney(DebitCard debitCard) {
        initComponents();
        confirmButton.setEnabled(Boolean.FALSE);
        
      
        timer.schedule(tt, 120000);
        this.debitcard = debitCard.getCard_no();
        this.objDebitCard=debitCard;
        
        System.out.println("AccNo: \t"+debitCard.getAccNum());
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
        confirmButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountLabel)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmountField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(withdrawLabel)
                .addGap(18, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(withdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
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
        System.out.println(amount+"\t "+Double.toString(objDebitCard.getBalcance()));
        
        if(amount%50==0){
            if(objDebitCard.getBalcance()< amount){
                JOptionPane.showMessageDialog(this, "Insuffiencient Balance.");
                withdrawAmountField.setText(null);
            }
            else{
                if(objDebitCard.getCardLimit()<amount){
                    JOptionPane.showMessageDialog(this, "Daily Limit Exceeded");
                }
                else{
                     tt.cancel();
          timer.cancel();
          timer.purge();
                    Denominations objDenomination= new Denominations(amount,objDebitCard);
                    objDenomination.setVisible(true);
                    dispose();
                }
            }
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
        try{
            int amount;
        if (withdrawAmountField.getText().isEmpty()){
            amount = 0;
        }
        else{
            amount = Integer.parseInt(withdrawAmountField.getText());
        }
        System.out.println(amount);
        
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
            String sqlQuery0="INSERT INTO `atm_transaction`(`machine_id`, `card_num`, `account_no`, `trans_type`, `trans_amt`, `trans_time`, `status`) VALUES (1010000000,?, (SELECT account_no FROM debit_card WHERE card_no=?), 'WITHDRAW', ?, (SELECT now()), 'CANCELLED' )";
                
                    PreparedStatement pst = con.prepareStatement(sqlQuery0);
                    pst.setString(1, String.valueOf(debitcard));
                    pst.setString(2, String.valueOf(debitcard));
                    pst.setString(3, String.valueOf(amount));
                    pst.execute();
                    System.out.println("Successfully Cancelled Withdraw Transaction\t");
            }
         catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }  
         tt.cancel();
          timer.cancel();
          timer.purge();

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
