import java.util.Scanner;
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

     // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results 
        int[] multiplicationResult = new int[4];

        // Calculate and store results
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display multiplication table
        System.out.println("\nMultiplication Table from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
