import java.util.Scanner;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
 
       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Validation check
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop from 100 to 1 (backward)
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
