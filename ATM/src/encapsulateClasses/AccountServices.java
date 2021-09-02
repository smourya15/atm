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
public class AccountServices  implements DbQueryInterface{
    
    Account objAccount = new Account("123", "4576", "sjdk", 90);
    
    public long viewBalance(){
        return objAccount.getAccount_Bal();
    }
    
    public void deductAmount(long deductAmt){
        try{
            // if the user is trying to remove excess amount from what he/she is having in her account. throw an exception and try again.
            if(objAccount.getAccount_Bal() < deductAmt)
                throw new NoAmountException("Error Occured in Transaction, Please Try Again");
            objAccount.setAccount_Bal(objAccount.getAccount_Bal() - deductAmt);
            
            
            //update Amount commad here.
            
        }catch(NoAmountException ne){
            System.out.println("Less Balance");
            
        }
    }
    public void addAmount(long addAmt){
        objAccount.setAccount_Bal(objAccount.getAccount_Bal()+addAmt);
    }
    public void transferFunds(final String benificiary_Account_num, long Amount){
        try{
            if(objAccount.getAccount_Bal() < Amount)
                throw new NoAmountException("Specify the Correct Amount");
            
            // check if the account number of the benificiary exist in the database, if not then throw exception.
            if(Boolean.TRUE){
                throw new NoAccountFound("Please Enter correct Benificiary Account Number");               
                
            }
            objAccount.setAccount_Bal(objAccount.getAccount_Bal() - Amount);

        }catch(NoAmountException | NoAccountFound ne){            
        }
    }

    @Override
    public void update_query(String... Param) {
        
        // update balance query here after withdrawing or transfering funds have been taken place.
        // input should be table name as string, and rest can be accessed via *this."variable_name"* such asa objAccount.getAccount_Bal()
        
        
    }

    @Override
    public void view_query(String... Param) {
        
        //insert select statement here balance check.
    }
 
//    public static void main(String[] args) {
//        AccountServices acc = new AccountServices();
//        System.out.println(""+acc.viewBalance());
//        acc.deductAmount(100);
//        acc.addAmount(500);
//        System.out.println(""+acc.viewBalance());
//        acc.deductAmount(20);
//        System.out.println(""+acc.viewBalance());
//        System.out.println(""+acc.objAccount.getAccNum());
//    }
}
