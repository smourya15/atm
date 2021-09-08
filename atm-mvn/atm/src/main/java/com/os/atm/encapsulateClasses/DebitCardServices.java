/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public DebitCard Populate(String pinCardHash, String cardHash) throws ParseException{
        String query = "select card_num, card_status, cardholder_name, expiry_date from debit_card where pin =  "+pinCardHash + "and card_num="+cardHash;
//        LocalDate expiryDate= StringToDate(rs.getString(4));
//        DebitCard debitCard = new DebitCard(Card, rs.getString(2), rs.getString(3), expirydate);
//        if(pin is correct or result Set is not empty then initialise the Debicard class and return true)
        DebitCard debitCard = new DebitCard("12345", "active", "Sidhant", formatter.parse("25/08/2021"),Boolean.TRUE);
//        db.add(debitCard);
        return debitCard;
    }
    
    public java.util.Date StringToDate(String dd) throws ParseException{
        
        java.util.Date localDate = formatter.parse(dd);
        return localDate;
    }
    
    public static void main(String[] args) throws ParseException {
        DebitCardServices db = new DebitCardServices();
        
        
        String date = "28/01/2026";

        
        
        
//        System.out.println("Today = " + localDate.format(formatter));
//        System.out.println("isAfter: "+ localDate.isBefore(LocalDate.parse("28/02/2021", formatter)));
        
        
//        Date dt= db.StringToDate("20-12-2012");
//        System.out.println("date="+dt);
//        if(dt.after())

    }
}
