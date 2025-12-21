import java.util.Scanner;
public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Check Gregorian calendar condition
        if (year < 1582)
            return false;

        // Leap year conditions
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;

        return false;
    }

    public static void main(String[] args) {
      
      // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking input year from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Call Method 
        boolean result = isLeapYear(year);

        // Display of Output
        if (result)
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");

        // Scanner Close
        sc.close();
    }
}
