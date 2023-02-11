package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class PaymentRequest {
    private User user;
    private double paymentAmount;

    public PaymentRequest(User user, double paymentAmount) {
        this.user = user;
        this.paymentAmount = paymentAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
