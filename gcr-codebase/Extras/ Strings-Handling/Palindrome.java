import java.util.Scanner;
public class Palindrome{
	//method to check for palindrome
	 public static Boolean rev(String str){
	  String ans="";
      int n=str.length();
      for(int i=n-1;i>=0;i--){
         ans+=str.charAt(i);
      }
      return ans.equals(str);
   
	 }
	 public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();

	    System.out.println("The String is Palindrome ? "+ rev(str));

	    sc.close();
	 }


}