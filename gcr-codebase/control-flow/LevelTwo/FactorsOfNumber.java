import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
     // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);
       // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
       // Checking for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
         
            //      While Loop from 1 to number-1
            for (int i = 1; i < number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
