/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmFrontend;
import encapsulateClasses.AccountServices;
import java.awt.event.KeyEvent;
//import java.u
/**
 *
 * @author smourya
 */
public class fundTransfer extends javax.swing.JFrame {

    /**
     * Creates new form fundTransfer
     */
    public fundTransfer() {
        initComponents();
        BenAccNoTextField.setText(null);
        ReBenAccNoTextField.setText(null);
        trfAmt.setText(null);
        ErrorMessage.setVisible(false);
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
        BenAccNoTextField = new javax.swing.JTextField();
        EnterAmount = new javax.swing.JLabel();
        trfAmt = new javax.swing.JTextField();
        trfConfirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ReBenAccNoTextField = new javax.swing.JTextField();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Beneficiary Acc No");

        BenAccNoTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BenAccNoTextField.setText("12345678901");
        BenAccNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenAccNoTextFieldActionPerformed(evt);
            }
        });
        BenAccNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BenAccNoTextFieldKeyTyped(evt);
            }
        });

        EnterAmount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        EnterAmount.setText("Enter Amount");

        trfAmt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        trfAmt.setText("000000");
        trfAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trfAmtActionPerformed(evt);
            }
        });
        trfAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                trfAmtKeyTyped(evt);
            }
        });

        trfConfirm.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        trfConfirm.setText("CONFIRM");
        trfConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trfConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trfConfirmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Re-enter Beneficiary Acc No");

        ReBenAccNoTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ReBenAccNoTextField.setText("12345678901");
        ReBenAccNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReBenAccNoTextFieldActionPerformed(evt);
            }
        });
        ReBenAccNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ReBenAccNoTextFieldKeyTyped(evt);
            }
        });

        ErrorMessage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 51, 51));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorMessage.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trfConfirm)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EnterAmount)
                                        .addGap(15, 15, 15)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trfAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReBenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ReBenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trfAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(trfConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BenAccNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenAccNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BenAccNoTextFieldActionPerformed

    private void trfConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trfConfirmActionPerformed
        // TODO add your handling code here:
        
        
        
        String benAcc = BenAccNoTextField.getText();
        String reBenAcc=ReBenAccNoTextField.getText();

        
        if(benAcc.isEmpty() || reBenAcc.isEmpty() || trfAmt.getText().isEmpty())
        {
            ErrorMessage.setText("Please Enter in the empty fields");
            ErrorMessage.setVisible(true);
            return ;
        }
        
        if(benAcc.equals(reBenAcc))
        { 
            ErrorMessage.setText("Error");
            ErrorMessage.setVisible(false);
            long transferAmt = Long.parseLong(trfAmt.getText());
            AccountServices a = new AccountServices();
        a.transferFunds(benAcc, transferAmt);
        success objsuccess = new success("Funds Transfered");
        
        objsuccess.setVisible(true);
        dispose();
        } else {
//            System.out.println("Check your account numbers");
            ErrorMessage.setText("<html>Account numbers do not match.<br/> Please check and enter again.</html>");
            ErrorMessage.setVisible(true);

        }
        
       
        
    }//GEN-LAST:event_trfConfirmActionPerformed

    private void trfAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trfAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trfAmtActionPerformed

    private void ReBenAccNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReBenAccNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReBenAccNoTextFieldActionPerformed

    private void BenAccNoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BenAccNoTextFieldKeyTyped
        char c = evt.getKeyChar();
        
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && BenAccNoTextField.getText().length()<16)){
             evt.consume();
        }
    }//GEN-LAST:event_BenAccNoTextFieldKeyTyped

    private void ReBenAccNoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReBenAccNoTextFieldKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && ReBenAccNoTextField.getText().length()<16)){
             evt.consume();
        }
    }//GEN-LAST:event_ReBenAccNoTextFieldKeyTyped

    private void trfAmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trfAmtKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)){
             evt.consume();
        }

    }//GEN-LAST:event_trfAmtKeyTyped

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
            java.util.logging.Logger.getLogger(fundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fundTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BenAccNoTextField;
    private javax.swing.JLabel EnterAmount;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JTextField ReBenAccNoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField trfAmt;
    private javax.swing.JButton trfConfirm;
    // End of variables declaration//GEN-END:variables
}
