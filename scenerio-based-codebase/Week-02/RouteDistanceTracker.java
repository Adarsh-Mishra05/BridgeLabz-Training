import java.util.Scanner;
public class RouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDistance = 0;
        char choice;

        System.out.println("Bus Route Distance Tracker");

        // While-loop runs until passenger gets off
        while (true) {

            System.out.print("\nEnter distance travelled to next stop (in km): ");
            double stopDistance = sc.nextDouble();

            // Add distance of current stop
            totalDistance += stopDistance;

            System.out.println("Total distance travelled: " + totalDistance + " km");

            // Ask passenger if they want to get off
            System.out.print("Do you want to get off at this stop? (Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                System.out.println("Passenger got off the bus.");
                break; // Exit loop
            }
        }

        System.out.println("\nFinal Distance Travelled: " + totalDistance + " km");

        sc.close();
    }
}
