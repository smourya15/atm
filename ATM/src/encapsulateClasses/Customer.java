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
public class Customer {
    private String address;
    private final String CIF_NO;
    private final String Name;
    private final String email;
    private final String contact;

    public Customer(String address, String CIF_NO, String Name, String email, String contact) {
        this.address = address;
        this.CIF_NO = CIF_NO;
        this.Name = Name;
        this.email = email;
        this.contact = contact;
    }
    
    
            
}
