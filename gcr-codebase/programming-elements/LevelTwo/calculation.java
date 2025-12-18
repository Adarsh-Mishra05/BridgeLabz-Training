import java.util.Scanner;
public class calculation{
	public static void main(String[] args){
	// Declaring scanner for taking input
	   Scanner sc= new Scanner(System.in);

      // Taking num1 and num2 from user 
	    System.out.println("Enter num1 : ");
	   int number1= sc.nextInt();

	    System.out.println("Enter num2 : ");
	   int number2= sc.nextInt();

      // Display of Result
	   System.out.println("The Quotient is "+ number1/number2  + "  and Reminder is "+ number1%number2 +" of two number "+ number1 +" and "+ number2);

     sc.close();
	}
}