/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;

import java.util.*;
/**
 *
 * @author Valente Lowery
 */

public class Main {
    // To show the products available in the store
    public static void main(String args[]) {
    // Scanner class is used to take the input from the user (or console)
    Scanner scan = new Scanner(System.in);

    // To store the product details
    Product products[] = new Product[5];
    // Adding the product details
    products[0] = new Product(101, "Juice", 102.50, 5);
    products[1] = new Product(102, "Chocolates", 402.50, 14);
    products[2] = new Product(103, "Shop", 42.80, 8);
    products[3] = new Product(104, "Biscuits", 10.00, 55);
    products[4] = new Product(105, "Candy", 12.20, 102);
    
     SwingUtilities.invokeLater(() -> new ShoppingCartUI(products));

    // Authentication of the customer
    System.out.println("Enter your username to login");
    String username = scan.nextLine();
    System.out.println("Enter your password to login");
    String password = scan.nextLine();

    // While the customer does not enter the correct id and password, the system will not be accessible
    while (!username.equals("User") || !password.equals("1234")) {
        System.out.println("Invalid credentials. Enter your username and password to login");
        System.out.print("Enter your username: ");
        username = scan.nextLine();
        System.out.print("Enter your password: ");
        password = scan.nextLine();
    }

    // To store the items that the customer wants to buy
      HashMap<Integer, Integer> cart = new HashMap<>();
        ShoppingCart shoppingCart = new ShoppingCart(); // Create an instance of ShoppingCart
        int choice;

        do {
            System.out.println("1. Show all products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Delete product from cart");
            System.out.println("4. Edit product quantity in cart");
            System.out.println("5. Show total price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // To read the data from the next line from the console

            switch (choice) {
                case 1:
                    shoppingCart.showAllProducts(products);
                    break;
                case 2:
                    System.out.print("Enter the product id : ");
                    int addProductId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter the quantity needed : ");
                    int addProductQuantity = scan.nextInt();
                    scan.nextLine();
                    shoppingCart.addProduct(products, cart, addProductId, addProductQuantity);
                    break;
                case 3:
                    System.out.print("Enter the product id to delete: ");
                    int deleteProductId = scan.nextInt();
                    scan.nextLine();
                    shoppingCart.removeProduct(cart, deleteProductId);;
                    break;
                case 4:
                    System.out.print("Enter the product id : ");
                    int editProductId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter the new quantity needed : ");
                    int editProductQuantity = scan.nextInt();
                    scan.nextLine();
                    shoppingCart.editProduct(products, cart, editProductId, editProductQuantity);
                    break;
                case 5:
                    shoppingCart.totalPrice(products, cart);
                    break;
                case 6:
                    shoppingCart.confirmOrder();
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
    }
}