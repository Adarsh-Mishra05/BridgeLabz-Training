import java.util.Scanner;
public class PowerWhileLoop {
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
            int counter =0;
            // while counter is less than power
           while (counter < power) {
                result = result * number;
                counter++;
            }

            // Display of Result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
