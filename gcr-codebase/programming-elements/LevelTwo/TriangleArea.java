import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take base input in inches
        System.out.println("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        // Take height input in inches
        System.out.println("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Area of triangle 
        double areaInSquareInches = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 square inch = 6.4516 square cm
        double areaInSquareCm = areaInSquareInches * 6.4516;

        // Display the result
        System.out.println(
            " The Area of the triangle in sq in is " + areaInSquareInches +
            " and sq cm isand sq cm is " + areaInSquareCm
        );

        // Close Scanner
        sc.close();
    }
}