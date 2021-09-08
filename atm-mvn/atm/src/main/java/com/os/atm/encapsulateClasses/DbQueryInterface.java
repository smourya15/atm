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
public interface DbQueryInterface {
    void update_query(String... Param);
    void view_query(String... Param);
    
}
