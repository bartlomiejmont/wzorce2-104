package com.company.composite;

// Leaf
public class Product implements Component{

    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
