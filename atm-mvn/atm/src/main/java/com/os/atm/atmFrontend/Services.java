/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import com.os.atm.encapsulateClasses.DebitCard;
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
public class Services extends javax.swing.JFrame {
    
    String txnType="";

    @Autowired
    private ApplicationContext context;
    /**
     * Creates new form Services
     */
    private DebitCard debitCard;
    public Services() {
        initComponents();
        
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                WelcomePage objPage = new WelcomePage();
                 System.out.println("timer Services");
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
        timer.schedule(tt, 120000);
    }

    Services(DebitCard debitCard) {
        this.debitCard = debitCard;
        initComponents();
        
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                WelcomePage objPage = new WelcomePage();
                 System.out.println("timer Services");
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
        timer.schedule(tt, 120000);
    }

    public void initializeComponents(){
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        balanceEnquiryBtn = new javax.swing.JButton();
        depositBtn = new javax.swing.JButton();
        fundTransferBtn = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        withdrawBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        withdrawBtn.setText("WITHDRAW");
        withdrawBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setText("Choose a Service");

        balanceEnquiryBtn.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        balanceEnquiryBtn.setText("BALANCE ENQUIRY");
        balanceEnquiryBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        balanceEnquiryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceEnquiryBtnActionPerformed(evt);
            }
        });

        depositBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        depositBtn.setText("DEPOSIT");
        depositBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        fundTransferBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        fundTransferBtn.setText("FUND TRANSFER");
        fundTransferBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fundTransferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTransferBtnActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceEnquiryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundTransferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fundTransferBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(balanceEnquiryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        // TODO add your handling code here:
        SelectDenominations objSelectDenominations = new SelectDenominations(debitCard);
        // objSelectDenominations.initializeComponents();
        objSelectDenominations.setVisible(true);
        dispose();
    }//GEN-LAST:event_depositBtnActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
         System.out.println(debitCard.getBalcance());
        WithdrawMoney objWithdraw = new WithdrawMoney(debitCard);
//        PrintReceipt pr = new PrintReceipt(txnType);
//        pr.printTransaction();
        
        objWithdraw.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void balanceEnquiryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceEnquiryBtnActionPerformed
        // TODO add your handling code here:
        RetrieveBalance objEnquire = new  RetrieveBalance(debitCard);
        objEnquire.setVisible(true);
        dispose();
    }//GEN-LAST:event_balanceEnquiryBtnActionPerformed

    private void fundTransferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTransferBtnActionPerformed
        // TODO add your handling code here:
        FundTransfer objTransfer = new FundTransfer(debitCard);
        objTransfer.setVisible(true);
        dispose();
                
    }//GEN-LAST:event_fundTransferBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balanceEnquiryBtn;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton depositBtn;
    private javax.swing.JButton fundTransferBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
