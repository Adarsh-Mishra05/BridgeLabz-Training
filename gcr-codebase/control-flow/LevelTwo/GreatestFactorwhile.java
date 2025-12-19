import java.util.Scanner;
public class GreatestFactorwhile {
    public static void main(String[] args) {

      // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from number-1 down to 1
            int i=number-1;
            while (i >= 1 {

                // Check divisibility
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   
                }
                i--;
            }

            // Display result
            System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        sc.close();
    }
}
