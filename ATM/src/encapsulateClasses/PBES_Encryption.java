/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulateClasses;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author smourya
 */
public class PBES_Encryption {
    private String salt;
    private String seed;
    private String encrypt;

    public PBES_Encryption() {
    }

    public PBES_Encryption(String salt, String seed) {
        this.salt = salt;
        this.seed = seed;
        encrypt();
    }
    
    public void encrypt(){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(this.salt);
        String encrypted;
        this.encrypt=encryptor.encrypt(this.seed);
//        openConnection("debit_card");
//        String query = "select card_no from debit_card where card_no = "+encrypted;
//        rs.
//        return false;
//        return false;
    }
    
    public String decrypt(){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(this.salt);
        String decrypted = encryptor.decrypt(this.encrypt);
        return decrypted;
    }
    
    public String getEncrypt() {
        return encrypt;
    }
    
//    public static void main(String[] args) {
//        PBES_Encryption e = new PBES_Encryption("1234", "8907");
//        System.out.println("encryp="+e.encrypt());
//        System.out.println("decrypt="+e.decrypt());
//        
//    }

    
}

