import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {

            System.out.print("Enter lucky number: ");

            // check invalid input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                sc.next();       
                continue;        
            }

            int num = sc.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("You won a gift");
            } else {
                System.out.println("Better luck next time");
            }

            System.out.print("Next visitor? (Y/N): ");
            choice = sc.next().charAt(0);
        }

        sc.close();
    }
}
