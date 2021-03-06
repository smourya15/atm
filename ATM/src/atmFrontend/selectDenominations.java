/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmFrontend;

import java.awt.event.ItemEvent;

/**
 *
 * @author smourya
 */
public class selectDenominations extends javax.swing.JFrame {

    /**
     * Creates new form depositCash
     */
    public selectDenominations() {
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

        jLabel1 = new javax.swing.JLabel();
        D50_checkbox = new javax.swing.JCheckBox();
        D500_checkbox = new javax.swing.JCheckBox();
        D100_checkbox = new javax.swing.JCheckBox();
        D1000_checkbox = new javax.swing.JCheckBox();
        D2000_checkbox = new javax.swing.JCheckBox();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Select Denominations");

        D50_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D50_checkbox.setText("Rs. 50");
        D50_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D50_checkboxActionPerformed(evt);
            }
        });

        D500_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D500_checkbox.setText("Rs. 500");

        D100_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D100_checkbox.setText("Rs. 100");
        D100_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D100_checkboxActionPerformed(evt);
            }
        });

        D1000_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D1000_checkbox.setText("Rs. 1000");

        D2000_checkbox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        D2000_checkbox.setText("Rs. 2000");

        nextBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        homeBtn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        homeBtn.setText("HOME");
        homeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(D50_checkbox)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D100_checkbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D500_checkbox))
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D1000_checkbox)
                                .addGap(18, 18, 18)
                                .addComponent(D2000_checkbox)))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D50_checkbox)
                    .addComponent(D100_checkbox)
                    .addComponent(D500_checkbox)
                    .addComponent(D1000_checkbox)
                    .addComponent(D2000_checkbox))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D50_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D50_checkboxActionPerformed
        // TODO add your handling code here:
       
         
        
    }//GEN-LAST:event_D50_checkboxActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        boolean d50 = D50_checkbox.isSelected();
        boolean d100 = D100_checkbox.isSelected();
        boolean d500 = D500_checkbox.isSelected();
        boolean d1000= D1000_checkbox.isSelected();
        boolean d2000 = D2000_checkbox.isSelected();
         
        depositAmount objDeposit = new depositAmount(d50,d100,d500,d1000,d2000);
        objDeposit.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void D100_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D100_checkboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D100_checkboxActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(selectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectDenominations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectDenominations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox D1000_checkbox;
    private javax.swing.JCheckBox D100_checkbox;
    private javax.swing.JCheckBox D2000_checkbox;
    private javax.swing.JCheckBox D500_checkbox;
    private javax.swing.JCheckBox D50_checkbox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
