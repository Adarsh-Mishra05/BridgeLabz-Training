import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {

        // Creating scanner Object  
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        // Loop to find sum of divisors
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant Number condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}
