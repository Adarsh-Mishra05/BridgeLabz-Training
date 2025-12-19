import java.util.Scanner;
public class PowerOfNumberWhile {
    public static void main(String[] args) {
       
       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
       System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Checking for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
        } else {

            int counter = 100;

            System.out.println("Multiples of " + number + " below 100:");

            // while loop from 100 to 1
            while (counter > 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }
        }

        sc.close();
    }
}
