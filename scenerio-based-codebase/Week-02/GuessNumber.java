import java.util.Scanner;
public class GuessNumber{
	public static void main(String args[]){
		// creating scanner object 
	    Scanner sc= new Scanner (System.in);
	    // Taking random number 
	    int num= (int)(Math.random()*100)+1;
	    // System.out.println(num);
        int cnt=5;
        System.out.println("Guess a number between 1 and 100");
	    do{
	    	 int input= sc.nextInt();
	    	if(input>100 || input<0) System.out.println(" Please Enter Valid Number!");
	    	else if(input>num)System.out.println(" Too High!");
	    	else if(input<num)System.out.println(" Too Low!");
	    	else{
	    		System.out.println(" Congrats! You Guessed Right!");
	    		break;
	    	} 
	    	cnt--;
         
	    }
	    while(cnt>0);


       // scanner close 
	    sc.close();
      
	}
}