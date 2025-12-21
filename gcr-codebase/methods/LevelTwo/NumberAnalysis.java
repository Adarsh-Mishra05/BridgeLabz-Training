import java.util.Scanner;
public class NumberAnalysis {

    // Method for check positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method for check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers 
    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
       // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input from User 
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        System.out.println(" Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");

            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
      
      // Display Of Result
        System.out.println("Comparison Result ---");
        if (result == 1)
            System.out.println("First element is greater than last element");
        else if (result == 0)
            System.out.println("First & last elements are equal");
        else
            System.out.println("First element is less than last element");
     
      // Scanner Close
        sc.close();
    }
}
