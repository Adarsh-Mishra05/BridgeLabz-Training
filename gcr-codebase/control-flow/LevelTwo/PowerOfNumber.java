import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
       
       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
       System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Checking for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
        } else {

            int result = 1;

            // Calculating power using for loop
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Displaying result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
