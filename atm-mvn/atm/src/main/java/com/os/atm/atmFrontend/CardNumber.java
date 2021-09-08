/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import com.os.atm.encapsulateClasses.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author smourya
 */
@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class CardNumber extends javax.swing.JFrame {

    public void initialize() {
        initComponents();
        verifyCard.setText(null);

        verifyCardNum_Btn.setEnabled(Boolean.FALSE);
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
        verifyCardNum_Btn = new javax.swing.JButton();
        verifyCard = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Enter the Card Number");

        verifyCardNum_Btn.setBackground(new java.awt.Color(255, 255, 255));
        verifyCardNum_Btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        verifyCardNum_Btn.setText("VERIFY");
        verifyCardNum_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verifyCardNum_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyCardNum_BtnActionPerformed(evt);
            }
        });

        verifyCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verifyCard.setText("jPasswordField1");
        verifyCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyCardActionPerformed(evt);
            }
        });
        verifyCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verifyCardKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(verifyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(verifyCardNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verifyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(verifyCardNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyCardNum_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyCardNum_BtnActionPerformed
        // TODO add your handling code here:
        
        final StringBuilder salt = new StringBuilder(verifyCard.getText());
        PBES_Encryption pb = new PBES_Encryption(salt.toString(), verifyCard.getText());
        System.out.println("card: "+verifyCard.getText()+"Encrypt:"+ pb.getEncrypt() + "Decrypt: "+pb.decrypt());
        final int returnType = (new ATMServices()).verifyCard(pb.getEncrypt(), verifyCard.getText());
        switch (returnType) {
            case 1:
                JOptionPane.showMessageDialog(this, "Incorrect Account Number");
                break;
//        JOptionPane.showMessageDialog(this, verifyCard.getText());
//        pin objPin = new pin();
//        objPin.setVisible(true);
//        dispose();
            case 2:
                JOptionPane.showMessageDialog(this, "Your Card is Blocked,\n Contact Your Branch\n"+Arrays.toString(verifyCard.getPassword()));
                break;
            case 3:
                JOptionPane.showMessageDialog(this, verifyCard.getText());
                StringBuilder accNumber = new StringBuilder(verifyCard.getText().substring(0, 2)).append("XX-XXXX-XXXX-").append(verifyCard.getText().substring(12, 16));
                pin objPin = new pin(accNumber.toString(), pb.getEncrypt());
                objPin.setVisible(true);
                dispose();
                break;
        }

        

    }//GEN-LAST:event_verifyCardNum_BtnActionPerformed

    private void verifyCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyCardActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_verifyCardActionPerformed

    private void verifyCardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyCardKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && verifyCard.getText().length()<16)){
             evt.consume();
        }
        if(verifyCard.getText().isEmpty()){
            System.out.println("length"+verifyCard.getText().length());
            verifyCardNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyCard.getText().length()<15){
            System.out.println("length"+verifyCard.getText().length());
            verifyCardNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyCard.getText().length()==15){
             System.out.println("length"+verifyCard.getText().length());
            verifyCardNum_Btn.setEnabled(Boolean.TRUE);
            if(c == KeyEvent.VK_BACK_SPACE){
                verifyCardNum_Btn.setEnabled(Boolean.FALSE);
            }
//
        }
        
        
//        else{
//            verifyCardNum_Btn.setEnabled(Boolean.FALSE); 
//        }
        
    }//GEN-LAST:event_verifyCardKeyTyped

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
            java.util.logging.Logger.getLogger(CardNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardNumber().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField verifyCard;
    private javax.swing.JButton verifyCardNum_Btn;
    // End of variables declaration//GEN-END:variables
}
