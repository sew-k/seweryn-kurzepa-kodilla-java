package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

public class Order {
    private String productName;
    private int productQuantity;

    public Order(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
