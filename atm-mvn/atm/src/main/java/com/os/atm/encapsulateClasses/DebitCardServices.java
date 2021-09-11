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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

/**
 *
 * @author smourya
 */
public class DebitCardServices {
//    private List<DebitCard> db= new ArrayList<>();
    private final String pattern = "dd/MM/yyyy";
    private final DateFormat formatter;

    public DebitCardServices() {
        this.formatter = new SimpleDateFormat(pattern);
    }
    
//    public int SearchCard(String searchCardHash, String Card){
////        
////        LocalDate expiryDate= StringToDate(rs.getString(4));
////        DebitCard debitCard = new DebitCard(Card, rs.getString(2), rs.getString(3), expirydate);
////        if()
////        DebitCard debitCard = new DebitCard("12345", "active", "Sidhant", LocalDate.parse("25/08/2021", this.formatter),Boolean.TRUE);
////        db.add(debitCard);
////        return debitCard;
//    }
    public DebitCard Populate(String pinCardHash, String cardHash) throws ParseException, SQLException{
        String query = "select card_no, card_status, card_holder_name, account_no, limit_amt from debit_card where pin = ?  and card_no= ?";
        DebitCard debitCard = null;
//        String sqlQuery1 = "SELECT rs50, rs100, rs500, rs1000, rs2000 FROM `atm_machine` WHERE `machine_id` = 1010000000";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");

            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, pinCardHash);
            pst.setString(2, cardHash);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
//                    String query2 = "select * from account where account_no = ?";
                    AccountServices acc = new AccountServices();
                    Account a = acc.populateAccount(rs.getString("account_no"));
                    String query2 = " select card_num from card_pin_hash where pinHash = ?  and cardHash= ?";
                    PreparedStatement pst2 = con.prepareStatement(query2);
                    pst2.setString(1, pinCardHash);
                    pst2.setString(2, cardHash);
                    ResultSet rs2 = pst2.executeQuery();
                    while(rs2.next()){
                        debitCard = new DebitCard(rs.getString("card_no"), rs.getString("card_status"), rs.getString("card_holder_name"), rs.getInt("limit_amt"), a, rs2.getString("card_num"));
                    }
                    
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DebitCardServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        LocalDate expiryDate= StringToDate(rs.getString(4));
//        DebitCard debitCard = new DebitCard(Card, rs.getString(2), rs.getString(3), expirydate);
//        if(pin is correct or result Set is not empty then initialise the Debicard class and return true)
        
//        db.add(debitCard);
        return debitCard;
    }
    
    public java.util.Date StringToDate(String dd) throws ParseException{
        
        java.util.Date localDate = formatter.parse(dd);
        return localDate;
    }

    public static void main(String[] args) throws ParseException {
//        DebitCardServices db = new DebitCardServices();
        
        
//        String date = "28/01/2026";

        
        
        
//        System.out.println("Today = " + localDate.format(formatter));
//        System.out.println("isAfter: "+ localDate.isBefore(LocalDate.parse("28/02/2021", formatter)));
        
        
//        Date dt= db.StringToDate("20-12-2012");
//        System.out.println("date="+dt);
//        if(dt.after())

    }
}
