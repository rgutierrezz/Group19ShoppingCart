/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author John Garofalo
 */
public class Payment {
    public Payment(int i, double a) {
        this.id = i;
        this.amount = a;
        
        Date d = new java.util.Date();
        this.date = d;
    }
    
    private int id;
    private Date date;
    private double amount;
}

