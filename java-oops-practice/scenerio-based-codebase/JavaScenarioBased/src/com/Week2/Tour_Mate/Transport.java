package com.Week2.Tour_Mate;

public class Transport implements IBookable{
	String type;
	private int cost;
	int distanceInKm;
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Transport(String type, int distanceInKm) {
		//super();
		this.type = type;
		//this.cost = cost;
		this.distanceInKm = distanceInKm;
	}
	int totalcost() {
		return cost * distanceInKm;
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("Transport type : " + type + " with cost : " + cost + " booked");
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("Transport type : " + type + " with cost : " + cost + " cancled");
	}
}
