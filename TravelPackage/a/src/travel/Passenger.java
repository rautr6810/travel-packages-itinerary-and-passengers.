package com.travel;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
	 private String name;
	    private int number;
	    private PassengerType type;
	    private double balance;
	    private List<Activity> activities;

	    public Passenger(String name, int number, PassengerType type) {
	        this.name = name;
	        this.number = number;
	        this.type = type;
	        this.balance = 0.0;
	        this.activities = new ArrayList<>();
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getNumber() {
	        return number;
	    }

	    public PassengerType getType() {
	        return type;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public List<Activity> getActivities() {
	        return activities;
	    }

	    // Method to sign up for an activity
	    public boolean signUp(Activity activity) {
	        if (type == PassengerType.PREMIUM) {
	            activities.add(activity);
	            return true;
	        } else if (balance >= activity.getCost()) {
	            activities.add(activity);
	            balance -= activity.getCost();
	            return true;
	        }
	        return false;
	    }
}