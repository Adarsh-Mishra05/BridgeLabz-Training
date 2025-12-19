import java.util.Scanner;
public class StoreAndSum {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Array of size 10 and required variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop
        while (true) {

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if array size limit reached
            if (index == 10) {
                break;
            }

            // Store value and increment index
            numbers[index] = input;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}
