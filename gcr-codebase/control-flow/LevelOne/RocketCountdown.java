import java.util.Scanner;
public class RocketLaunchCountdown2 {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking countdown starting number from user
        int counter = sc.nextInt();
        // Countdown using for loop

        for(int i=counter ;i>=1;i--){
        
            System.out.println(i);
            
        }

        // Launch message
        System.out.println(" Rocket Launched!");

        // Closing scanner
        sc.close();
    }
}