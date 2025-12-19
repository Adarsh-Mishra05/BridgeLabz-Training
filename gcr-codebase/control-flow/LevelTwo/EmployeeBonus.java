import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking Input as Employee salary
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
       // Taking years of service as input
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        // Checking conditions 
        if (years > 5) {
            double bonus = salary * 0.05;
            // Disply of result
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Service must be more than 5 years.");
        }

        sc.close();
    }
}
