import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
     // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        //Checking condition and caluting results
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {

            for (int i = 1; i <= number; i++) {
          
                if (i % 2 == 0) {
                  // Display of result
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        sc.close();
    }
}
