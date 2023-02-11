package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class RepositoryApp implements OrderRepository {
    public void createOrder(User user, Product product, int orderedProductQuantity) {
        Order order = new Order(user, product, orderedProductQuantity);
        System.out.println("RepositoryApp:\nSave new order " + order + " to database.");
    }
}
