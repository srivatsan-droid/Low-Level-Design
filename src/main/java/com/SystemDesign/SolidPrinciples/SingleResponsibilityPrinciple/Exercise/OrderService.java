package com.SystemDesign.SolidPrinciples.SingleResponsibilityPrinciple.Exercise;

import java.util.*;

// ✅ 1. INVENTORY MANAGER - Single Responsibility
class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("LAPTOP", 10);
        inventory.put("PHONE", 25);
        inventory.put("TABLET", 15);
    }

    public boolean hasStock(String productId, int quantity) {
        Integer stock = inventory.get(productId);
        return stock != null && stock >= quantity;
    }

    public void reduceStock(String productId, int quantity) {
        inventory.put(productId, inventory.get(productId) - quantity);
    }
}

// ✅ 2. NOTIFICATION SERVICE - Single Responsibility
class NotificationService {
    public void sendOrderConfirmation(String email, String orderId, double total) {
        System.out.println("Email to " + email + ": Order " + orderId
                + " confirmed. Total: $" + total);
    }
}

// ✅ 3. ORDER PROCESSOR - Orchestrator (Dependency Injection)
class OrderProcessor {
    private InventoryManager inventory;
    private NotificationService notificationService;

    // Dependency Injection via constructor
    public OrderProcessor(InventoryManager inventory, NotificationService notificationService) {
        this.inventory = inventory;
        this.notificationService = notificationService;
    }

    public boolean processOrder(String productId, int quantity, String customerEmail) {
        // Step 1: Check inventory
        if (!inventory.hasStock(productId, quantity)) {
            System.out.println("Insufficient stock for " + productId);
            return false;
        }

        // Step 2: Calculate total
        double pricePerUnit = 100.0;
        double total = pricePerUnit * quantity;

        // Step 3: Generate order ID
        String orderId = "ORD-" + UUID.randomUUID().toString();

        // Step 4: Update inventory
        inventory.reduceStock(productId, quantity);

        // Step 5: Send notification
        notificationService.sendOrderConfirmation(customerEmail, orderId, total);

        return true;
    }
}

public class OrderService {
    public static void main(String[] args) {
        // Setup dependencies
        InventoryManager inventory = new InventoryManager();
        NotificationService notificationService = new NotificationService();

        // Inject dependencies
        OrderProcessor processor = new OrderProcessor(inventory, notificationService);

        // Process order (ONE clean call)
        processor.processOrder("LAPTOP", 1, "sriram5srivatsan@gmail.com");
    }
}