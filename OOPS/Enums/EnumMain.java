package OOPS.Enums;

public class EnumMain {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        if (status == OrderStatus.SHIPPED) {
            System.out.println("Your Package is on the Way");
        }
    }
}
