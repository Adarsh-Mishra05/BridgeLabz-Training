import java.util.Scanner;
public class ShopDiscount{
	public static void main(String[] args){
		// Creating scanner object
		Scanner sc= new Scanner(System.in);
		int totalBill=0;
		int items;
		double dis=0;
		System.out.println("Enter Number of Items");
		items=sc.nextInt();
		//for loop for getting total price
		for(int i=0;i<items;i++){
			totalBill+=sc.nextInt();
		}
     
       //If bill is greater than 2000 give 20% discount
		if(totalBill>2000){
			dis=totalBill*0.2;

		}
		//If bill is less than 2000 give 10% discount
        else if(totalBill>1000){
			dis=totalBill*0.1;

		}
		else dis=0;

		// Display of Bill
		System.out.println("BILL--");
        System.out.println("Total Bill :" + totalBill);
        System.out.println("Discount Bill :" + dis);
        System.out.println("Final Bill :" + (totalBill-dis));

        sc.close();

	}
}