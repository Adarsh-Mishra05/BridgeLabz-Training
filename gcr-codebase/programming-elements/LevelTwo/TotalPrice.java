import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        // Create Scanner object to take input 
        Scanner sc = new Scanner(System.in);

        // Take unit price 
        System.out.println("Enter unit price: ");
        int unitPrice = sc.nextInt();

        // Take quantity
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price (unit price × quantity)
        int totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity is " + quantity +
            " and unit price is INR " + unitPrice
        );

        // Close the scanner 
        sc.close();
    }
}
