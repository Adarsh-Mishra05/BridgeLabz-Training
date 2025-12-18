import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Variable to store total sum
        double total = 0.0;
       // Infinite loop
        while (true) {

            // Taking user input
            double number = sc.nextDouble();
            // Break condition: if number is 0 or negative
            if (number <= 0) {
                break;
            }
            // Adding number to total
            total = total + number;
        }

        // Displaying the total sum
        System.out.println("The total sum is " + total);

        // Closing scanner
        sc.close();
    }
}
