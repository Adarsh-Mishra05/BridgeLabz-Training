import java.util.Scanner;
public class SecondLargestDigit {
    public static void main(String[] args) {

         // Creating Scanner Object 
         Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits in array
        while (number != 0) {

            // Break if array size limit reached
            if (index == maxDigit) {
                break;
            }

            digits[index] = number % 10; // extract last digit
            number = number / 10;        // remove last digit
            index++;
        }

        // Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("\nLargest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        sc.close();
    }
}
