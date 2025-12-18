import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Variable to store total sum
        double total = 0.0;
        // Variable to store user input
        double number=sc.nextDouble();
        // Loop continues until user enters 0
        while (number != 0) {
            total = total + number;   
            number = sc.nextDouble(); 
        }

        // Displaying the total 
        System.out.println("The total sum is " + total);

        // Closing scanner
        sc.close();
    }
}
