public class StripePayment implements PaymentGateway {
    public void initiatePayment(double amount) {
        System.out.println("Processing the payment via Stripe: $" +amount);
    }
}

class main{
    public static void main(String[] args) {
        StripePayment obj = new StripePayment();
        RazorPayment obj1 = new RazorPayment();
        obj.initiatePayment(233.44);
        obj1.initiatePayment(455.6);
    }
}