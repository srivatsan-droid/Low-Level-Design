package OOPS.Interfaces;

public class StripePayment
        implements PaymentGateway {

    public void initiatePayment(double amount) {
        System.out.println("Process Payment via Stripe : " + amount);
    }
}
