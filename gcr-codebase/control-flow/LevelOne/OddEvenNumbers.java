import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();


        if (number <= 0) {                        
            System.out.println("Please enter a natural number.");
        } else {
            // loop from 1 to number
            for (int i = 1; i <= number; i++) {   

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        sc.close();
    }
}
