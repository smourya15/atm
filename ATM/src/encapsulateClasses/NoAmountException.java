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
public class NoAmountException extends Exception{

    public NoAmountException() {
    }

    public NoAmountException(String string) {
        super(string);
    }
    
    
}
