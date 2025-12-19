import java.util.Scanner;
public class HarshNumber {
    public static void main(String[] args) {
        
        // Creating scanner Object   
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Loop to find sum of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Check Harshad condition
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        sc.close();
    }
}
