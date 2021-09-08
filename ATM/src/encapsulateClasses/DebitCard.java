/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulateClasses;

import java.time.LocalDate;

/**
 *
 * @author smourya
 */
public class DebitCard {
    private final String card_no;
    private final String cardStatus;
    private final String cardHolderName;
    private final LocalDate expiryDate;
    private final Boolean status; //to check if card is found or not.

    public DebitCard(String card_no, String cardStatus, String cardHolderName, LocalDate expiryDate, Boolean status) {
        this.card_no = card_no;
        this.cardStatus = cardStatus;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }    
    /**
     * Get the value of expiryDate
     *
     * @return the value of expiryDate
     */
    public String getExpiryDate() {
        return expiryDate.toString();
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
    

}
