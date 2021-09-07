/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulateClasses;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author smourya
 */
public class DebitCardServices {
//    private List<DebitCard> db= new ArrayList<>();
    private final String pattern = "dd/MM/yyyy";
    private final DateTimeFormatter formatter;

    public DebitCardServices() {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
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
    public DebitCard Populate(String pinCardHash, String cardHash){
        String query = "select card_num, card_status, cardholder_name, expiry_date from debit_card where pin =  "+pinCardHash + "and card_num="+cardHash;
//        LocalDate expiryDate= StringToDate(rs.getString(4));
//        DebitCard debitCard = new DebitCard(Card, rs.getString(2), rs.getString(3), expirydate);
//        if(pin is correct or result Set is not empty then initialise the Debicard class and return true)
        DebitCard debitCard = new DebitCard("12345", "active", "Sidhant", LocalDate.parse("25/08/2021", this.formatter),Boolean.TRUE);
//        db.add(debitCard);
        return debitCard;
    }
    
    public LocalDate StringToDate(String Date) throws ParseException{
        
        LocalDate localDate = LocalDate.parse(Date, formatter);
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
