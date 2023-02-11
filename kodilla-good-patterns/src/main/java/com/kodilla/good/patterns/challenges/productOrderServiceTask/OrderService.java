package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public interface OrderService {
    public boolean makeNewOrder(User user, Product product, int orderedProductQuantity);
}
