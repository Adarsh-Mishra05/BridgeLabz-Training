import java.util.Scanner;
public class NumberChecker2 {

    // Method to count digits
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Method to store digits
    public static int[] storeDigit(int number, int count) {
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean Harshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency 
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // main method
    public static void main(String[] args) {
       
       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
       // Taking Input from User
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       
        int count = countDigit(number);
        int[] digits = storeDigit(number, count);

        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        
        // Display Of Results
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + Harshad(number, digits));

        int[][] freq = digitFrequency(digits);
      
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
            }
        }
       // Scanner close
        sc.close();
    }
}
