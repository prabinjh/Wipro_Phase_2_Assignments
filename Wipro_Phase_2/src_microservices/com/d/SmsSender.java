package com.d;

public class SmsSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("SMS Sent: " + message);
    }
}
