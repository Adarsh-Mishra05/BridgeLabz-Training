package com.Week3.FoodLoop;
import java.util.*;

public class PremiumOrder extends Order{
	public PremiumOrder(List<FoodItem> items) {
        super(items);
    }
	
	@Override
    protected double applyDiscount(double amount) {
        return amount * 0.7; 
    }
}
