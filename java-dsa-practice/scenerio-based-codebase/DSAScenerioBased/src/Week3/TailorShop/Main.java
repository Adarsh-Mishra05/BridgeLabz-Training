package Week3.TailorShop;

class Order {
    int orderId;
    int deadline;

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }
}

public class Main {

    // Insertion Sort based on delivery deadline
    public static void insertionSort(Order[] orders) {
        int n = orders.length;

        for (int i = 1; i < n; i++) {
            Order key = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines to the right
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            // Insert at correct position
            orders[j + 1] = key;
        }
    }

    // Print orders
    public static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId +
                               ", Deadline: " + o.deadline);
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, 4),
            new Order(102, 6),
            new Order(103, 8),
            new Order(104, 5)   // new order received
        };

        System.out.println("Before Sorting:");
        printOrders(orders);

        insertionSort(orders);

        System.out.println("\nAfter Sorting by Deadline:");
        printOrders(orders);
    }
}
