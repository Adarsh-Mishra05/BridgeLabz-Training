package com.Week2.Tour_Mate;

public class Hotel implements IBookable{
	int type;
	private int cost;
	int days;
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Hotel(int type, int days) {
		//super();
		this.type = type;
		//this.cost = cost;
		this.days = days;
	}
	int totalcost() {
		return cost * days;
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
}
