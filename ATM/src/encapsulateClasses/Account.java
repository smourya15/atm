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
public class Account{
    
    private final String AccNum;
    private final String CIF_Num;
    private final String IFSC_Code;
    private double Account_Bal;

    
    
    public Account(String AccNum, String CIF_Num, String IFSC_Code, double Account_Bal) {
        this.AccNum = AccNum;
        this.CIF_Num = CIF_Num;
        this.IFSC_Code = IFSC_Code;
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
     * @return the IFSC_Code
     */
    public String getIFSC_Code() {
        return IFSC_Code;
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


