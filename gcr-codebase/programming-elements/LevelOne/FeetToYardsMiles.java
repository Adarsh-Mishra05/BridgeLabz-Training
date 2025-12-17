import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion logic
        // 1 yard = 3 feet
        double yards = distanceInFeet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        // Display the result
        System.out.println(
            "The distance in yards is " + yards +
            " and the distance in miles is " + miles
        );

        // Close the Scanner
        input.close();
    }
}
