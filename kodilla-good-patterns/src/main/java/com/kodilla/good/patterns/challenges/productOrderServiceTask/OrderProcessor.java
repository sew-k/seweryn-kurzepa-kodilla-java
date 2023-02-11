package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class OrderProcessor {

    public void processOrder(OrderDto orderDto) {
        if (orderDto.isOrderComplete()) {
            DeliveryService deliveryService = new DHL();
            PaymentService paymentService = new TheBank();
            PaymentRequest paymentRequest = new PaymentRequest(orderDto.getUser(), (orderDto.getProduct().getPrice() * orderDto.getProductQuantity()));
            paymentService.setPayment(paymentRequest);
            if (paymentService.getPayment(paymentRequest)) {
                deliveryService.processOrderDelivering(orderDto);
            }
        } else {
            System.out.println("Order isn't complete.");
        }
    }
}
