import java.util.Scanner;
public class CheckNumberSign {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        int number = sc.nextInt();

        // Checking whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Closing scann
        sc.close();

    }
}    
