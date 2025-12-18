import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
       // Taking age input from user
        int age = sc.nextInt();

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Closing scanner
         sc.close();
    }
}
