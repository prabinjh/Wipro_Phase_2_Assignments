package com.o;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        processor.processPayment(creditCard, 1000.0);

        PaymentMethod upi = new UpiPayment();
        processor.processPayment(upi, 500.0);
    }
}