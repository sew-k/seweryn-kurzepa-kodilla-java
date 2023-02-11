package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class EmailService implements InformationService {
    public void inform(User user) {
        System.out.println("EmailService:\nSending email to user: " + user.getUserName() + " to email adress: " + user.getUserEmailAdress() + ", about beginning of creating order.");
    }
}
