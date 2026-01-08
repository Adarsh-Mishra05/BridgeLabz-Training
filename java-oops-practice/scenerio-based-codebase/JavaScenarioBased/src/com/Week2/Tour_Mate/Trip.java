package com.Week2.Tour_Mate;

import java.util.ArrayList;

public class Trip {
	private String destination;
	private int budget;
	private int duration;
	
	Transport transport;
	Hotel hotel;
	ArrayList<Activity> activity;
	
	public Trip(String destination, int budget, int duration) {
		//super();
		this.destination = destination;
		this.budget = budget;
		this.duration = duration;
	}
	public String getDestination() {
		return destination;
	}
	public int getBudget() {
		return budget;
	}
	public int getDuration() {
		return duration;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	int totalcost() {
		return (transport.getCost() + hotel.getCost() );

	}
	

	
}
