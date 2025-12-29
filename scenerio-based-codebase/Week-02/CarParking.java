import java.util.Scanner;
public class CarParking{
	public static void main(String[] args){
		//Creating scanner object 
	  Scanner sc= new Scanner(System.in);
	  int choice;
	  int capacity=6;
	  int car=0;
	  while(car<capacity){
	  System.out.println("\nChoose the Option by Option Number--");
            System.out.println("1 : PARK");
            System.out.println("2 : EXIT");
            System.out.println("3 : SHOW OCCUPANCY");

            System.out.print("Enter your choice: ");
	   choice= sc.nextInt();
	   switch(choice){

	   case 1:
	    //parking
	    if(car<capacity){
	      car++;
	      System.out.println("Car is Parked.");
	    }else {
	    System.out.println("Parking is Full.");

	    }
	    break;

	    case 2:
	    //exit cars
	    if(car>0){
	     car--;
	     System.out.println("Car exitted.");
	    }
	    else {
	      System.out.println("Parking is already Empty.");
	    }
	    break;

	    case 3:
       // show Occupancy
       System.out.println("Parked cars "+ car);
       System.out.println("Availabe Slots " +( capacity-car));
       break;

       default:
           System.out.println(" Invalid choice. Try again.");

	   }

	 }
	   // scamner close
        sc.close();
	}
}