package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public interface OrderRepository {
    void createOrder(User user, Product product, int orderedProductQuantity);
}
