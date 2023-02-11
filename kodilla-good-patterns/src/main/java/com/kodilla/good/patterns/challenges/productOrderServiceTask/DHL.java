package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class DHL implements DeliveryService {
    public void processOrderDelivering(OrderDto orderDto) {
        System.out.println("DHL:\nBeginning the process to deliver product " +
                orderDto.getProduct().getProductName() +
                " to user " + orderDto.getUser().getUserName() +
                " to adress: " + orderDto.getUser().getUserDeliveryAdress());
    }
}
