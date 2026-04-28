package OOPS.ClassesObjects;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private String orderId;
    private String customerName;
    private List<String> items;
    private double totalAmount;
    private boolean isPlaced;

    // Constructor
    public FoodOrder(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalAmount = totalAmount;
        this.isPlaced = false;
    }

    public void addItem(String name, double price) {
        if (isPlaced) {
            System.out.println("Cannot modify the placed Order");
            return;
        }
        items.add(name);
        totalAmount += price;
    }

    public boolean placeOrder() {
        if (isPlaced || items.isEmpty()) {
            return false;
        }
        isPlaced = true;
        return true;
    }

    public int getItemsCount() {
        return items.size();
    }

    public void displayOrder() {
        String status = isPlaced ? "PLACED" : "PENDING";
        System.out.println("Order " + orderId + " (" + customerName + ") - " + status);
        for (String item : items) {
            System.out.println("  - " + item);
        }
        System.out.printf("  Total: $%.2f%n", totalAmount);
    }

    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder("1", "Srivatsan", 1000);
        order1.addItem("Pizza", 1222.22);
        order1.addItem("Garlic Bread", 4.99);
        order1.addItem("Coke", 2.49);
        order1.placeOrder();

        FoodOrder order2 = new FoodOrder("2", "Raghav", 12222);
        order2.addItem("Burger", 1222.2);
        order2.addItem("Fries", 1444.44);
        order2.placeOrder();

        order1.displayOrder();
        System.out.println();
        order2.displayOrder();
    }
}
