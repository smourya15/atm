/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmFrontend;

import java.awt.event.KeyEvent;

/**
 *
 * @author smourya
 */
public class depositAmount extends javax.swing.JFrame {

    /**
     * Creates new form depositAmount
     */
    public depositAmount() {
        initComponents();
//        d50Field.setText("");
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
        homeButton = new javax.swing.JButton();
        d50Field = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        rs100Label = new javax.swing.JLabel();
        rs500Label = new javax.swing.JLabel();
        rs1000Label = new javax.swing.JLabel();
        rs2000Label = new javax.swing.JLabel();
        d100Field = new javax.swing.JTextField();
        d500Field = new javax.swing.JTextField();
        d1000Field = new javax.swing.JTextField();
        d2000Field = new javax.swing.JTextField();
        eq100Label = new javax.swing.JLabel();
        eq1000Label = new javax.swing.JLabel();
        eq50Label = new javax.swing.JLabel();
        eq500Label = new javax.swing.JLabel();
        eq2000Label = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        eqTotalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rs50Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs50Label.setText("Rs. 50          X");

        homeButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        homeButton.setText("HOME");
        homeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        d50Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d50Field.setText("Enter No. of Notes");
        d50Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d50FieldActionPerformed(evt);
            }
        });
        d50Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d50FieldKeyTyped(evt);
            }
        });

        depositButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        depositButton.setText("DEPOSIT");
        depositButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
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
        d100Field.setText("Enter No. of Notes");
        d100Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d100FieldActionPerformed(evt);
            }
        });

        d500Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d500Field.setText("Enter No. of Notes");
        d500Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d500FieldActionPerformed(evt);
            }
        });

        d1000Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d1000Field.setText("Enter No. of Notes");
        d1000Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1000FieldActionPerformed(evt);
            }
        });

        d2000Field.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        d2000Field.setText("Enter No. of Notes");
        d2000Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2000FieldActionPerformed(evt);
            }
        });

        eq100Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq100Label.setText("=           Rs. 0000");

        eq1000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq1000Label.setText("=           Rs. 0000");

        eq50Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq50Label.setText("=           Rs. 0000");

        eq500Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq500Label.setText("=           Rs. 0000");

        eq2000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq2000Label.setText("=           Rs. 0000");

        totalLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        totalLabel.setText("TOTAL");

        eqTotalLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eqTotalLabel.setText("=         Rs. 00000");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Enter the number of notes for the denominations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eqTotalLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depositButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rs50Label)
                                .addComponent(rs2000Label)
                                .addComponent(rs100Label)
                                .addComponent(rs500Label)
                                .addComponent(rs1000Label))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(d100Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d50Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eq50Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(eq100Label, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(d1000Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(d500Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(d2000Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(eq500Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(eq1000Label))
                                        .addComponent(eq2000Label, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d50Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq50Label)
                    .addComponent(rs50Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d100Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq100Label)
                    .addComponent(rs100Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d500Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq500Label)
                    .addComponent(rs500Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1000Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq1000Label)
                    .addComponent(rs1000Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d2000Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq2000Label)
                    .addComponent(rs2000Label))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(eqTotalLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d50FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d50FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d50FieldActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositButtonActionPerformed

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
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(c == KeyEvent.VK_BACK_SPACE || Character.isDigit(c))){
             evt.consume();
        }
        int ans = Integer.parseInt(d50Field.getText())*50;
        eq50Label.setText("Rs. " + ans);
    }//GEN-LAST:event_d50FieldKeyTyped

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
            java.util.logging.Logger.getLogger(depositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(depositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(depositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(depositAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new depositAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d1000Field;
    private javax.swing.JTextField d100Field;
    private javax.swing.JTextField d2000Field;
    private javax.swing.JTextField d500Field;
    private javax.swing.JTextField d50Field;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel eq1000Label;
    private javax.swing.JLabel eq100Label;
    private javax.swing.JLabel eq2000Label;
    private javax.swing.JLabel eq500Label;
    private javax.swing.JLabel eq50Label;
    private javax.swing.JLabel eqTotalLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel rs1000Label;
    private javax.swing.JLabel rs100Label;
    private javax.swing.JLabel rs2000Label;
    private javax.swing.JLabel rs500Label;
    private javax.swing.JLabel rs50Label;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
