package Classes_Objects;
interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Credit card");
    }
}
class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Cash");
    }
}
public class realizationClass {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new CashPayment();
        payment1.pay();
        payment2.pay();
    }
}
