import java.util.Scanner;
public class RocketLaunchCountdown {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking countdown starting number from user
        int counter = sc.nextInt();
        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement counter
        }

        // Launch message
        System.out.println(" Rocket Launched!");

        // Closing scanner
        sc.close();
    }
}
