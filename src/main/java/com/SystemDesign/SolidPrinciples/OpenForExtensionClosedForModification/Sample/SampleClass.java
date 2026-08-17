package com.SystemDesign.SolidPrinciples.OpenForExtensionClosedForModification.Sample;
interface PaymentMethod {
    void processPayment(double amount);
}
class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $ " + amount);
    }
}

class PayPalPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Pay Pal Payment of $" + amount);
    }
}

class UPIPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount * 80); // Assuming a conversion rate for example
    }
}

class PaymentProcessor {
    public void process(PaymentMethod method,double amount) {
        method.processPayment(amount);
    }
}

class checkoutService {
    public void processPayment(PaymentMethod method,double amount) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(method,amount);
    }
}

public class SampleClass {
    public static void main(String[] args) {
        checkoutService checkout = new checkoutService();
        checkout.processPayment(new CreditCardPayment(), 100.00);
        checkout.processPayment(new PayPalPayment(), 100.00);
        checkout.processPayment(new UPIPayment(), 100.00);
    }
}
