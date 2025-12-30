import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seats = 10;
        int booked = 0;

        while (true) {

            System.out.println("\nChoose the Option number--");
            System.out.println("1: Book Ticket");
            System.out.println("2: How many Seats Available?");
            System.out.println("3: Exit");

            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {

                case 1:
                    if (booked < seats) {
                        booked++;
                        System.out.println("Ticket is Booked");
                    } else {
                        System.out.println("Sorry! Seats are not Available.");
                        break; // stop booking
                    }
                    break;

                case 2:
                    System.out.println("Available Seats are: " + (seats - booked));
                    break;

                case 3:
                    System.out.println("Thank you for using Ticket Booking System");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Stop booking when seats are full
            if (booked == seats) {
                System.out.println("All seats are booked. Booking closed.");
                break;
            }
        }

        sc.close();
    }
}
