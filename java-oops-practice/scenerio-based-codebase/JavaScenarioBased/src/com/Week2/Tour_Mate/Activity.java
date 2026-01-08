package com.Week2.Tour_Mate;

public class Activity implements IBookable{
	String type;
	private int cost;
	int time;
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Activity(String type, int distanceInKm) {
		//super();
		this.type = type;
		//this.cost = cost;
		this.time = distanceInKm;
	}
	int totalcost() {
		return cost * time;
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
