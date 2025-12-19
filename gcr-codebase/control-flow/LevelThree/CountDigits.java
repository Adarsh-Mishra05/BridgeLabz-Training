import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

       // Creating scanner Object   
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize count
        int count = 0;

        // Loop until number becomes 0
        while (number != 0) {
            number = number / 10;
            count++;
        }

        // Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
