package com.mycompany.shoppingcart;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingCartUI extends JFrame {

    private ShoppingCart shoppingCart;

    public ShoppingCartUI(Product[] products) {
        shoppingCart = new ShoppingCart();

        setTitle("Shopping Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton showProductsButton = new JButton("Show All Products");
        JButton addToCartButton = new JButton("Add to Cart");
        JButton deleteFromCartButton = new JButton("Delete from Cart");
        JButton editCartButton = new JButton("Edit Cart");
        JButton showTotalButton = new JButton("Show Total");
        
         showProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppingCart.showAllProducts();
            }
        });

        showProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppingCart.showAllProducts(products);
            }
        });

        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productId = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID:"));
                int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));
                shoppingCart.addProduct(findProductById(productId, products), quantity);
            }
        });

        deleteFromCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productId = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID to Delete:"));
                shoppingCart.removeProduct(productId, products);
            }
        });

        editCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic for editing cart
            }
        });

        showTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppingCart.totalPrice(products);
            }
        });

        setLayout(new FlowLayout());

        add(showProductsButton);
        add(addToCartButton);
        add(deleteFromCartButton);
        add(editCartButton);
        add(showTotalButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private Product findProductById(int id, Product[] products) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101, "Juice", 102.50, 5);
        products[1] = new Product(102, "Chocolates", 402.50, 14);
        products[2] = new Product(103, "Shop", 42.80, 8);
        products[3] = new Product(104, "Biscuits", 10.00, 55);
        products[4] = new Product(105, "Candy", 12.20, 102);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShoppingCartUI(products);
            }
        });
    }
}
