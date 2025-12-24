import java.util.Scanner;
public class GcdLcmCalculator {

    // Function to calculate GCD 
    public static int findGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int findLCM(int a, int b) {

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        return lcm;
    }

    // Main method
    public static void main(String[] args) {
     
     // Creating scanner class 
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Function calls
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        // Display result
        System.out.println("\nGreatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);

        sc.close();
    }
}
