/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package com.os.atm.atmFrontend;

import java.awt.event.KeyEvent;
/**
 *
 * @author mdesousa
 */
public class DepositConfirm extends javax.swing.JFrame {

    /**
     * Creates new form depositConfirm
     */
    private int D50;
    private int D100;
    private int D500;
    private int D1000;
    private int D2000;
    
    public DepositConfirm() {
       
    
        initComponents();
    }

    public DepositConfirm(int D50, int D100, int D500, int D1000, int D2000){
       
    initComponents();
        this.D50 = D50;
        if (D50==0)
            d50Pane.setVisible(false);
        else{
            d50Notes.setText(String.valueOf(D50));
            eq50Confirm.setText("=  Rs."+D50*50);
        }
        
        this.D100 = D100;
        if (D100==0)
            d100Pane.setVisible(false);
        else {
            d100Notes.setText(String.valueOf(D100));
            eq100Confirm.setText("=  Rs."+D100*100);
        }
        
        this.D500 = D500;
        if (D500==0)
            d500Pane.setVisible(false);
        else{
            d500Notes.setText(String.valueOf(D500));
            eq500Confirm.setText("=  Rs."+D500*500);
        }
        
        this.D1000 = D1000;
         if (D1000==0)
            d1000Pane.setVisible(false);
         else{
              d1000Notes.setText(String.valueOf(D1000));
              eq1000Confirm.setText("=  Rs."+D1000*1000);
        }
        
        this.D2000 = D2000;
        if (D2000==0)
            d2000Pane.setVisible(false);
        else {
               d2000Notes.setText(String.valueOf(D2000));
               eq2000Confirm.setText("=  Rs."+D2000*2000);
        }
        
        String  total= String.valueOf(D50*50+D100*100+D500*500+D1000*1000+D2000*2000);
        displaytotal.setText(total);
        
        
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        d50Pane = new javax.swing.JDesktopPane();
        rs50Label = new javax.swing.JLabel();
        d50Notes = new javax.swing.JLabel();
        eq50Confirm = new javax.swing.JLabel();
        d100Pane = new javax.swing.JDesktopPane();
        rs100Label = new javax.swing.JLabel();
        d100Notes = new javax.swing.JLabel();
        eq100Confirm = new javax.swing.JLabel();
        d500Pane = new javax.swing.JDesktopPane();
        rs500Label = new javax.swing.JLabel();
        d500Notes = new javax.swing.JLabel();
        eq500Confirm = new javax.swing.JLabel();
        d1000Pane = new javax.swing.JDesktopPane();
        rs1000Label = new javax.swing.JLabel();
        d1000Notes = new javax.swing.JLabel();
        eq1000Confirm = new javax.swing.JLabel();
        d2000Pane = new javax.swing.JDesktopPane();
        rs2000Label = new javax.swing.JLabel();
        d2000Notes = new javax.swing.JLabel();
        eq2000Confirm = new javax.swing.JLabel();
        depositbutton = new javax.swing.JButton();
        backtoselectdenomination = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        displaytotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("SUMMARY");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("ABC BANK CASH DEPOSIT");

        d50Pane.setBackground(new java.awt.Color(204, 204, 204));
        d50Pane.setForeground(new java.awt.Color(255, 255, 255));

        rs50Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs50Label.setForeground(new java.awt.Color(255, 255, 255));
        rs50Label.setText("Rs. 50              X");

        d50Notes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        d50Notes.setForeground(new java.awt.Color(255, 255, 255));
        d50Notes.setText("0");

        eq50Confirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq50Confirm.setForeground(new java.awt.Color(255, 255, 255));
        eq50Confirm.setText("=  Rs. 0000");

        d50Pane.setLayer(rs50Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d50Pane.setLayer(d50Notes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d50Pane.setLayer(eq50Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout d50PaneLayout = new javax.swing.GroupLayout(d50Pane);
        d50Pane.setLayout(d50PaneLayout);
        d50PaneLayout.setHorizontalGroup(
            d50PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d50PaneLayout.createSequentialGroup()
                .addComponent(rs50Label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(d50Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eq50Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        d50PaneLayout.setVerticalGroup(
            d50PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d50PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d50PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs50Label)
                    .addComponent(eq50Confirm)
                    .addComponent(d50Notes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d100Pane.setBackground(new java.awt.Color(204, 204, 204));
        d100Pane.setForeground(new java.awt.Color(255, 255, 255));

        rs100Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs100Label.setForeground(new java.awt.Color(255, 255, 255));
        rs100Label.setText("Rs. 100           X");

        d100Notes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        d100Notes.setForeground(new java.awt.Color(255, 255, 255));
        d100Notes.setText("0");

        eq100Confirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq100Confirm.setForeground(new java.awt.Color(255, 255, 255));
        eq100Confirm.setText("=  Rs. 0000");

        d100Pane.setLayer(rs100Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d100Pane.setLayer(d100Notes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d100Pane.setLayer(eq100Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout d100PaneLayout = new javax.swing.GroupLayout(d100Pane);
        d100Pane.setLayout(d100PaneLayout);
        d100PaneLayout.setHorizontalGroup(
            d100PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d100PaneLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rs100Label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(d100Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eq100Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        d100PaneLayout.setVerticalGroup(
            d100PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d100PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d100PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq100Confirm)
                    .addComponent(d100Notes)
                    .addComponent(rs100Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d500Pane.setBackground(new java.awt.Color(204, 204, 204));
        d500Pane.setForeground(new java.awt.Color(255, 255, 255));

        rs500Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs500Label.setForeground(new java.awt.Color(255, 255, 255));
        rs500Label.setText("Rs. 500            X");

        d500Notes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        d500Notes.setForeground(new java.awt.Color(255, 255, 255));
        d500Notes.setText("0");

        eq500Confirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq500Confirm.setForeground(new java.awt.Color(255, 255, 255));
        eq500Confirm.setText("=  Rs. 0000");

        d500Pane.setLayer(rs500Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d500Pane.setLayer(d500Notes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d500Pane.setLayer(eq500Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout d500PaneLayout = new javax.swing.GroupLayout(d500Pane);
        d500Pane.setLayout(d500PaneLayout);
        d500PaneLayout.setHorizontalGroup(
            d500PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d500PaneLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rs500Label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(d500Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eq500Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        d500PaneLayout.setVerticalGroup(
            d500PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d500PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d500PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq500Confirm)
                    .addComponent(rs500Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d500Notes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d1000Pane.setBackground(new java.awt.Color(204, 204, 204));
        d1000Pane.setForeground(new java.awt.Color(255, 255, 255));

        rs1000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs1000Label.setForeground(new java.awt.Color(255, 255, 255));
        rs1000Label.setText("Rs. 1000          X");

        d1000Notes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        d1000Notes.setForeground(new java.awt.Color(255, 255, 255));
        d1000Notes.setText("0");

        eq1000Confirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq1000Confirm.setForeground(new java.awt.Color(255, 255, 255));
        eq1000Confirm.setText("=  Rs. 0000");

        d1000Pane.setLayer(rs1000Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d1000Pane.setLayer(d1000Notes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d1000Pane.setLayer(eq1000Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout d1000PaneLayout = new javax.swing.GroupLayout(d1000Pane);
        d1000Pane.setLayout(d1000PaneLayout);
        d1000PaneLayout.setHorizontalGroup(
            d1000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d1000PaneLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rs1000Label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(d1000Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eq1000Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        d1000PaneLayout.setVerticalGroup(
            d1000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d1000PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d1000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq1000Confirm)
                    .addComponent(d1000Notes)
                    .addComponent(rs1000Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d2000Pane.setBackground(new java.awt.Color(204, 204, 204));
        d2000Pane.setForeground(new java.awt.Color(255, 255, 255));

        rs2000Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rs2000Label.setForeground(new java.awt.Color(255, 255, 255));
        rs2000Label.setText("Rs. 2000          X");

        d2000Notes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        d2000Notes.setForeground(new java.awt.Color(255, 255, 255));
        d2000Notes.setText("0");

        eq2000Confirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eq2000Confirm.setForeground(new java.awt.Color(255, 255, 255));
        eq2000Confirm.setText("=  Rs. 0000");

        d2000Pane.setLayer(rs2000Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d2000Pane.setLayer(d2000Notes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        d2000Pane.setLayer(eq2000Confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout d2000PaneLayout = new javax.swing.GroupLayout(d2000Pane);
        d2000Pane.setLayout(d2000PaneLayout);
        d2000PaneLayout.setHorizontalGroup(
            d2000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d2000PaneLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rs2000Label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(d2000Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eq2000Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        d2000PaneLayout.setVerticalGroup(
            d2000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d2000PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(d2000PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq2000Confirm)
                    .addComponent(d2000Notes)
                    .addComponent(rs2000Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositbutton.setBackground(new java.awt.Color(255, 255, 255));
        depositbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        depositbutton.setForeground(new java.awt.Color(0, 85, 124));
        depositbutton.setText("DEPOSIT");
        depositbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositbuttonActionPerformed(evt);
            }
        });

        backtoselectdenomination.setBackground(new java.awt.Color(255, 255, 255));
        backtoselectdenomination.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backtoselectdenomination.setForeground(new java.awt.Color(0, 86, 126));
        backtoselectdenomination.setText("BACK");
        backtoselectdenomination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoselectdenominationActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        displaytotal.setBackground(new java.awt.Color(0, 0, 0));
        displaytotal.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        displaytotal.setForeground(new java.awt.Color(255, 255, 255));
        displaytotal.setText("0000");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL  =");

        jDesktopPane1.setLayer(displaytotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(displaytotal)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(displaytotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d50Pane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d100Pane)
                    .addComponent(d500Pane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d1000Pane)
                    .addComponent(d2000Pane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backtoselectdenomination, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(d50Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d100Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d500Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d1000Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(d2000Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(backtoselectdenomination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositbuttonActionPerformed
       
    	
    	Success objsuccess = new Success(String.valueOf(D50*50+D100*100+D500*500+D1000*1000+D2000*2000));
        objsuccess.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_depositbuttonActionPerformed

    private void backtoselectdenominationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoselectdenominationActionPerformed
        SelectDenominations deposit= new SelectDenominations();
        deposit.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoselectdenominationActionPerformed

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
            java.util.logging.Logger.getLogger(DepositConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositConfirm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtoselectdenomination;
    private javax.swing.JLabel d1000Notes;
    private javax.swing.JDesktopPane d1000Pane;
    private javax.swing.JLabel d100Notes;
    private javax.swing.JDesktopPane d100Pane;
    private javax.swing.JLabel d2000Notes;
    private javax.swing.JDesktopPane d2000Pane;
    private javax.swing.JLabel d500Notes;
    private javax.swing.JDesktopPane d500Pane;
    private javax.swing.JLabel d50Notes;
    private javax.swing.JDesktopPane d50Pane;
    private javax.swing.JButton depositbutton;
    private javax.swing.JLabel displaytotal;
    private javax.swing.JLabel eq1000Confirm;
    private javax.swing.JLabel eq100Confirm;
    private javax.swing.JLabel eq2000Confirm;
    private javax.swing.JLabel eq500Confirm;
    private javax.swing.JLabel eq50Confirm;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel rs1000Label;
    private javax.swing.JLabel rs100Label;
    private javax.swing.JLabel rs2000Label;
    private javax.swing.JLabel rs500Label;
    private javax.swing.JLabel rs50Label;
    // End of variables declaration//GEN-END:variables
}
