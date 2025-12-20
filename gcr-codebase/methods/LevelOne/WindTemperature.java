import java.util.Scanner;
public class WindTemperature{

 // Method to calculate 
  public static  double calculateWindChill(double temp, double windSpeed)
{
       double windChill=  35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windspeed,0.16);

       return windChill;
  }

  public static void main(String[] args){
     
     // Creating scanner object
      Scanner sc = new Scanner(System.in);
   
        // Take user input
        System.out.print("Enter temperature: ");
      double temp= sc.nextDouble();

        // Take user input
        System.out.print("Enter Wind Speed: ");
      double wind= sc.nextDouble();

      
      double ans=calculateWindChill(temp,wind);
       
       //Display Of Result
      System.out.println(" The wind chill temperature "+ ans);

      sc.close();
       
   }
}