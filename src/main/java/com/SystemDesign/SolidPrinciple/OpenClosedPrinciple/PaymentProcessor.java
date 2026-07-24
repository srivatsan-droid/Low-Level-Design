package com.SystemDesign.SolidPrinciple.OpenClosedPrinciple;

class PaymentProcessor {
    public void processCreditCardPayment(double amount) {
        System.out.println("Processing Credit Card payment of $ " + amount);
    }
    public void processStripePayment(double amount) {
        System.out.println("Processing via Stripe : " + amount);
    }
}
