package com.Week3.FoodLoop;

public class FoodItem {
	String name;
	String category;
	int price;
	private int stock;
	
	public FoodItem(String name,String category,int price,int stock) {
		this.name=name;
		this.category=category;
		this.price=price;
		this.stock=stock;
	}
	
	public boolean isAvailable() {
		return stock>0;
	}
	
	protected void reduceStock() {
        stock--;
    }
	
	

		
	

}
