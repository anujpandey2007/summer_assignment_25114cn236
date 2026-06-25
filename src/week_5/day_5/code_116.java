package week_5.day_5;

import java.util.ArrayList;
import java.util.List;

// 1. Base Item Class
class Item {
    private String id;
    private String name;
    private int quantity;
    private double price;

    // constructor
    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    //  Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

  // updating price
    public void updateQuantity(int amount) {
        if (this.quantity + amount >= 0) {
            this.quantity += amount;
        } else {
            System.out.println("Error: Cannot reduce stock below 0 for item " + name);
        }
    }

    // Polymorphic method to display details
    public void displayDetails() {
        System.out.println("ID: "+id+" | Name: "+name+"| Stock: "+quantity+" | Price: "+price);
    }
}

// Expiry check
class PerishableItem extends Item {
    private String expiryDate;

    public PerishableItem(String id, String name, int quantity, double price, String expiryDate) {
        super(id, name, quantity, price); // Call parent constructor
        this.expiryDate = expiryDate;
    }

    // Overriding display details to add expiry
    @Override
    public void displayDetails() {
        System.out.printf("ID: %s | Name: %-15s | Stock: %-4d | Price: $%.2f | Expiry: %s (Perishable)\n",
                getId(), getName(), getQuantity(), getPrice(), expiryDate);
    }
}

//  Inventory Class
class Inventory {
    private List<Item> stockList;

    // constructor
    public Inventory() {
        this.stockList = new ArrayList<>();
    }

    public void addItem(Item item) {
        stockList.add(item);
        System.out.println("System: Registered '" + item.getName() + "' into inventory.");
    }

    // Find and update stock amount
    public void changeStock(String id, int amount) {
        for (Item item : stockList) {
            if (item.getId().equals(id)) {
                item.updateQuantity(amount);
                System.out.println("System: Updated stock for " + item.getName());
                return;
            }
        }
        System.out.println("Error: Item ID " + id + " not found.");
    }

    // Generate  report
    public void showInventoryReport() {
        System.out.println("                       INVENTORY REPORT                          ");
        double totalValue = 0;

        for (Item item : stockList) {
            item.displayDetails(); // Dynamic binding triggers correct display method
            totalValue += item.getQuantity() * item.getPrice();
        }

        System.out.println();
        System.out.println("Total Asset Valuation: "+totalValue);
        System.out.println();
    }
}

// 4. Main Driver Class
public class code_116 {
    public static void main(String[] args) {
        // Instantiate our decoupled inventory management layer
        Inventory centralStore = new Inventory();

        // 1. Create standard items
        Item laptop = new Item("001", "Laptop", 10, 899.99);
        Item chair = new Item("002", "Office Chair", 25, 120.00);

        // 2. Create perishable items (Demonstrates Inheritance)
        PerishableItem milk = new PerishableItem("010", "Organic Milk", 50, 3.49, "2026-07-05");

        System.out.println("--- Initializing Stock---");
        centralStore.addItem(laptop);
        centralStore.addItem(chair);
        centralStore.addItem(milk);

        // Initial Report
        centralStore.showInventoryReport();

        // --- Simulating Day-to-Day Operations ---
        System.out.println("\n--- Processing Transactions ---");

        // Selling 3 laptops (Stock decreases)
        centralStore.changeStock("001", -3);

        // Receiving a fresh shipment of milk
        centralStore.changeStock("010", 20);

        // Trying an illegal operation (Selling more chairs than available)
        centralStore.changeStock("002", -30);

        // Final Report showcasing updated values and states
        centralStore.showInventoryReport();
    }
}
