import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        
        // creating scanner object 
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // loop from 1 to number
            for (int i = 1; i <= number; i++) {
                // multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // normal number
                else {
                    System.out.println(i);
                }
            }
        }
      // scanner close 
        sc.close();
    }
}
