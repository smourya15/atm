/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import com.os.atm.encapsulateClasses.DebitCard;
import java.awt.event.ItemEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author smourya
 */
@Component
public class SelectDenominations extends javax.swing.JFrame {

    @Autowired
   private ApplicationContext context;
    /**
     * Creates new form depositCash
     */
     Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                
                System.out.println("timer selectDenominations");
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
    private DebitCard debitCard;
    public SelectDenominations() {
        initComponents();
        nextBtn.setEnabled(false);
        timer.schedule(tt, 30000);
    }

    public SelectDenominations(DebitCard debitCard) {
        initComponents();
        nextBtn.setEnabled(false);
        this.debitCard = debitCard;
        timer.schedule(tt, 30000);
    }
    public void initializeComponents(){
        initComponents();
        timer.schedule(tt, 30000);
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
        D50_checkbox = new javax.swing.JCheckBox();
        D500_checkbox = new javax.swing.JCheckBox();
        D100_checkbox = new javax.swing.JCheckBox();
        D1000_checkbox = new javax.swing.JCheckBox();
        D2000_checkbox = new javax.swing.JCheckBox();
        nextBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Select Denominations");

        D50_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D50_checkbox.setText("Rs. 50");
        D50_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D50_checkboxActionPerformed(evt);
            }
        });

        D500_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D500_checkbox.setText("Rs. 500");
        D500_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D500_checkboxActionPerformed(evt);
            }
        });

        D100_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D100_checkbox.setText("Rs. 100");
        D100_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D100_checkboxActionPerformed(evt);
            }
        });

        D1000_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D1000_checkbox.setText("Rs. 1000");
        D1000_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1000_checkboxActionPerformed(evt);
            }
        });

        D2000_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D2000_checkbox.setText("Rs. 2000");
        D2000_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2000_checkboxActionPerformed(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D50_checkbox)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(D100_checkbox)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(D500_checkbox)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D1000_checkbox)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(D2000_checkbox)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D50_checkbox)
                    .addComponent(D100_checkbox)
                    .addComponent(D500_checkbox)
                    .addComponent(D1000_checkbox)
                    .addComponent(D2000_checkbox))
                .addGap(18, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D50_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D50_checkboxActionPerformed
        // TODO add your handling code here:
       nextBtn.setEnabled(true);
        if(!D50_checkbox.isSelected() && !D100_checkbox.isSelected() && !D500_checkbox.isSelected() && !D1000_checkbox.isSelected() && !D2000_checkbox.isSelected() ){
            nextBtn.setEnabled(false);
        }
    
         
        
    }//GEN-LAST:event_D50_checkboxActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        boolean d50 = D50_checkbox.isSelected();
        boolean d100 = D100_checkbox.isSelected();
        boolean d500 = D500_checkbox.isSelected();
        boolean d1000= D1000_checkbox.isSelected();
        boolean d2000 = D2000_checkbox.isSelected();
         
         tt.cancel();
          timer.cancel();
          timer.purge();
        DepositAmount objDeposit = new DepositAmount(d50,d100,d500,d1000,d2000, debitCard);
        objDeposit.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void D100_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D100_checkboxActionPerformed
        // TODO add your handling code here:
          nextBtn.setEnabled(true);
        if(!D50_checkbox.isSelected() && !D100_checkbox.isSelected() && !D500_checkbox.isSelected() && !D1000_checkbox.isSelected() && !D2000_checkbox.isSelected() ){
            nextBtn.setEnabled(false);
        }
    }//GEN-LAST:event_D100_checkboxActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       
         tt.cancel();
          timer.cancel();
          timer.purge();
        
        WelcomePage objPage = new WelcomePage();
        objPage.createAndShow();
        objPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void D500_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D500_checkboxActionPerformed
        // TODO add your handling code here:
          nextBtn.setEnabled(true);
        if(!D50_checkbox.isSelected() && !D100_checkbox.isSelected() && !D500_checkbox.isSelected() && !D1000_checkbox.isSelected() && !D2000_checkbox.isSelected() ){
            nextBtn.setEnabled(false);
        }
    }//GEN-LAST:event_D500_checkboxActionPerformed

    private void D1000_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1000_checkboxActionPerformed
        // TODO add your handling code here:
          nextBtn.setEnabled(true);
        if(!D50_checkbox.isSelected() && !D100_checkbox.isSelected() && !D500_checkbox.isSelected() && !D1000_checkbox.isSelected() && !D2000_checkbox.isSelected() ){
            nextBtn.setEnabled(false);
        }
    }//GEN-LAST:event_D1000_checkboxActionPerformed

    private void D2000_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2000_checkboxActionPerformed
        // TODO add your handling code here:
          nextBtn.setEnabled(true);
        if(!D50_checkbox.isSelected() && !D100_checkbox.isSelected() && !D500_checkbox.isSelected() && !D1000_checkbox.isSelected() && !D2000_checkbox.isSelected() ){
            nextBtn.setEnabled(false);
        }
    }//GEN-LAST:event_D2000_checkboxActionPerformed

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
            java.util.logging.Logger.getLogger(SelectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectDenominations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox D1000_checkbox;
    private javax.swing.JCheckBox D100_checkbox;
    private javax.swing.JCheckBox D2000_checkbox;
    private javax.swing.JCheckBox D500_checkbox;
    private javax.swing.JCheckBox D50_checkbox;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
