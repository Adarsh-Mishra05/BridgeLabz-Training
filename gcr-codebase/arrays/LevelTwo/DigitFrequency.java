import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Special case when number is 0
        if (number == 0) {
            System.out.println("Digit Frequency:");
            System.out.println("Digit 0 occurs 1 time(s)");
            return;
        }

        int temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Array to store digits
        int[] digits = new int[count];

        temp = number;
        int index = 0;

        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Frequency array for digits 
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
