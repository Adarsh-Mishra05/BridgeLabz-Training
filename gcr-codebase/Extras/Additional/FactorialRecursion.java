import java.util.Scanner;
public class FactorialRecursion {

    // Method to take input 
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    // Method to display output
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    // Main method
    public static void main(String[] args) {

        int number = getInput();              
        long result = factorial(number);      
        displayResult(number, result);        
    }
}
