/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

//import java.time.LocalDate;

import java.util.Date;


/**
 *
 * @author smourya
 */
public class DebitCard {
    private final String card_no;
    private final String cardStatus;
    private final String cardHolderName;
    private  long cardLimit;
//    private final Boolean status; //to check if card is found or not.
    private final Account accNum;
    private final String cardNoUn;

    public DebitCard(String card_no, String cardStatus, String cardHolderName, long cardLimit, Account accNum, String cardNoUn) {
        this.card_no = card_no;
        this.cardStatus = cardStatus;
        this.cardHolderName = cardHolderName;
        this.cardLimit = cardLimit;
//        this.status = status;
        this.accNum = accNum;
        this.cardNoUn = cardNoUn;
    }

//    public Boolean getStatus() {
//        return status;
//    }    

    public long getCardLimit() {
        return cardLimit;
    }

    /**
     * Get the value of expiryDate
     *
     * @return the value of expiryDate
     */
    public String getAccNum() {
        return accNum.getAccNum();
    }

    /**
     * Get the value of cardHolderName
     *
     * @return the value of cardHolderName
     */
    public String getCardHolderName() {
        return cardHolderName;
    }


    /**
     * Get the value of cardStatus
     *
     * @return the value of cardStatus
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * @return the card_no
     */
    public String getCard_no() {
        return card_no;
    }
    public double getBalcance(){
        return this.accNum.getAccount_Bal();
    }

    public String getCardNoUn() {
        return cardNoUn;
    }
    

}
