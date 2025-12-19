import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

      // Creating scanner Object   
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {
             int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

          // Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}
