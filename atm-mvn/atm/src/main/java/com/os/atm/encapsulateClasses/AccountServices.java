/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smourya
 */
public class AccountServices{
    
    Account objAccount = new Account("123", "4576", 90);
    
    public double viewBalance(){
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
        objAccount.setAccount_Bal(objAccount.getAccount_Bal() + addAmt);
    }
    public void transferFunds(final String benificiary_Account_num, int Amount, DebitCard debitCard){
        try{
            if(debitCard.getBalance() < Amount)
                throw new NoAmountException("Specify the Correct Amount");
            
            String query = "select account_no, acc_bal from account where account_no =?";
            Connection con = (new DatabaseConnections()).databaseCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, benificiary_Account_num);
//            con.commit();
            ResultSet rs = pst.executeQuery();
            if(!rs.isBeforeFirst()){
                con.close();
                throw new NoAccountFound("No Account Found");
            }
            else{
                while(rs.next()){
//                    System.out.println(""+con.isClosed());
                    String updateBeneficiaryAccountQuery = " update account set acc_bal=? where account_no =?";
                    PreparedStatement updateBenPST = con.prepareStatement(updateBeneficiaryAccountQuery);
                    System.out.println("Ben Amount: "+ rs.getInt("acc_bal"));
                    int t = (int)rs.getInt("acc_bal")+(int)Amount;
                    System.out.println("new Amount: "+ t);
                    updateBenPST.setInt(1,t);
                    updateBenPST.setString(2, benificiary_Account_num);
                    updateBenPST.executeUpdate();
                    
                    t=0;
                    String updateUserAccountQuery = "update account set acc_bal = ? where account_no = ?";
                    PreparedStatement updateUserPST = con.prepareStatement(updateUserAccountQuery);
                    System.out.println("user Balc: "+debitCard.getBalance());
                    t=(int) (debitCard.getBalance()-Amount);
                    updateUserPST.setInt(1, t);
                    updateUserPST.setString(2, debitCard.getAccNum());
                    updateUserPST.executeUpdate();
//                    con.commit();
                    
                }

            }
            con.close();
            
            // check if the account number of the benificiary exist in the database, if not then throw exception.
            if(Boolean.TRUE){
                throw new NoAccountFound("Please Enter correct Benificiary Account Number");               
                
            }
            objAccount.setAccount_Bal(objAccount.getAccount_Bal() - Amount);

        }catch(NoAmountException | NoAccountFound ne){            
        } catch (SQLException ex) {
            Logger.getLogger(AccountServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
    public Account populateAccount(String accountNum){
        String query = "select * from account where account_no = ?";
        Account acc =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");

            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, accountNum);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                acc = new Account(rs.getString("account_no"), rs.getString("cif_no"), rs.getInt("acc_bal"));
                break;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DebitCardServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ATMServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;

    }


}
