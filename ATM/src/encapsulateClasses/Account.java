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
public class Account {
    
    private final String AccNum;
    private final String CIF_Num;
    private final String IFSC_Code;
    private long Account_Bal;

    public Account(String AccNum, String CIF_Num, String IFSC_Code, long Account_Bal) {
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
    public long getAccount_Bal() {
        return Account_Bal;
    }
    
    public void deductAmount(long deductAmt){
        try{
            // if the user is trying to remove excess amount from what he/she is having in her account. throw an exception and try again.
            if(this.Account_Bal < deductAmt)
                throw new NoAmountException("Error Occured in Transaction, Please Try Again");
            this.Account_Bal = this.Account_Bal - deductAmt;
            
            
            //update Amount commad here.
            
        }catch(NoAmountException ne){
            
        }
    }
    public void addAmount(long addAmt){
        this.Account_Bal = this.Account_Bal+addAmt;
    }
    public void transferFunds(final String benificiary_Account_num, long Amount){
        try{
            if(this.Account_Bal < Amount)
                throw new NoAmountException("Sprcify the Correct Amount");
            
            // check if the account number of the benificiary exist in the database, if not then throw exception.
            if(Boolean.TRUE){
                throw new NoAccountFound("Please Enter correct Benificiary Account Number");
            }
        }catch(NoAmountException | NoAccountFound ne){            
        }
    }

}


