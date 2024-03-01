package com.travel;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
	 private String name;
	    private int passengerCap;
	    private List<Destination> itinerary;
	    private List<Passenger> passengerList;

	    public TravelPackage(String name, int passengerCap, List<Destination> itinerary) {
	        this.name = name;
	        this.passengerCap = passengerCap;
	        this.itinerary = itinerary;
	        this.passengerList = new ArrayList<>();
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getPassengerCap() {
	        return passengerCap;
	    }

	    public List<Destination> getItinerary() {
	        return itinerary;
	    }

	    public List<Passenger> getPassengerList() {
	        return passengerList;
	    }

	    // Method to add a passenger
	    public boolean addPassenger(Passenger passenger) {
	        if (passengerList.size() < passengerCap) {
	            passengerList.add(passenger);
	            return true;
	        }
	        return false;
	    }

	    // Method to print itinerary
	    public void printItinerary() {
	        System.out.println("Travel Package: " + name);
	        for (Destination destination : itinerary) {
	            System.out.println("Destination: " + destination.getName());
	            List<Activity> activities = destination.getActivities();
	            for (Activity activity : activities) {
	                System.out.println("Activity: " + activity.getName());
	                System.out.println("Description: " + activity.getDescription());
	                System.out.println("Cost: " + activity.getCost());
	                System.out.println("Capacity: " + activity.getCapacity());
	            }
	        }
	    }

	    // Method to print passenger list
	    public void printPassengerList() {
	        System.out.println("Travel Package: " + name);
	        System.out.println("Passenger Capacity: " + passengerCap);
	        System.out.println("Number of Passengers: " + passengerList.size());
	        for (Passenger passenger : passengerList) {
	            System.out.println("Passenger Name: " + passenger.getName());
	            System.out.println("Passenger Number: " + passenger.getNumber());
	        }
	    }

	    // Method to print details of an individual passenger
	    public void printPassengerDetails(Passenger passenger) {
	        System.out.println("Passenger Name: " + passenger);
	    }}