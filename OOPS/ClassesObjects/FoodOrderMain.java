package OOPS.ClassesObjects;

import java.util.ArrayList;
import java.util.List;

class FoodOrder {
    private String orderId;
    private String customerName;
    private List<String> items;
    private double totalAmount;
    private boolean isPlaced;

    public FoodOrder(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
        this.isPlaced = false;
    }

    public boolean addItem(String name, double price) {
        if (isPlaced || items.isEmpty()) {
            return false;
        }
        isPlaced = true;
        return true;
    }

    public boolean placeOrder() {
        if (isPlaced || items.isEmpty()) {
            return false;
        }
        isPlaced = true;
        return true;
    }

    public int getItems() {
        return items.size();
    }

    public void displayInfo() {
        String status = isPlaced ? "PLACED" : "PENDING";
        System.out.println("Order " + orderId + " (" + customerName + " )" + status);
        for (String item : items) {
            System.out.println(" - " + item);
        }
        System.out.printf("  Total: $%.2f%n", totalAmount);
    }
}

public class FoodOrderMain {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder("ORD-101", "Alice");
        order1.addItem("Pizza", 12.99);
        order1.addItem("Garlic Bread", 4.99);
        order1.addItem("Coke", 2.49);
        order1.placeOrder();

        FoodOrder order2 = new FoodOrder("ORD-102", "Bob");
        order2.addItem("Burger", 9.99);
        order2.addItem("Fries", 3.99);
        // Bob hasn't placed his order yet

        order1.displayInfo();
        System.out.println();
        order2.displayInfo();
    }

}
