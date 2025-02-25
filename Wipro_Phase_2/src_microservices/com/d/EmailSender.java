package com.d;

public class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Email Sent: " + message);
    }
}
