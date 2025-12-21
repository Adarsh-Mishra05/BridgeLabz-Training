import java.util.Scanner;
public class UnitConvertor3 {

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double f) {
         return (f-32)* 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
          return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method for testing
    public static void main(String[] args) {

       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking input year from user
        System.out.print("Enter Temp: ");
        int n = sc.nextInt();

        System.out.println(n+ " °F in Celsius = " + convertFarhenheitToCelsius(n));
        System.out.println(n+ " °C in Fahrenheit = " + convertCelsiusToFarhenheit(n));
        System.out.println(n+" pounds in kg = " + convertPoundsToKilograms(n));
        System.out.println(n+" kg in pounds = " + convertKilogramsToPounds(n));
        System.out.println(n+ " gallons in liters = " + convertGallonsToLiters(n));
        System.out.println(n+" liters in gallons = " + convertLitersToGallons(n));
       
       // Scanner Close
        sc.close();

    }
}
