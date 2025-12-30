import java.util.Scanner;
public class MovieTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char nextCustomer;

        do {
            int totalBill = 0;

            // Movie Type
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Normal");
            System.out.println("2. 3D");
            System.out.print("Enter choice: ");
            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    totalBill += 150;
                    System.out.println("Normal Movie Selected");
                    break;
                case 2:
                    totalBill += 250;
                    System.out.println("3D Movie Selected");
                    break;
                default:
                    System.out.println("Invalid Movie Type");
                    continue; // move to next customer
            }

            // Seat Type
            System.out.print("Select Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                totalBill += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                totalBill += 50;
            } else {
                System.out.println("Invalid Seat Type");
                continue;
            }

            // Snacks
            System.out.print("Do you want snacks? (Yes/No): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("Yes")) {
                totalBill += 80;
            }

            // Final Bill
            System.out.println("Total Bill Amount: ₹" + totalBill);

            // Next customer
            System.out.print("\nNext Customer? (Y/N): ");
            nextCustomer = sc.next().charAt(0);

        } while (nextCustomer == 'Y' || nextCustomer == 'y');

        sc.close();
    }
}
