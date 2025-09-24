public class RazorPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payments via razor pay $" + amount);
    }
}
