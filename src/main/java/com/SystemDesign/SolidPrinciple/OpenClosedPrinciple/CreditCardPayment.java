package com.SystemDesign.SolidPrinciple.OpenClosedPrinciple;

class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card Payment of $ " + amount);
    }
}
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Pay Pal Payment of $ " + amount);
    }
}
class UPIPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the UPI Payment of $ " + amount);
    }
}
