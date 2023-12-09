/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private ArrayList<Product> items = new ArrayList<>();

    public ShoppingCart() {
        // Empty constructor
    }
  
    public void showAllProducts(Product products[]) {
        System.out.println("Shopping Cart Contents:");
        System.out.printf("%-5s %-15s %-10s %-8s\n", "ID", "Name", "Price", "Quantity");

        for (Product p : products) {
            System.out.printf("%-5d %-15s %-10.2f %-8d\n", p.getId(), p.getName(), p.getPrice(), p.getQuantity());
        }
        System.out.println();
    }

    public void addProduct(Product product, int quantity) {
        if (product != null && product.getQuantity() >= quantity) {
            items.add(new Product(product.getId(), product.getName(), product.getPrice(), quantity));
            System.out.println("Product added successfully");
        } else if (product != null) {
            System.out.println("Quantity is not present in the stock");
        }
        System.out.println();
    }

    public void removeProduct(int productId, Product[] products) {
        for (Product item : items) {
            if (item.getId() == productId) {
                items.remove(item);
                // Restock the product in the products array
                for (Product product : products) {
                    if (product.getId() == productId) {
                        product.setQuantity(product.getQuantity() + item.getQuantity());
                        break;
                    }
                }
                System.out.println("Product deleted successfully");
                break;
            }
        }
        System.out.println();
    }

    public void editProduct(int productId, int newQuantity) {
        for (Product item : items) {
            if (item.getId() == productId) {
                if (item.getQuantity() >= newQuantity) {
                    item.setQuantity(newQuantity);
                    System.out.println("Product edited successfully");
                } else {
                    System.out.println("Quantity is not present in the stock");
                }
                break;
            }
        }
        System.out.println();
    }

    public void totalPrice(Product[] products) {
        double total = 0;
        for (Product item : items) {
            for (Product product : products) {
                if (item.getId() == product.getId()) {
                    total += (product.getPrice() * item.getQuantity());
                }
            }
        }
        System.out.println("Your total bill is : " + total);
        System.out.println();
    }

    public void confirmOrder() {
        System.out.println("Order confirmed. Thank you for shopping!");
    }
}
