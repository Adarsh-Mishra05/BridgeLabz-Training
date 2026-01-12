package com.Week3.FoodLoop;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		 FoodItem food1= new VegItem("Pizza", 200,10);
		 FoodItem food2= new NonVeg("Mutton",400,5);
		 FoodItem food3= new NonVeg("chicken",300,15);
		 
		 Order order1= new Order(food1,food2);
		 order1.placeOrder();
		 
		  List<FoodItem> items = new ArrayList<>();
	        items.add(food1);
	        items.add(food2);

	        Order premium = new PremiumOrder(items);
	        premium.placeOrder();
		 
	        Order order2= new Order(food2,food3);
	        order2.cancelOrder();
	        


	}
	

}
