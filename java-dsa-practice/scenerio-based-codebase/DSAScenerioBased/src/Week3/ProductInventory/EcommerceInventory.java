package Week3.ProductInventory;

import java.util.TreeMap;
import java.util.Map;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class EcommerceInventory {

    public static void main(String[] args) {

        // SKU -> Product (Sorted automatically)
        TreeMap<Integer, Product> inventory = new TreeMap<>();

        // Scenario 1: Insert / Lookup base
        inventory.put(1005, new Product("Laptop", 55000));
        inventory.put(1002, new Product("Mobile", 22000));
        inventory.put(1008, new Product("Headphones", 3000));
        inventory.put(1001, new Product("Keyboard", 1200));

        // 🔹 Scenario 1: Lookup by SKU
        int searchSKU = 1002;
        if (inventory.containsKey(searchSKU)) {
            Product p = inventory.get(searchSKU);
            System.out.println("Product Found: " + p.name + " - ₹" + p.price);
        } else {
            System.out.println("Product Not Found");
        }

        // 🔹 Scenario 2: Price Update using SKU
        int updateSKU = 1005;
        if (inventory.containsKey(updateSKU)) {
            inventory.get(updateSKU).price = 53000;
        }

        // 🔹 Scenario 3: Sorted List of Products by SKU
        System.out.println("\nSorted Product List (By SKU):");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.println(
                "SKU: " + entry.getKey() +
                ", Name: " + entry.getValue().name +
                ", Price: ₹" + entry.getValue().price
            );
        }
    }
}
