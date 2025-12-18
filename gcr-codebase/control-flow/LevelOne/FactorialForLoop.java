import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
        } else {

            int factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
