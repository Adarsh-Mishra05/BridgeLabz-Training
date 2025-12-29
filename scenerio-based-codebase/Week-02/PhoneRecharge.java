import java.util.Scanner;
public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        int choice;

        System.out.println(" Welcome to Phone Recharge Simulator");

        // Loop to allow repeated recharges
        while (true) {

            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting Recharge Simulator");
                break;
            }

            System.out.print("Enter recharge amount: ₹");
            double amount = sc.nextDouble();

            // Switch-case for operator offers
            switch (choice) {

                case 1: // Jio
                    System.out.println(" Jio Offer: 1GB/day for 28 days");
                    break;

                case 2: // Airtel
                    System.out.println(" Airtel Offer: Unlimited calls + 2GB/day");
                    break;

                case 3: // VI
                    System.out.println(" VI Offer: Weekend data rollover");
                    break;

                default:
                    System.out.println(" Invalid operator choice");
                    continue;
            }

            // Update balance
            balance += amount;
            System.out.println(" Current Balance: ₹" + balance);
        }

        sc.close();
    }
}
