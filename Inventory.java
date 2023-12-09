/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Product> items;

    public Inventory(ArrayList<Product> i) {
        this.items = i;
    }

    public void add(Product p) {
        items.add(p);
    }

    public void remove(int id) {
        Iterator<Product> iterator = items.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                break; // Exit the loop after removing the item
            }
        }
    }

    public Boolean isAvailable(int id) {
        for (Product p : items) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
