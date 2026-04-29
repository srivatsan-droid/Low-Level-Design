package OOPS.Interfaces;

public class RazorPay implements PaymentGateway {
    public void initiatePayment(double amount) {
        System.out.println("Paying via Razor Pay : " + amount);
    }
}
