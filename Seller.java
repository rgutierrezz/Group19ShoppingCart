/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

/**
 *
 * 
 */
public class Seller extends User {
    public Seller (String n, String p, String a, String e, int i, int age, int phone) {
        super(n, p, a, e, i, age);
        this.phoneNumber = phone;
    }
    
    public void updateProductDetails() {
        //placeholder
    }
    
    public void updateInventory() {
        //placeholder
    }
    
    public void reviewInventory() {
        //placeholder
    }
    
    public void reviewProfits() {
        //placeholder
    }
    
    private int phoneNumber;
}