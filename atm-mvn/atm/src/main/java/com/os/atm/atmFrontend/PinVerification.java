/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;
import com.os.atm.encapsulateClasses.Account;
import com.os.atm.encapsulateClasses.ATMServices;
import com.os.atm.encapsulateClasses.DebitCard;
import com.os.atm.encapsulateClasses.DebitCardServices;
import com.os.atm.encapsulateClasses.MD5Hashing;
import com.os.atm.encapsulateClasses.PBES_Encryption;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author smourya
 */
@Component
public class PinVerification extends javax.swing.JFrame {

  @Autowired
    private ApplicationContext context;
    /**
     * Creates new form PinVerification
     */
   Timer timer = new Timer();

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                WelcomePage objPage = new WelcomePage();
                 System.out.println("timer PinV");
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
    private String encryptCard;
    private int attempts =3;
    public PinVerification() {
        initComponents();
        this.encryptCard= "7b8802b5aa06e55f70c9d8711213364b";
        iniComponents();
      
        timer.schedule(tt, 120000);
    }
   public PinVerification(String maskedCardNumber, String cardNumberHash){
        initComponents();
        cardNumberLabel.setText(maskedCardNumber);
        iniComponents();
        this.encryptCard = cardNumberHash;   
        
        
        timer.schedule(tt, 120000);
    }
        
   
    private void iniComponents(){
        verifyPin.setText(null);
        verifyPinNum_Btn.setEnabled(Boolean.FALSE);
    }
    public  void initializeComponent(String maskedCardNumber, String cardNumberHash){
        initComponents();
        cardNumberLabel.setText(maskedCardNumber);
        iniComponents();
        this.encryptCard = cardNumberHash;
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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verifyPin, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardNumberLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 150, Short.MAX_VALUE)
                        .addComponent(verifyPinNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cardNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verifyPin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyPinNum_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyPinNum_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPinNum_BtnActionPerformed
        MD5Hashing md = new MD5Hashing(verifyPin.getText());
        DebitCardServices db=new DebitCardServices();
        ATMServices objATMServices = new ATMServices();
//        JOptionPane.showMessageDialog(this, md.getHashText()+"\t"+ verifyPin.getText());
        Boolean pinValid = objATMServices.VerifyPin(md.getHashText(), getEncryptCard());
//        JOptionPane.showMessageDialog(this, pinValid);
        if(attempts > 1 && (!pinValid)){
            attempts -= 1;
            JOptionPane.showMessageDialog(this, "Inccorrect Pin\nAttempts Left "+attempts);
            verifyPin.setText("");
            
        }
        else if(pinValid){
            DebitCard debitCard=null;
            try {
//                JOptionPane.showMessageDialog(this, "hashpin = "+md.getHashText()+" hashcard="+ getEncryptCard());
                debitCard = db.Populate(md.getHashText(), getEncryptCard());
                System.out.println("Debit Card: "+debitCard.getCardHolderName()+"\t "+debitCard.getCardStatus()+" \t"+debitCard.getCard_no()+"\t"+debitCard.getBalcance());
                System.out.println("Account Details: "+ debitCard.getAccNum() +"\t"+debitCard.getCardLimit());
            } catch (ParseException ex) {
                Logger.getLogger(PinVerification.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PinVerification.class.getName()).log(Level.SEVERE, null, ex);
            }
            
              tt.cancel();
              timer.cancel();
              timer.purge();
            Services objServices = new Services(debitCard);
            
//            Services objServices = context.getBean(Services.class);
//            objServices.initializeComponents();
            objServices.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Card Blocked Contact your Bank");
            WelcomePage objWelcomePage =  new WelcomePage();//context.getBean(WelcomePage.class);
            objWelcomePage.createAndShow();
            dispose();
        }
        
    }//GEN-LAST:event_verifyPinNum_BtnActionPerformed

    private void verifyPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyPinKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && verifyPin.getText().length()<4)){
             evt.consume();
        }
        if(verifyPin.getText().isEmpty()){
            verifyPinNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyPin.getText().length()<3){
            verifyPinNum_Btn.setEnabled(Boolean.FALSE);
        }
        else if(verifyPin.getText().length()==3){
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
            java.util.logging.Logger.getLogger(PinVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PinVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PinVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PinVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PinVerification().setVisible(true);
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
