import java.util.Scanner;
public class AreaofCircle {
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the radius");
	  double r = sc.nextDouble();

	   double area= 3.14*r*r;
	   System.out.print("Area of Circle is " + area);
	   sc.close();

	 }
}