import java.util.Scanner;
public class LeapYearProgram {
    public static void main(String[] args) {

       // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

       // Checking conditions
        if (year < 1582) {
            System.out.println("Leap Year check is valid only for year >= 1582");
        } else {

            if (year % 400 == 0) {
                System.out.println("PART 1: Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("PART 1: Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("PART 1: Leap Year");
            } else {
                System.out.println("PART 1: Not a Leap Year");
            }
        }


         // Display of result after checks 

        if (year >= 1582 &&
            ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )) {

            System.out.println("PART 2: Leap Year");
        } else if (year >= 1582) {
            System.out.println("PART 2: Not a Leap Year");
        }

   // Scanner close 
        sc.close();
    }
}
