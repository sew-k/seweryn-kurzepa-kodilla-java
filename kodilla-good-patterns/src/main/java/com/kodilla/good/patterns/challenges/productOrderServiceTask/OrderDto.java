package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class OrderDto {
    private User user;
    private Product product;
    private int productQuantity;
    private boolean isOrderComplete;

    public OrderDto(User user, Product product, int productQuantity, boolean isOrderComplete) {
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
        this.isOrderComplete = isOrderComplete;
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

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public boolean isOrderComplete() {
        return isOrderComplete;
    }

    public void setOrderComplete(boolean orderComplete) {
        isOrderComplete = orderComplete;
    }
}
