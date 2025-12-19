import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
 
       // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;
                while (i <= num) {
                factorial = factorial * i;
                i++;
            }

           
           //Display Of Result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
