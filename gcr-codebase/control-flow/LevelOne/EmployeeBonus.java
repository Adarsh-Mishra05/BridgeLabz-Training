import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
      // Creating Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Taking salary input
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Taking years of service input
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();


        // Checking service condition and calculating bonus
        if (years > 5) {
            double bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Service must be more than 5 years.");
        }

        sc.close();
    }
}
