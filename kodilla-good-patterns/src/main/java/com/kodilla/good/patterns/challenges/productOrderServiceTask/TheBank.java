package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class TheBank implements PaymentService {
    public void setPayment(PaymentRequest paymentRequest) {
        System.out.println("Hello " + paymentRequest.getUser().getUserName() + ". Our Bank is setting payment: " + paymentRequest.getPaymentAmount() + " PLN\n - please proceed...");
    }
    public boolean getPayment(PaymentRequest paymentRequest) {
        System.out.println("Checkout completed. Thank you.");
        return true;
    }

}
