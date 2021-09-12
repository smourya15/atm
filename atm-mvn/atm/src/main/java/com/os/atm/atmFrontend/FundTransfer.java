/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;
import com.os.atm.encapsulateClasses.AccountServices;
import com.os.atm.encapsulateClasses.DebitCard;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Component;
import java.sql.*;
//import java.u
/**
 *
 * @author smourya
 */
@Component
public class FundTransfer extends javax.swing.JFrame {

    /**
     * Creates new form fundTransfer
     */
      Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer FundTransfer");
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
    private DebitCard objDebitCard;
    String debitcard;
    
    
    public FundTransfer() {
        initComponents();
        benAccNoTextField.setText(null);
        reBenAccNoTextField.setText(null);
        trfAmt.setText(null);
        errorMsgLabel.setVisible(false);
        trfConfirmBtn.setEnabled(false);
        
       
        timer.schedule(tt, 120000);
    }

    public FundTransfer(DebitCard debitCard) {
        initComponents();
        this.objDebitCard=debitCard;
        benAccNoTextField.setText(null);
        reBenAccNoTextField.setText(null);
        trfAmt.setText(null);
        errorMsgLabel.setVisible(false);
        trfConfirmBtn.setEnabled(false);
        
      
        timer.schedule(tt, 120000);
        this.debitcard = debitCard.getCard_no();
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
        benAccNoTextField = new javax.swing.JTextField();
        enterAmount = new javax.swing.JLabel();
        trfAmt = new javax.swing.JTextField();
        trfConfirmBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        reBenAccNoTextField = new javax.swing.JTextField();
        errorMsgLabel = new javax.swing.JLabel();
        trfCancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Beneficiary Acc No");

        benAccNoTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        benAccNoTextField.setText("1234567890123456");
        benAccNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benAccNoTextFieldActionPerformed(evt);
            }
        });
        benAccNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                benAccNoTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                benAccNoTextFieldKeyTyped(evt);
            }
        });

        enterAmount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        enterAmount.setText("Enter Amount");

        trfAmt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        trfAmt.setText("000000");
        trfAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trfAmtActionPerformed(evt);
            }
        });
        trfAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trfAmtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                trfAmtKeyTyped(evt);
            }
        });

        trfConfirmBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        trfConfirmBtn.setText("CONFIRM");
        trfConfirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trfConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trfConfirmBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Re-enter Beneficiary Acc No");

        reBenAccNoTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reBenAccNoTextField.setText("1234567890123456");
        reBenAccNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reBenAccNoTextFieldActionPerformed(evt);
            }
        });
        reBenAccNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reBenAccNoTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reBenAccNoTextFieldKeyTyped(evt);
            }
        });

        errorMsgLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        errorMsgLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorMsgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMsgLabel.setText("Error");

        trfCancelBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        trfCancelBtn.setText("CANCEL");
        trfCancelBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trfCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trfCancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Rs.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(benAccNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(reBenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trfCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(trfConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(enterAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trfAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorMsgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(benAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reBenAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(errorMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trfAmt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trfConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trfCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void benAccNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benAccNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_benAccNoTextFieldActionPerformed

    private void trfConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trfConfirmBtnActionPerformed
        // TODO add your handling code here:
        
        
        
        String benAcc = benAccNoTextField.getText();
        String reBenAcc = reBenAccNoTextField.getText();

        
        if(benAcc.isEmpty() || reBenAcc.isEmpty() || trfAmt.getText().isEmpty())
        {
            errorMsgLabel.setText("Please Enter in the empty fields");
            errorMsgLabel.setVisible(true);
            return ;
        }
        
        if(benAcc.equals(reBenAcc))
        {   
            errorMsgLabel.setText("Error");
            errorMsgLabel.setVisible(false);
            int transferAmt = Integer.parseInt(trfAmt.getText());
           // AccountServices a = new AccountServices();
            //a.transferFunds(benAcc, transferAmt, debitCard);


            if(objDebitCard.getBalcance()< (double)transferAmt){
                JOptionPane.showMessageDialog(this, "Insufficient Funds");
                trfAmt.setText(null);
            }
            else{
                
                try{
                    int temp=0;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                    String sqlQuery0="INSERT INTO `atm_transaction`(`machine_id`, `card_num`, `account_no`, `trans_type`, `trans_amt`, `trans_time`, `status`) VALUES (1010000000,?, (SELECT account_no FROM debit_card WHERE card_no=?), 'TRANSFER', ?, (SELECT now()), 'PASSED' )";
                    PreparedStatement pst = con.prepareStatement(sqlQuery0);
                    pst.setString(1, String.valueOf(debitcard));
                    pst.setString(2, String.valueOf(debitcard));
                    pst.setString(3, String.valueOf(transferAmt));
                    pst.execute();
                    
                    String sqlQuery1 = "SELECT acc_bal FROM account WHERE account_no = "+benAcc;
                    pst = con.prepareStatement(sqlQuery1);
                    ResultSet rs = pst.executeQuery();
                    
                    if(!rs.isBeforeFirst()){
                        System.out.println("NO data");
                    }
                    while(rs.next()){
                        temp = Integer.parseInt(rs.getString("acc_bal"));
                    }
                    System.out.println(temp);
                    temp+=transferAmt;
                    System.out.println(temp);
                    String sqlQuery2 = "UPDATE account SET acc_bal = "+temp+" WHERE account_no = "+benAcc;
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate(sqlQuery2);
                    
                                       
                    System.out.println("Successfully Completed Fund Transfer Transaction\t");
                    con.close();
                    objDebitCard.setBalance(objDebitCard.getBalcance()- (double)transferAmt);
                    tt.cancel();
                    timer.cancel();
                    timer.purge();
                    Success objsuccess = new Success(transferAmt,"FUND TRANSFER",objDebitCard, benAcc );
                    objsuccess.setVisible(true);
                    dispose();
                    } 
                    catch (ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
            }
}
            else {
                errorMsgLabel.setText("<html>Account numbers do not match.<br/> Please check and enter again.</html>");
                errorMsgLabel.setVisible(true);
        }
    }//GEN-LAST:event_trfConfirmBtnActionPerformed

    private void trfAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trfAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trfAmtActionPerformed

    private void reBenAccNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reBenAccNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reBenAccNoTextFieldActionPerformed

    private void benAccNoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_benAccNoTextFieldKeyTyped
        char c = evt.getKeyChar();
        
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && benAccNoTextField.getText().length() < 10)){
            evt.consume();
        }
    }//GEN-LAST:event_benAccNoTextFieldKeyTyped

    private void reBenAccNoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reBenAccNoTextFieldKeyTyped
        char c = evt.getKeyChar();
        
        if(!((Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) && reBenAccNoTextField.getText().length() < 10)){
             evt.consume();
        }
    }//GEN-LAST:event_reBenAccNoTextFieldKeyTyped

    private void trfAmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trfAmtKeyTyped
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)){
             evt.consume();
        }
    }//GEN-LAST:event_trfAmtKeyTyped

    private void benAccNoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_benAccNoTextFieldKeyReleased
        char c = evt.getKeyChar();
        if(benAccNoTextField.getText().length() == 10 && reBenAccNoTextField.getText().length() == 10){
            System.out.println("length" + benAccNoTextField.getText().length());
            if(!trfAmt.getText().isEmpty()){
                System.out.println("works");
                trfConfirmBtn.setEnabled(Boolean.TRUE);
            }
        }
        if(c == KeyEvent.VK_BACK_SPACE){
                trfConfirmBtn.setEnabled(Boolean.FALSE);
        }
    }//GEN-LAST:event_benAccNoTextFieldKeyReleased

    private void reBenAccNoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reBenAccNoTextFieldKeyReleased
        char c = evt.getKeyChar();
        if(benAccNoTextField.getText().length() == 10 && reBenAccNoTextField.getText().length() == 10){
            System.out.println("length" + benAccNoTextField.getText().length());
             
            if(!trfAmt.getText().isEmpty()){
                trfConfirmBtn.setEnabled(Boolean.TRUE);
                if(c == KeyEvent.VK_BACK_SPACE){
                    trfConfirmBtn.setEnabled(Boolean.FALSE);
                }
            }
        }
         
        if(c == KeyEvent.VK_BACK_SPACE){
            trfConfirmBtn.setEnabled(Boolean.FALSE);
        }
    }//GEN-LAST:event_reBenAccNoTextFieldKeyReleased

    private void trfAmtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trfAmtKeyReleased
        char c = evt.getKeyChar();
        if(benAccNoTextField.getText().length() == 10 && reBenAccNoTextField.getText().length() == 10){
            System.out.println("length" + benAccNoTextField.getText().length());
             
            if(!trfAmt.getText().isEmpty()){
                trfConfirmBtn.setEnabled(Boolean.TRUE);
            }
        }
        if(trfAmt.getText().isEmpty()){
            trfConfirmBtn.setEnabled(Boolean.FALSE);
        }
    }//GEN-LAST:event_trfAmtKeyReleased

    private void trfCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trfCancelBtnActionPerformed
       int amt;
       amt = Integer.parseInt(trfAmt.getText());
       System.out.println("Amount:\t"+amt);
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
            String sqlQuery0="INSERT INTO `atm_transaction`(`machine_id`, `card_num`, `account_no`, `trans_type`, `trans_amt`, `trans_time`, `status`) VALUES (1010000000,?, (SELECT account_no FROM debit_card WHERE card_no=?), 'TRANSFER', ?, (SELECT now()), 'CANCELLED' )";
                
                    PreparedStatement pst = con.prepareStatement(sqlQuery0);
                    pst.setString(1, String.valueOf(debitcard));
                    pst.setString(2, String.valueOf(debitcard));
                    pst.setString(3, String.valueOf(amt));
                    pst.execute();
                    System.out.println("Successfully Cancelled Fund Transfer Transaction\t");
            
                    tt.cancel();
                    timer.cancel();
                    timer.purge();
                    WelcomePage objPage = new WelcomePage();
                    objPage.createAndShow();
                    objPage.setVisible(true);
                    dispose();
            }
         catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }   
           
        
    }//GEN-LAST:event_trfCancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FundTransfer().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField benAccNoTextField;
    private javax.swing.JLabel enterAmount;
    private javax.swing.JLabel errorMsgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField reBenAccNoTextField;
    private javax.swing.JTextField trfAmt;
    private javax.swing.JButton trfCancelBtn;
    private javax.swing.JButton trfConfirmBtn;
    // End of variables declaration//GEN-END:variables
}
