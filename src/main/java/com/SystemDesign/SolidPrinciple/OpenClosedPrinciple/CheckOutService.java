package com.SystemDesign.SolidPrinciple.OpenClosedPrinciple;

class CheckOutService {
    public void processPayment() {
        PaymentProcessor payment = new PaymentProcessor();
        payment.processCreditCardPayment(100.00);
        payment.processStripePayment(1220.0);
    }
}
