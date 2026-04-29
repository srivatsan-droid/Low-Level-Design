package OOPS.Interfaces;

public class PaymentMain {
    public static void main(String[] args) {
        StripePayment payment1 = new StripePayment();
        payment1.initiatePayment(12222.22);

        CheckoutService service = new CheckoutService(payment1);
        service.checkout(120.50);

        RazorPay payment2 = new RazorPay();
        payment2.initiatePayment(130.44);

        CheckoutService service1 = new CheckoutService(payment2);
        service1.checkout(140.33);
    }
}
