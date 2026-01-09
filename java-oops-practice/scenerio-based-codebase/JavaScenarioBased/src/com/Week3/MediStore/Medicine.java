
package com.Week3.MediStore;
import java.time.LocalDate;


public class Medicine implements ISellable{
	private String name;
	private double price;
	private LocalDate expiryDate;
	private int quantity;
	
	public Medicine(String name,double price,LocalDate expiryDate) {
		this(name,price,expiryDate,10);
	}
	
	public Medicine(String name,double price,LocalDate expiryDate,int quantity) {
		this.name=name;
		this.price=price;
		this.expiryDate=expiryDate;
		this.quantity= quantity;
	}
	
	private double applyDiscount(double total) {
		if(total>1000) return total*0.90;
		return total;
	}
	
	public void sell(int qty) {
		if(qty<=quantity) {
			double total= price*qty;
			total=applyDiscount(total);
			quantity-=qty;
			
			System.out.println(name + " sold | Quantity: "+ qty);
			System.out.println("Bill Amount: Rs" + total);
		}
		else {
			System.out.println("Insufficient stock for " + name);
		}
	}
	public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println(name + " is EXPIRED ❌");
        } else {
            System.out.println(name + " is safe to use ✅");
        }
    }
	protected int getQuantity() {
		return quantity;
	}
	
	
	
	

}
