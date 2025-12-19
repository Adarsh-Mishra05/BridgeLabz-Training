import java.util.Scanner;
public class FactorsOfNumberwhile {
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
           int i=1;
            //      While Loop from 1 to number-1
            while (i < number) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}
