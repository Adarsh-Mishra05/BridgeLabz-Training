import java.util.Scanner;
public class BusAttendance{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String[] names={
			"Adarsh", "Ankit","Ayush",
			"Abhi", "Adu","Mikki",
			"Ayu", "Asu","Om","Rvi"
		}; 
		int presentCount=0;
		int absentCount=0;

		for (String s:names){
			System.out.println(s+" Present or Absent ? (P/A): ");
			char find= sc.next().charAt(0);
			if(find=='P' || find=='p' ) presentCount++;
			else if(find=='A' || find=='a' ) absentCount++;
			else {
				System.out.println(" Invalid Input ");

			}



		}
		System.out.println("Total Present Stndents :" + presentCount);
	    System.out.println("Total Absent Stndents :" + absentCount);

	   if((presentCount+absentCount)!=10) System.out.println((10-(presentCount+absentCount)) +" Stndents Given Invalid Input" );
      
      //scanner close
       sc.close();

	}
}