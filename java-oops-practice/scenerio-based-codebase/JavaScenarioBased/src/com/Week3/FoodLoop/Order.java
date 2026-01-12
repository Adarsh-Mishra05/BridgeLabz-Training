package com.Week3.FoodLoop;
import java.util.*;

public class Order implements IOrderable {
	List<FoodItem> items= new ArrayList<>
();
	double total;
	
	public Order(List<FoodItem> items) {
		this.items=items;
		calculateTotal();
		
	}
	
	public Order(FoodItem item1,FoodItem item2) {
		items.add(item1);
		items.add(item2);
		calculateTotal();
	}
	
	 private void calculateTotal() {
	        total = 0;
	        for (FoodItem item : items) {
	            total += item.price;   // Operator usage
	        }
	        total = applyDiscount(total);
	    }
	 protected double applyDiscount(double total) {
			if(total>1000) {
				total*=0.9;
			}
			return total;
		}
	 
	 @Override
	    public void placeOrder() {
		 System.out.println("------Your Order is Placed------" );
		 System.out.println("Total bill is "+ total );	    }

	    @Override
	    public void cancelOrder() {
	        System.out.println("Order cancelled");
	    }
	
}
