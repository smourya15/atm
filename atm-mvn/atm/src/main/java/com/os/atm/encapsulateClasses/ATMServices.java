/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smourya
 */
public class ATMServices {
//    private final String ACTIVE="ACTIVE";
    private final String BLOCKED="BLOCKED";
    //verify the card status
    //if card is active return true else if blocked return false
    public int verifyCard(String searchCardHash){
        String query = "select card_status from debit_card where card_no = ? ";
        Connection con = (new DatabaseConnections()).databaseCon();
        try{
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, searchCardHash);
        ResultSet rs = pst.executeQuery();
        
            if(!rs.isBeforeFirst()){
                return 1;
            }
            while(rs.next()){
                if(rs.getString("card_status").equals(this.BLOCKED)){
                    return 2;
                }
                else{
                    return 3;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        }
        //select card-No, from atm where card_no = hashCardValue.parseInt something.
//        return Boolean.FALSE;
        return 0;
    }
    
    //verify pin 
    //if matched return true, else  subtract one tries and wait for 3 tries then return false.
    public Boolean VerifyPin(String pinCardHash, String cardHash){
        String query = "select card_status from debit_card where pin =  ? and card_no= ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");

            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, pinCardHash);
            pst.setString(2, cardHash);
            ResultSet rs= pst.executeQuery();
            if(!rs.isBeforeFirst()){
                return Boolean.FALSE;
            }
            while(rs.next()){
                return  Boolean.TRUE;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DebitCardServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ATMServices.class.getName()).log(Level.SEVERE, null, ex);
            return Boolean.FALSE;
        }
//        LocalDate expiryDate= StringToDate(rs.getString(4));
//        DebitCard debitCard = new DebitCard(Card, rs.getString(2), rs.getString(3), expirydate);
//        if(pin is correct or result Set is not empty then  return true)
//                return Boolean.TRUE
//        DebitCard debitCard = new DebitCard("12345", "active", "Sidhant", LocalDate.parse("25/08/2021", this.formatter),Boolean.TRUE);
//        db.add(debitCard);
        return Boolean.FALSE;
    }
    
    public Boolean callWithdrawNodule(){

         return Boolean.FALSE;

        
    }
    
    
}
