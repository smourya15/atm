/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author smourya
 */
public class DepositAmount extends javax.swing.JFrame {

    /**
     * Creates new form depositAmount
     */
    public DepositAmount() {
        initComponents();
        nextBtn.setEnabled(false);
        errorMessageLabel.setVisible(false);
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
        timer.schedule(tt, 120000);
    }
    
     public DepositAmount(boolean d50,boolean d100,boolean d500,boolean d1000,boolean d2000) {
        initComponents();
                nextBtn.setEnabled(false);
                errorMessageLabel.setVisible(false);
        rs50Label.setVisible(d50);
        rs100Label.setVisible(d100);
        rs500Label.setVisible(d500);
        rs1000Label.setVisible(d1000);
        rs2000Label.setVisible(d2000);
        
        d50Field.setVisible(d50);
        d100Field.setVisible(d100);
        d500Field.setVisible(d500);
        d1000Field.setVisible(d1000);
        d2000Field.setVisible(d2000);
        
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "No input from user. Aborting session");
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
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rs50Label = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        d50Field = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        rs100Label = new javax.swing.JLabel();
        rs500Label = new javax.swing.JLabel();
        rs1000Label = new javax.swing.JLabel();
        rs2000Label = new javax.swing.JLabel();
        d100Field = new javax.swing.JTextField();
        d500Field = new javax.swing.JTextField();
        d1000Field = new javax.swing.JTextField();
        d2000Field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        errorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rs50Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs50Label.setText("Rs. 50          X");

        cancelButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 86, 126));
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        d50Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d50Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d50FieldFocusLost(evt);
            }
        });
        d50Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d50FieldActionPerformed(evt);
            }
        });
        d50Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                d50FieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d50FieldKeyTyped(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(0, 86, 126));
        nextBtn.setText("NEXT");
        nextBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        rs100Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs100Label.setText("Rs. 100        X");

        rs500Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs500Label.setText("Rs. 500        X");

        rs1000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs1000Label.setText("Rs. 1000      X");

        rs2000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs2000Label.setText("Rs. 2000      X");

        d100Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d100Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d100FieldFocusLost(evt);
            }
        });
        d100Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d100FieldActionPerformed(evt);
            }
        });
        d100Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d100FieldKeyTyped(evt);
            }
        });

        d500Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d500Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d500FieldFocusLost(evt);
            }
        });
        d500Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d500FieldActionPerformed(evt);
            }
        });
        d500Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d500FieldKeyTyped(evt);
            }
        });

        d1000Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d1000Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d1000FieldFocusLost(evt);
            }
        });
        d1000Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1000FieldActionPerformed(evt);
            }
        });
        d1000Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d1000FieldKeyTyped(evt);
            }
        });

        d2000Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d2000Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d2000FieldFocusLost(evt);
            }
        });
        d2000Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2000FieldActionPerformed(evt);
            }
        });
        d2000Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d2000FieldKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Enter the number of notes for the denominations");

        errorMessageLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorMessageLabel.setText("Please Enter the Fields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rs50Label)
                                .addComponent(rs2000Label)
                                .addComponent(rs100Label)
                                .addComponent(rs500Label)
                                .addComponent(rs1000Label))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(d100Field, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d50Field, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(d500Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(d2000Field, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(d1000Field, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(errorMessageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs50Label)
                    .addComponent(d50Field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d100Field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs100Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d500Field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs500Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rs1000Label)
                    .addComponent(d1000Field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d2000Field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs2000Label))
                .addGap(53, 53, 53)
                .addComponent(errorMessageLabel)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d50FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d50FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d50FieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        WelcomePage objPage = new WelcomePage();
        objPage.createAndShow();
        objPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        int d50, d100,d500, d1000, d2000;
        if(d50Field.getText().isEmpty()){
            d50 = 0;
        }
        else{
            d50 = Integer.parseInt(d50Field.getText());
        }
        
         if(d100Field.getText().isEmpty()){
            d100 = 0;
        }
        else{
            d100 = Integer.parseInt(d100Field.getText());
        }
         
          if(d500Field.getText().isEmpty()){
            d500= 0;
        }
        else{
            d500 = Integer.parseInt(d500Field.getText());
        }
          
           if(d1000Field.getText().isEmpty()){
            d1000 = 0;
        }
        else{
            d1000 = Integer.parseInt(d1000Field.getText());
        }
           
            if(d2000Field.getText().isEmpty()){
            d2000 = 0;
        }
        else{
            d2000 = Integer.parseInt(d2000Field.getText());
        }
        
            if(d50Field.getText().isEmpty() && d100Field.getText().isEmpty() && d500Field.getText().isEmpty() && d1000Field.getText().isEmpty() && d2000Field.getText().isEmpty() ){
          errorMessageLabel.setVisible(true);
            } else{
        DepositConfirm deposit= new DepositConfirm(d50,d100, d500, d1000, d2000);
         deposit.setVisible(true);
         dispose();
         
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnActionPerformed

    private void d100FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d100FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d100FieldActionPerformed

    private void d500FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d500FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d500FieldActionPerformed

    private void d1000FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1000FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1000FieldActionPerformed

    private void d2000FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2000FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2000FieldActionPerformed

 
    private void d50FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d50FieldKeyTyped
        nextBtn.setEnabled(true);
        errorMessageLabel.setVisible(false);
        char c = evt.getKeyChar();

        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_d50FieldKeyTyped

    private void d50FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d50FieldKeyPressed
    }//GEN-LAST:event_d50FieldKeyPressed

    private void d50FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d50FieldFocusLost
        
        String s = d50Field.getText();
         if(s.isEmpty()){
            return;
        }
         
      else{
          long ans = Integer.parseInt(s) * 50;
       // eq50Label.setText("=  Rs. " + Long.toString(ans));
     }
    }//GEN-LAST:event_d50FieldFocusLost

    private void d100FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d100FieldKeyTyped
        nextBtn.setEnabled(true);
        char c = evt.getKeyChar();
        errorMessageLabel.setVisible(false);

        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_d100FieldKeyTyped

    private void d100FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d100FieldFocusLost
        String s = d100Field.getText();
         if(s.isEmpty()){
            return;
        }
        else{
            long ans = Integer.parseInt(s) * 100;
          //eq100Label.setText("=  Rs. " + Long.toString(ans));
         }
    }//GEN-LAST:event_d100FieldFocusLost

    private void d500FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d500FieldKeyTyped
        nextBtn.setEnabled(true);
        char c = evt.getKeyChar();
        errorMessageLabel.setVisible(false);

        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_d500FieldKeyTyped

    private void d500FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d500FieldFocusLost
        String s = d500Field.getText();
         if(s.isEmpty()){
            return;
        }
        else{
            long ans = Integer.parseInt(s) * 500;
         // eq500Label.setText("=  Rs. " + Long.toString(ans));
         }
    }//GEN-LAST:event_d500FieldFocusLost

    private void d1000FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1000FieldKeyTyped
        nextBtn.setEnabled(true);
        char c = evt.getKeyChar();
        errorMessageLabel.setVisible(false);

        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_d1000FieldKeyTyped

    private void d1000FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d1000FieldFocusLost
        String s = d1000Field.getText();
         if(s.isEmpty()){
            return;
        }
        else{
            long ans = Integer.parseInt(s) * 1000;
         // eq1000Label.setText("=  Rs. " + Long.toString(ans));
         }
    }//GEN-LAST:event_d1000FieldFocusLost

    private void d2000FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2000FieldKeyTyped
       nextBtn.setEnabled(true);
        char c = evt.getKeyChar();
        errorMessageLabel.setVisible(false);

        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_d2000FieldKeyTyped

    private void d2000FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d2000FieldFocusLost
        String s = d2000Field.getText();
         if(s.isEmpty()){
            return;
        }
        else{
            long ans = Integer.parseInt(s) * 2000;
          //eq2000Label.setText("=  Rs. " + Long.toString(ans));
         }
    }//GEN-LAST:event_d2000FieldFocusLost

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
            java.util.logging.Logger.getLogger(DepositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField d1000Field;
    private javax.swing.JTextField d100Field;
    private javax.swing.JTextField d2000Field;
    private javax.swing.JTextField d500Field;
    private javax.swing.JTextField d50Field;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel rs1000Label;
    private javax.swing.JLabel rs100Label;
    private javax.swing.JLabel rs2000Label;
    private javax.swing.JLabel rs500Label;
    private javax.swing.JLabel rs50Label;
    // End of variables declaration//GEN-END:variables
}
