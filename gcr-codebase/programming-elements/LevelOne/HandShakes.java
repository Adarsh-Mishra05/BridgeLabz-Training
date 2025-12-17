import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for number of people
        System.out.println("Enter number of people: ");
        int n = sc.nextInt();

        // Formula for total handshakes: n * (n - 1) / 2
        int totalHandshakes = n * (n - 1) / 2;

        // Display the result
        System.out.println("Total possible handshakes: " + totalHandshakes);

        // Close Scanner
        sc.close();
    }
}
