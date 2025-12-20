import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {

      //Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        int n = 10;

        // Arrays to store data
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        // Totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < n; i++) {

            System.out.print("Employee " + (i + 1) + " Salary: ");
            double s = sc.nextDouble();

            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to re-enter data
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Bonus calculation loop
        for (int i = 0; i < n; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Old Salary  = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
