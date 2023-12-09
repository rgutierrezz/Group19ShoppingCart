/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * ShoppingCart class represents the shopping cart functionality.
 */
public class ShoppingCart {

    private ArrayList<Product> items = new ArrayList<Product>();

    /**
     * Display all products in the shopping cart.
     */
    public void showAllProducts(Product products[]) {
        System.out.println("Shopping Cart Contents:");
        System.out.printf("%-5s %-15s %-10s %-8s\n", "ID", "Name", "Price", "Quantity");

        for (Product p : products) {
            System.out.printf("%-5d %-15s %-10.2f %-8d\n", p.getId(), p.getName(), p.getPrice(), p.getQuantity());
        }
        System.out.println();
    }

    /**
     * Add a product to the shopping cart.
     *
     * @param product  Product to add.
     * @param quantity Quantity of the product to add.
     */
    public void addProduct(Product product, int quantity) {
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            items.add(new Product(product.getId(), product.getName(), product.getPrice(), quantity));
            System.out.println("Product added successfully");
        } else if (product != null) {
            System.out.println("Quantity is not present in the stock");
        } else {
            System.out.println("Product not found");
        }
        System.out.println();
    }

    /**
     * Remove a product from the shopping cart.
     *
     * @param id ID of the product to remove.
     * @param products Array of available products.
     */
    public void removeProduct(int id, Product products[]) {
        Product removedProduct = null;
        for (Product product : items) {
            if (product.getId() == id) {
                removedProduct = product;
                break;
            }
        }

        if (removedProduct != null) {
            items.remove(removedProduct);
            updateProductQuantity(products, id, removedProduct.getQuantity());
            System.out.println("Product removed from the cart");
        } else {
            System.out.println("Product not found in the cart");
        }

        System.out.println();
    }

    // Helper method to update product quantity in the products array
    private void updateProductQuantity(Product products[], int id, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(product.getQuantity() + quantity);
                break;
            }
        }
    }

    // ... (other methods remain unchanged)
}
