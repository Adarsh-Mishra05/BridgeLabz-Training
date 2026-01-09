package com.Week3.Artify;

public class Main {
	public static void main(String args[]) {
		
		   User user = new User("Adarsh", 5000);
		
		    IPurchasable art1 = new DigitalArt(
	                "Sunset Bliss", "Rahul", 1500, "Digital License"
	        );

	        IPurchasable art2 = new PrintArt(
	                "Mountain View", "Aman", 2000, "Print License"
	        );
	        IPurchasable art3 = new PrintArt(
	                "Sky View", "Ashu", 2000, "Print License"
	        );
	        
	        art1.purchase(user);
	        art1.license();

	        art2.purchase(user);
	        art2.license();
	        art3.purchase(user);

	        System.out.println("Remaining Wallet Balance: " + user.getWalletBalence());
	        
	        
	}

}
