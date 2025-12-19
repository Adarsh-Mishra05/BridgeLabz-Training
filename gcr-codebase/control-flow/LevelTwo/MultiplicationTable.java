import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // for loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        // scanner closed
        sc.close();
    }
}
