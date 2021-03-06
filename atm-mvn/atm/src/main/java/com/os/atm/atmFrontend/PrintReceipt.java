/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.atmFrontend;

import com.os.atm.encapsulateClasses.DebitCard;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author skorgaonkar
 */
public class PrintReceipt extends javax.swing.JFrame {
    
    String tType;
    private DebitCard objDebitCard;
    private String amount;
    private String benificiaryAccount;
    /**
     * Creates new form PrintReceipt
     */
     Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                 System.out.println("timer success2");
                WelcomePage objPage = new WelcomePage();
                objPage.createAndShow();
                objPage.setVisible(true);
                dispose();
            };
        }; 
   public PrintReceipt() throws HeadlessException {
       initComponents();
    }

    public PrintReceipt(String txnType, DebitCard db, String amt, String benificiaryAccount) {
        initComponents();
        this.amount = amt;
        this.tType = txnType;
        this.objDebitCard = db;
        this.benificiaryAccount = benificiaryAccount;
        setDateTime();
        printTransaction();
        timer.schedule(tt, 10000);
        
    }
    

    public PrintReceipt(String balance_enquiry, DebitCard debitCard) {
        initComponents();
        this.tType = balance_enquiry;
        this.objDebitCard = debitCard;
        setDateTime();
        printTransaction();
    }
    private void setDateTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        DisplayDate.setText(formatter.format(date));
        formatter = new SimpleDateFormat("HH:mm:ss");
        DisplayTime.setText(formatter.format(date));
    }
  

    
    public void printTransaction() {
    // Menu driven program
    

     try{
        int temp;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        String sqlQuery1 = "SELECT trans_id FROM atm_transaction ORDER BY trans_time DESC LIMIT 1";
        PreparedStatement pst = con.prepareStatement(sqlQuery1);
        ResultSet rs = pst.executeQuery();
        while(rs.next())
            dispTxn.setText(rs.getString("trans_id"));
        con.close();
                           
                    
     }
     catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
    }


    switch(tType){
        
        case "WITHDRAW" : {
            String cardNumber = objDebitCard.getCardNoUn().substring(0, 2) + "XX-XXXX-XXXX-" + objDebitCard.getCardNoUn().substring(12, 16);
            DisplayCardNumber.setText(cardNumber);
            txnTypeLabel.setText(tType);
            ToAccountNumberLabel.setText("NA");
            TxnAmountlabel.setText(amount);
            AvailableBalancelabel.setText(Double.toString(objDebitCard.getBalance()));
            FromAccNumberLabel.setText(objDebitCard.getAccNum());
            
            break;
            
            
        }   
        case "DEPOSIT" : {
            
            String cardNumber = objDebitCard.getCardNoUn().substring(0, 2) + "XX-XXXX-XXXX-" + objDebitCard.getCardNoUn().substring(12, 16);
            DisplayCardNumber.setText(cardNumber);
            txnTypeLabel.setText(tType);
            FromAccNumberLabel.setText("NA");
            TxnAmountlabel.setText(amount);
            AvailableBalancelabel.setText(Double.toString(objDebitCard.getBalance()));
            ToAccountNumberLabel.setText(objDebitCard.getAccNum());
            break;
        }
        case "FUND TRANSFER" :{
            String cardNumber = objDebitCard.getCardNoUn().substring(0, 2) + "XX-XXXX-XXXX-" + objDebitCard.getCardNoUn().substring(12, 16);
            DisplayCardNumber.setText(cardNumber);
            txnTypeLabel.setText(tType);
            FromAccNumberLabel.setText(objDebitCard.getAccNum());
            TxnAmountlabel.setText(amount);
            AvailableBalancelabel.setText(Double.toString(objDebitCard.getBalance()));
            ToAccountNumberLabel.setText(benificiaryAccount);
            break;
        }
        
        case "BALANCE ENQUIRY" : {
            
            String cardNumber = objDebitCard.getCardNoUn().substring(0, 2) + "XX-XXXX-XXXX-" + objDebitCard.getCardNoUn().substring(12, 16);
            DisplayCardNumber.setText(cardNumber);
            txnTypeLabel.setText(tType);
            ToAccountNumberLabel.setText("NA");
            TxnAmountlabel.setText(amount);
            AvailableBalancelabel.setText(Double.toString(objDebitCard.getBalance()));
            FromAccNumberLabel.setText(objDebitCard.getAccNum());
            break;
        }
        
    }
    
    
        
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankNameLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DisplayDate = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        DisplayTime = new javax.swing.JLabel();
        CardNumbelLabel = new javax.swing.JLabel();
        DisplayCardNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        atmId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dispTxn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txnTypeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FromAccNumberLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxnAmountlabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AvailableBalancelabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ToAccountNumberLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BankNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BankNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BankNameLabel.setText("ABC BANK");

        DateLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DateLabel.setText("Date:");

        DisplayDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DisplayDate.setText("1/1/21");

        TimeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("Time");

        DisplayTime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DisplayTime.setText("10:10 AM");

        CardNumbelLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CardNumbelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CardNumbelLabel.setText("CARD NUMBER: ");

        DisplayCardNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DisplayCardNumber.setText("5132 XXXX XXXX XX09");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("ATM ID:");

        atmId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        atmId.setText("1010000000");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("TXN NO.:");

        dispTxn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dispTxn.setText("1234");

        jLabel5.setText("TXN TYPE:");

        txnTypeLabel.setText("WITHDRAWAL");

        jLabel7.setText("FROM A/C:");

        FromAccNumberLabel.setText("00XXXXXXX12");

        jLabel9.setText("Rs.");

        TxnAmountlabel.setText("10000.00");

        jLabel11.setText("AVAILABLE BAL:");

        AvailableBalancelabel.setText("12345.67");

        jLabel13.setText("TXN AMT:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("THANK YOU");

        jLabel15.setText("Rs.");

        jLabel16.setText("TO A/C:");

        ToAccountNumberLabel.setText("00XXXXXXX12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BankNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DisplayDate)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(TimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DisplayTime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CardNumbelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(DisplayCardNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atmId)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txnTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispTxn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(AvailableBalancelabel))
                            .addComponent(FromAccNumberLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(TxnAmountlabel))
                            .addComponent(ToAccountNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(BankNameLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DisplayDate)
                    .addComponent(TimeLabel)
                    .addComponent(DisplayTime))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(atmId))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardNumbelLabel)
                    .addComponent(DisplayCardNumber))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dispTxn))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txnTypeLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FromAccNumberLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ToAccountNumberLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(TxnAmountlabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(AvailableBalancelabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PrintReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableBalancelabel;
    private javax.swing.JLabel BankNameLabel;
    private javax.swing.JLabel CardNumbelLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DisplayCardNumber;
    private javax.swing.JLabel DisplayDate;
    private javax.swing.JLabel DisplayTime;
    private javax.swing.JLabel FromAccNumberLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel ToAccountNumberLabel;
    private javax.swing.JLabel TxnAmountlabel;
    private javax.swing.JLabel atmId;
    private javax.swing.JLabel dispTxn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txnTypeLabel;
    // End of variables declaration//GEN-END:variables
}
