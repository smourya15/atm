/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulateClasses;

/**
 *
 * @author smourya
 */
public class ATMServices {
    
    //verify the card status
    //if card is active return true else if blocked return false
    public Boolean verifyCard(String hashCardValue){
        //select card-No, from atm where card_no = hashCardValue.parseInt something.
        return Boolean.FALSE;
    }
    
    //verify pin 
    //if matched return true, else  subtract one tries and wait for 3 tries then return false.
    public Boolean verifyPin(String hashPinValue){
        //select pin, from atm where pin = hashpinValue.parseInt something. that parse Int should be for databse datatype if it is String or text then no parseINT will exist i believe, else need to match the data type of both 
        return Boolean.FALSE;
    }
    
    public Boolean callWithdrawNodule(){
         return Boolean.FALSE;
    }
    
}
