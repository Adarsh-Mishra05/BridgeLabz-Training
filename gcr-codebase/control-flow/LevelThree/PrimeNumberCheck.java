import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {

       // Creating scanner Object 
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime check is valid only for numbers greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
               // If number is divisible by any other number
                if (number % i == 0) {
                    isPrime = false;
                    break;   
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        sc.close();
    }
}
