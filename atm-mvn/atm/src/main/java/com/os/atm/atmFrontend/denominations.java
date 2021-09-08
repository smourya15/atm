/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import javax.swing.ButtonGroup;

/**
 *
 * @author smourya
 */
public class denominations extends javax.swing.JFrame {
     
    private int selected_denomination, amount, no_notes;
    /**
     * Creates new form denominations
     */
    public denominations() {
        
        initComponents();
        groupRadioButtons();
    }
    public denominations(int amount){
        initComponents();
        groupRadioButtons();
        this.amount = amount;
        headText.setText("Your Amount is Rs."+amount);
        if(amount<2000 || amount%2000!=0){
            D2000.setVisible(false);
        }
        if(amount<1000 || amount%1000!=0){
            D1000.setVisible(false);
        }
        if(amount<500 || amount%500!=0){
            D500.setVisible(false);
        }
        if(amount<100 || amount%100!=0){
            D100.setVisible(false);
        }
    }
    
    private void groupRadioButtons(){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(D50);
        buttonGroup.add(D100);
        buttonGroup.add(D500);
        buttonGroup.add(D1000);
        buttonGroup.add(D2000);
//        D50.addActionListener(this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        display_denomination = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        D500 = new javax.swing.JRadioButton();
        D2000 = new javax.swing.JRadioButton();
        D100 = new javax.swing.JRadioButton();
        D1000 = new javax.swing.JRadioButton();
        D50 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headText.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        headText.setText("Your Amount is Rs. 500");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setText("WITHDRAW");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        display_denomination.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        display_denomination.setText("Selece Denomination");

        D500.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D500.setText("500");
        D500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D500ActionPerformed(evt);
            }
        });

        D2000.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D2000.setText("2000");
        D2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2000ActionPerformed(evt);
            }
        });

        D100.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D100.setText("100");
        D100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D100ActionPerformed(evt);
            }
        });

        D1000.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D1000.setText("1000");
        D1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1000ActionPerformed(evt);
            }
        });

        D50.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D50.setText("50");
        D50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D50ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(D500, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(D2000, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(D100, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(D1000, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(D50, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(D50, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(D100, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(D500, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(D1000)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(D2000)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D50)
                    .addComponent(D1000)
                    .addComponent(D100)
                    .addComponent(D500)
                    .addComponent(D2000))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jDesktopPane1)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(display_denomination)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(headText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(display_denomination)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D50ActionPerformed
        // TODO add your handling code here:
        no_notes = amount/50;
        display_denomination.setText(no_notes+" x 50 = "+amount);
    }//GEN-LAST:event_D50ActionPerformed

    private void D100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D100ActionPerformed
        // TODO add your handling code here:
        no_notes = amount/100;
        display_denomination.setText(no_notes+" x 100 = "+amount);
    }//GEN-LAST:event_D100ActionPerformed

    private void D500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D500ActionPerformed
        // TODO add your handling code here:
        no_notes = amount/500;
        display_denomination.setText(no_notes+" x 500 = "+amount);
    }//GEN-LAST:event_D500ActionPerformed

    private void D1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1000ActionPerformed
        // TODO add your handling code here:
        no_notes = amount/1000;
        display_denomination.setText(no_notes+" x 1000 = "+amount);
    }//GEN-LAST:event_D1000ActionPerformed

    private void D2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2000ActionPerformed
        // TODO add your handling code here:
        no_notes = amount/2000;
        display_denomination.setText(no_notes+" x 2000 = "+amount);
    }//GEN-LAST:event_D2000ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        success objSuccess = new success(amount);
        objSuccess.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(denominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(denominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(denominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(denominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new denominations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton D100;
    private javax.swing.JRadioButton D1000;
    private javax.swing.JRadioButton D2000;
    private javax.swing.JRadioButton D50;
    private javax.swing.JRadioButton D500;
    private javax.swing.JLabel display_denomination;
    private javax.swing.JLabel headText;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}