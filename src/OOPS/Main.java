package OOPS;

class StripePayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment via Stripe : " + amount);
    }
}
class RazorPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment via RazorPay : " + amount);
    }
}
class CheckoutService {
    private PaymentGateway paymentGateway;
    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void checkout(double amount) {
        paymentGateway.initiatePayment(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        StripePayment obj = new StripePayment();
        obj.initiatePayment(1233);
        RazorPayment obj1 = new RazorPayment();
        obj1.initiatePayment(12233);
        CheckoutService obj2 = new CheckoutService(obj1);
        obj2.checkout(1222);
    }
}
