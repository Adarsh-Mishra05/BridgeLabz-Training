import java.util.Scanner;
public class heightconversion{
	public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter height in cm: ");
	   double h= sc.nextDouble();

	    double inch = h/2.54;
	    double feet= inch/12;

	    System.out.println(" Your Height in cm is "+ h +" while in feet is "+ feet + " and inches is " + inch);

	    sc.close();
	}
}