import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take base input in inches
        System.out.println("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        // Take height input in inches
        System.out.println("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Area of triangle formula: (1/2) * base * height
        double areaInSquareInches = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 square inch = 6.4516 square cm
        double areaInSquareCm = areaInSquareInches * 6.4516;

        // Display the result
        System.out.println(
            "The area of the triangle is " + areaInSquareInches +
            " square inches and " + areaInSquareCm + " square centimeters"
        );

        // Close Scanner
        sc.close();
    }
}

