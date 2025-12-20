import java.util.Scanner;
public class RevNumberArray {
    public static void main(String[] args) {

  // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

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

        // Array to store reversed digits
        int[] reversed = new int[count];

        // Copy digits in reverse order
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        // Display reversed number
        System.out.print("\nReversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        sc.close();
    }
}
