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
public class Account{
    
    private final String AccNum;
    private final String CIF_Num;
    private double Account_Bal;

    
    
    public Account(String AccNum, String CIF_Num, double Account_Bal) {
        this.AccNum = AccNum;
        this.CIF_Num = CIF_Num;
        this.Account_Bal = Account_Bal;
    }

    
    /**
     * @return the AccNum
     */
    public String getAccNum() {
        return AccNum;
    }
    


    /**
     * @return the CIF_Num
     */
    public String getCIF_Num() {
        return CIF_Num;
    }


    /**
     * @return the Account_Bal
     */
    public double getAccount_Bal() {
        return Account_Bal;
    }

    public void setAccount_Bal(double Account_Bal) {
        this.Account_Bal = Account_Bal;
    }
    
    
    
    
    
}


