import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

   // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
          
            return;
        }

        // Create String array to store results
        String[] result = new String[number + 1];

        // Loop from 0 to number and store values
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                result[i] = "Fizz";
            } 
            else if (i % 5 == 0) {
                result[i] = "Buzz";
            } 
            else {
                result[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}
