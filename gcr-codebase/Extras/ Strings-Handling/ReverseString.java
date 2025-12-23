import java.util.Scanner;
public class ReverseString{
   
   public static String rev(String str){
     String ans="";
      int n=str.length();
      for(int i=n-1;i>=0;i--){
         ans+=str.charAt(i);
      }
      return ans;
   }
	  
	  public static void main(String[] args){
	  	  Scanner sc = new Scanner(System.in);
	  	 // Take input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
	      String reverse=rev(str);
	      System.out.println(reverse);
	     
	     sc.close();
	  }
}