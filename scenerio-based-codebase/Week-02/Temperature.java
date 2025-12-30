import java.util.Scanner;
public class Temperature{
	 public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
	    double[] temp; 
	    double maxTemp=0;
	    double totalTemp=0;
	    for(int i=0;i<7;i++){
	    	System.out.println("Enter Day "+ (i+1) + " Temperature : ");
           double n= sc.nextDouble();
           totalTemp+=n;
           if(n>maxTemp) maxTemp=n;
	    }

	      System.out.println(" The Average Temperature is :" + totalTemp/7);
	      System.out.println(" The Max Temperature is :" + maxTemp);


	 }
}