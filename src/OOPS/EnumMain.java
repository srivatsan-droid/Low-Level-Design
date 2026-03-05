package OOPS;

public class EnumMain {
    public static void main(String[] args) {
        Enums confirmed = Enums.CONFIRMED;
        if(confirmed == Enums.CONFIRMED) {
            System.out.println("Your Package is on the Way");
        }
        else {
            System.out.println("Order is Still in Transist");
        }
    }
}
