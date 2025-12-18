import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking input value of n
        int n = sc.nextInt();

        // Checking the number is a Natural number or not 
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            // Sum using while loop
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }
            // Sum using formula n*(n+1)/2
            int sumFormula = n * (n + 1) / 2;

            // Printing both results
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);

            // Comparing both results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Both computations are not equal.");
            }
        }

        // Closing scanner
        sc.close();
    }
}
