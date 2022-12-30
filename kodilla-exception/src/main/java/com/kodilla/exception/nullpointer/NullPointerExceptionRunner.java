package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSendException e) {
            System.out.println("Message not send..... because " + e);
        } finally {
            System.out.println("end of program");
        }

        System.out.println("Processing other logic");

    }
}
