package com.SystemDesign.Interface;

class StripePayment implements PaymentInterface {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment via Stripe : " + amount);
    }
}
class RazorPay implements PaymentInterface {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment via RazorPay : " + amount);
    }
}
class checkOutService  {
    private PaymentInterface paymentInterface;

    public checkOutService(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }
    public void setPaymentGateway(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }
    public void checkout(double amount) {
        paymentInterface.initiatePayment(1200);
    }
}
public class PaymentMain {
    public static void main(String[] args) {
        StripePayment payment1 = new StripePayment();
        RazorPay payment2 = new RazorPay();
        payment1.initiatePayment(1233);
        payment2.initiatePayment(1300);
        checkOutService payment3 = new checkOutService(payment2);
        payment3.checkout(1222);
    }
}
