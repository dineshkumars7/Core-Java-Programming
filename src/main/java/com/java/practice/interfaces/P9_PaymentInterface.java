package com.java.practice.interfaces;

interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processed ₹" + amount + " via Credit Card (" + cardNumber + ").");
    }
}

class UpiPayment implements Payment {
    private String upiId;

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processed ₹" + amount + " via UPI (" + upiId + ").");
    }
}

public class P9_PaymentInterface {
	 public static void main(String[] args) {
	        Payment cardPay = new CreditCardPayment("XXXX-XXXX-XXXX-4512");
	        Payment upiPay = new UpiPayment("user@okaxis");

	        cardPay.processPayment(3200.0);
	        upiPay.processPayment(750.0);
	    }
}
