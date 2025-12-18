import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        // Creating Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Taking input values for a, b, and c
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Performing integer operations
        double result1 = a + b * c;   
        double result2 = a * b + c;   
        double result3 = c + a / b;
        double result4 = a % b + c;   

        // Printing results
        System.out.println( "The results of Int Operations are " + result1 + " , " + result2 + " , " + result3 + " , and " + result4);

        sc.close();

        }
        }
