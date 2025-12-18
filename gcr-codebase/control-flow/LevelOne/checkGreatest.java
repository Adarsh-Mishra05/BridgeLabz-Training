import java.util.Scanner;
public class checkGreatest {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking num1,num2,num3 input 
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3= sc.nextInt();

        // Checking condition

        boolean checker1 = (num1>num2 && num1>num3);
        boolean checker2 = (num2>num1 && num2>num3);
        boolean checker3 = (num3>num2 && num3>num1);

        // Printing the result
        System.out.println(
            " Is the first numbe the largest? " + checker1);
        System.out.println(
            " Is the second number the largest? " + checker2);
        System.out.println(
            " Is the third number the largest? " + checker3);
   
        // Closing scanner
        sc.close();
    }

}