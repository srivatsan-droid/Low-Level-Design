package OOPS.Encapsulation.Exercise;

import java.util.HashMap;
import java.util.Map;

class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();
    private boolean discountApplied = false;
    private boolean isCheckedOut = false;

    public void addItem(String name, double price) {
        if (isCheckedOut) {
            System.out.println("Cannot modify a checked-out cart");
            return;
        }
        items.put(name, price);
    }

    public boolean applyDiscount(String code) {
        if (!isCheckedOut && !discountApplied && code.equals("SAVE10")) {
            discountApplied = true;
            return true;
        }
        return false;
    }

    public double getTotal() {
        double sum = 0.0;

        for (double price : items.values()) {
            sum += price;
        }

        if (discountApplied) {
            sum = sum * 0.9;
        }

        return sum;
    }

    public void checkout() {
        if (!items.isEmpty() && !isCheckedOut) {
            isCheckedOut = true;
        }
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 999.99);
        cart.addItem("Mouse", 29.99);

        System.out.printf("Total: $%.2f\n", cart.getTotal());

        System.out.println("Discount: " + cart.applyDiscount("SAVE10"));
        System.out.printf("Total: $%.2f\n", cart.getTotal());

        System.out.println("Discount: " + cart.applyDiscount("SAVE10"));

        cart.checkout();
        cart.addItem("Keyboard", 79.99);

        System.out.printf("Total: $%.2f\n", cart.getTotal());
    }
}