import java.util.Scanner;
public class TriangularParkRun {

    // calculate number of rounds
    static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for sides of triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Method call
        double rounds = calculateRounds(side1, side2, side3);

        // Display of Output
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish 5 km run.");

        sc.close();
    }
}
