package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class OrderRequest {
    private User user;
    private Product product;
    private int orderedProductQuantity;

    public OrderRequest(final User user,
                        final Product product,
                        final int orderedProductQuantity) {
        this.user = user;
        this.product = product;
        this.orderedProductQuantity = orderedProductQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderedProductQuantity() {
        return orderedProductQuantity;
    }
}
