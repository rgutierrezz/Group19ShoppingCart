/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;
import java.util.Date;

/**
 *
 *
 */
public class Order {
    public Order(int i) {
        this.id = i;
    }
    
    public void confirmPayment() {
        //placeholder
    }
    
    public void sendReceipt() {
        //placeholder
    }
    
    private int id;
    private Date date;
    private double amount;
}
