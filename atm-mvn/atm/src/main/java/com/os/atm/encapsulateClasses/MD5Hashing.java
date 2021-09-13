package com.os.atm.encapsulateClasses;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Java program to calculate MD5Hashing hash value
public class MD5Hashing {
    private String text;
    private String hashText;

    public String getHashText() {
        return hashText;
    }

    public MD5Hashing(String text) {
        this.text = text;
        computeMd5();
    }
    
    public Connection databaseCon(){
        Connection connection= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
            System.out.println("Connected");
        }catch(ClassNotFoundException | SQLException ex){

            ex.printStackTrace();
        }
        return connection;
    }    
    public void computeMd5()
    {
        try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(this.text.getBytes());
                BigInteger n = new BigInteger(1, messageDigest);
                String hashText = n.toString(16);
                while (hashText.length() < 32) {
                        hashText = "0" + hashText;
                }
                this.hashText = hashText;
        }
        catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
        }
    }
    
}

	