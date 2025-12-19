import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
      // Creating Scanner to take input
        Scanner sc = new Scanner(System.in);  
        //Taing input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();


        // loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close();
    }
}
