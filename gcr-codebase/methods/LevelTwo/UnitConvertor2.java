import java.util.Scanner;

public class UnitConvertor2 {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter temperature: ");
        double n = sc.nextDouble();

        // Display results
        System.out.println(n + " yards in feet = " + convertYardsToFeet(n));
        System.out.println(n + " feet in yards = " + convertFeetToYards(n));
        System.out.println(n + " meters in inches = " + convertMetersToInches(n));
        System.out.println(n + " inches in meters = " + convertInchesToMeters(n));
        System.out.println(n + " inches in centimeters = " + convertInchesToCentimeters(n));

        sc.close();
    }
}
