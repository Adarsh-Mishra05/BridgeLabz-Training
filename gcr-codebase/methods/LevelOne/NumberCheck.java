import java.util.Scanner;
public class NumberCheck {

    // Method to check the number
    static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

       // Creating Scanner class 
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Method call
        int result = checkNumber(number);

        // Display result
        if (result == 1)
            System.out.println("The number is Positive");
        else if (result == -1)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is Zero");

        sc.close();
    }
}
