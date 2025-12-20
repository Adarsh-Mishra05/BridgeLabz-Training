import java.util.Scanner;
public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Method call
        int result = findSum(n);

        // Display output
        System.out.println("Sum of first " + n + " natural numbers is: " + result);

        sc.close();
    }
}
