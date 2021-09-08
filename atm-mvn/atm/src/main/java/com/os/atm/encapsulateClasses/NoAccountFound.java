/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

/**
 *
 * @author smourya
 */
public class NoAccountFound extends Exception{

    public NoAccountFound() {
    }

    public NoAccountFound(String string) {
        super(string);
    }
    
    
}
