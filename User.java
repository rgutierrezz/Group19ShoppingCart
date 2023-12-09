/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

/**
 *
 */
public class User {
    private String name;
    private String password;
    private String address;
    private String email;
    private int id;
    private int age;
    private ShoppingCart cart;

    public User(String n, String p, String a, String e, int i, int age) {
        this.name = n;
        this.password = p;
        this.address = a;
        this.email = e;
        this.id = i;
        this.age = age;
        this.cart = new ShoppingCart();
    }


    public ShoppingCart getCart() {
        return cart;
    }
}
