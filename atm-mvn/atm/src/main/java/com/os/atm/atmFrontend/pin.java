/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;
import com.os.atm.encapsulateClasses.Account;
import com.os.atm.encapsulateClasses.ATMServices;
import com.os.atm.encapsulateClasses.DebitCardServices;
import com.os.atm.encapsulateClasses.PBES_Encryption;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author smourya
 */
public class pin extends javax.swing.JFrame {

    /**
     * Creates new form pin
     */
//    private DebitCard dbCard;
    private final String encryptCard;
    private int attempts =3;
    public pin() {
        initComponents();
        this.encryptCard= "test";
        iniComponents();
    }
    public pin(String maskedCardNumber, String cardNumber){
        
        initComponents();
        cardNumberLabel.setText(maskedCardNumber);
        iniComponents();
//        DebitCard db = new DebitCard(, cardNumber, cardNumber, LocalDate.MIN, rootPaneCheckingEnabled)
        this.encryptCard = cardNumber;
    }
    private void iniComponents(){
        verifyPin.setText(null);
        verifyPinNum_Btn.setEnabled(Boolean.FALSE);
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
        verifyPinNum_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        verifyPin = new javax.swing.JPasswordField();
        cardNumberLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Enter the PIN");

        verifyPinNum_Btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        verifyPinNum_Btn.setText("VERIFY");
        verifyPinNum_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verifyPinNum_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPinNum_BtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Your Account Number is");

        verifyPin.setText("jPasswordField1");
        verifyPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPinActionPerformed(evt);
            }
        });
        verifyPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verifyPinKeyTyped(evt);
            }
        });

        cardNumberLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cardNumberLabel.setText("XXXXXXX1234");

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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verifyPinNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifyPin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNumberLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cardNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verifyPin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyPinNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyPinNum_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPinNum_BtnActionPerformed
        // TODO add your handling code here:
        
        PBES_Encryption pbes = new PBES_Encryption(getEncryptCard(), verifyPin.getText());
        DebitCardServices db=new DebitCardServices();
        ATMServices objATMServices = new ATMServices();
        
        Boolean pinValid = objATMServices.VerifyPin(pbes.getEncrypt(), getEncryptCard());
        if(attempts >1 && (!pinValid)){
            attempts -=1;
            JOptionPane.showMessageDialog(this, "Inccorrect Pin\nAttempts Left "+attempts);
            verifyPin.setText("");
            
        }
        else if(pinValid){
            
            Services objServices = new Services();
            objServices.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Card Blocked Contact your Bank");
            welcomPage welcomPage = new welcomPage();
            welcomPage.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_verifyPinNum_BtnActionPerformed

    private void verifyPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyPinKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && verifyPin.getText().length()<4)){
             evt.consume();
        }
        if(verifyPin.getText().isEmpty()){
//            System.out.println("length"+verifyPin.getText().length());
            verifyPinNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyPin.getText().length()<3){
//            System.out.println("length"+verifyPin.getText().length());
            verifyPinNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyPin.getText().length()==3){
//             System.out.println("length"+verifyPin.getText().length());
            verifyPinNum_Btn.setEnabled(Boolean.TRUE);
            if(c == KeyEvent.VK_BACK_SPACE){
                verifyPinNum_Btn.setEnabled(Boolean.FALSE);
            }
//
        }
    }//GEN-LAST:event_verifyPinKeyTyped

    private void verifyPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verifyPinActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField verifyPin;
    private javax.swing.JButton verifyPinNum_Btn;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the encryptCard
     */
    public String getEncryptCard() {
        return encryptCard;
    }
}
