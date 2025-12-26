import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking number input 
        int number = sc.nextInt();
        // Checking divisibility by 5
        boolean isDivisible = (number % 5 == 0);


        // Printing the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
   
        // Closing scanner
        sc.close();
    }
}