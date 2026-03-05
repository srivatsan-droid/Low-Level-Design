package OOPS;

public class Order {
    private final String orderId;
    private OrderStatus orderStatus;
    private final PaymentMethod paymentMethod;
    private final double amount;

    public Order(String orderId, PaymentMethod paymentMethod, double amount) {
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.orderStatus = orderStatus;
    }
    public boolean advanceStatus() {
        switch(orderStatus) {
            case PLACED :
                orderStatus = OrderStatus.CONFIRMED;
                return true;
            case CONFIRMED:
                orderStatus = OrderStatus.SHIPPED;
                return true;
            case SHIPPED:
                orderStatus = OrderStatus.SHIPPED;
                return true;
            default:
                return false;
        }
    }
    public boolean cancel() {
        if(orderStatus == OrderStatus.PLACED || orderStatus == OrderStatus.CONFIRMED) {
            orderStatus = OrderStatus.CANCELLED;
            return true;
        }
        return false;
    }
    public double getTotalWithFees() {
        return amount + (amount * paymentMethod.getFeePercent() / 100);
    }

    public void displayInfo() {
        System.out.printf("Order %s | Status: %s | Payment: %s | Amount: $%.2f (with fees: $%.2f)%n",
                orderId, orderStatus, paymentMethod.getDisplayName(), amount, getTotalWithFees());
    }
    public static void main(String[] args) {
        Order order = new Order("ORD-001", PaymentMethod.CREDIT_CARD, 99.99);
        order.displayInfo();

        order.advanceStatus(); // PLACED -> CONFIRMED
        order.advanceStatus(); // CONFIRMED -> SHIPPED
        order.displayInfo();

        System.out.println("Cancel after shipping: " + order.cancel()); // false
    }
}
