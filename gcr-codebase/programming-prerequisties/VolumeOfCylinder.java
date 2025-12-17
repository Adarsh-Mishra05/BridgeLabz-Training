import java.util.Scanner;
public class VolumeOfCylinder{
  public static void main(String[] args){
     Scanner sc =  new Scanner(System.in);
     System.out.print("Enter the Radius of cylinder") ;
     int r=sc.nextInt();
     System.out.print("Enter the height of cylinder") ;
     int h=sc.nextInt();

     double volume= 3.14*r*r*h;

     System.out.print("Volume of cylinder is : " + volume ) ;
     sc.close();
  }
	
}