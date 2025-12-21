import java.util.Scanner;
public class SumOfNumbers {

    // Method to find sum using recursion
    public static int sumRecursion(int n) {
        if (n == 0)
            return 0;
        return n + sumRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
      
      //Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check for negative number 
        if (n <= 0) {
            System.out.println("Please enter a natural number");
        } else {

            // All Method calls
            int recursiveSum = sumRecursion(n);
            int formulaSum = sumFormula(n);

            // Display of results
            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);

            // Comparing both results
            if (recursiveSum == formulaSum)
                System.out.println("Both results are correct and equal");
            else
                System.out.println("Results are NOT equal");
        }
      // Closing of scanner 
        sc.close();
    }
}
