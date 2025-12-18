import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Ask user to enter first number
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        // Ask user to enter second number
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the results
        System.out.println(" Calculator Results ---");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        // Close the scanner
        sc.close();
    }
}
