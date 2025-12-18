import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args){
       // Creating Scanner object to take input
        Scanner sc= new Scanner(System.in);

        // Taking month and day from user 
       

        // int month = Integer.parseInt(args[0]);
        // int day = Integer.parseInt(args[1]);



        System.out.println("Enter month : ");
        int month=sc.nextInt();
        System.out.println("Enter day : ");
        int day=sc.nextInt();
          
          // Checking all Conditions-----
        if(month >3  && month < 6){
            System.out.println(" Its a Spring Season");

        }
        else if(month==3){
            if (day<20 ){
                System.out.println(" Not a Spring Season");

            }
            else{
                System.out.println(" Its a Spring Season");
            }
        }
        else if (month ==6){
            if (day<=20 ){
                System.out.println(" Its a Spring Season");

            }
            else{
                System.out.println(" Not a Spring Season");

            }

        }
      // scanner close 
       sc.close();
    }
}