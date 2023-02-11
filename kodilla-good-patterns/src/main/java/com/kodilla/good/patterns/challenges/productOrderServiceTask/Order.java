package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class Order {
    private User user;
    private Product product;
    private int orderedProductQuantity;

    public Order(User user, Product product, int orderedProductQuantity) {
        this.user = user;
        this.product = product;
        this.orderedProductQuantity = orderedProductQuantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderedProductQuantity() {
        return orderedProductQuantity;
    }

    public void setOrderedProductQuantity(int orderedProductQuantity) {
        this.orderedProductQuantity = orderedProductQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                ", orderedProductQuantity=" + orderedProductQuantity +
                '}';
    }
}
