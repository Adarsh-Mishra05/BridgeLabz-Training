import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.print("\nEnter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");

            System.out.print("Enter your choice: ");
            int currency = sc.nextInt();

            double convertedAmount = 0;

            // Switch-case for currency conversion
            switch (currency) {

                case 1: // USD
                    convertedAmount = inr * 0.012; // Example rate
                    System.out.println("Converted Amount (USD): " + convertedAmount);
                    break;

                case 2: // EUR
                    convertedAmount = inr * 0.011;
                    System.out.println("Converted Amount (EUR): " + convertedAmount);
                    break;

                case 3: // GBP
                    convertedAmount = inr * 0.010;
                    System.out.println("Converted Amount (GBP): " + convertedAmount);
                    break;

                case 4: // JPY
                    convertedAmount = inr * 1.65;
                    System.out.println("Converted Amount (JPY): " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice");
            }

            System.out.print("Do you want another conversion? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using Currency Exchange Kiosk");

        sc.close();
    }
}
