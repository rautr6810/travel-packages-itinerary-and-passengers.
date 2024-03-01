package com.travel;


import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		 Activity activity1 = new Activity("Sightseeing", "Enjoy the sights", 50.0, 20);
	        Activity activity2 = new Activity("Hiking", "Explore the mountains", 80.0, 15);
	        Activity activity3 = new Activity("Scuba Diving", "Discover underwater world", 120.0, 10);

	        // Sample destinations with activities
	        List<Activity> activities1 = new ArrayList<>(List.of(activity1, activity2));
	        Destination destination1 = new Destination("City A", activities1);
	        List<Activity> activities2 = new ArrayList<>(List.of(activity2, activity3));
	        Destination destination2 = new Destination("City B", activities2);

	        // Sample itinerary
	        List<Destination> itinerary = new ArrayList<>(List.of(destination1, destination2));

	        // Sample travel package
	        TravelPackage travelPackage = new TravelPackage("Package 1", 25, itinerary);

	        // Sample passengers
	        Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
	        Passenger passenger2 = new Passenger("Alice", 2, PassengerType.GOLD);
	        Passenger passenger3 = new Passenger("Bob", 3, PassengerType.PREMIUM);

	        // Adding passengers to the travel package
	        travelPackage.addPassenger(passenger1);
	        travelPackage.addPassenger(passenger2);
	        travelPackage.addPassenger(passenger3);

	        // Signing up passengers for activities
	        passenger1.signUp(activity1);
	        passenger2.signUp(activity2);
	        passenger3.signUp(activity3);

	        // Testing methods
	        travelPackage.printItinerary();
	        travelPackage.printPassengerList();
	        travelPackage.printPassengerDetails(passenger1);
	        travelPackage.printAvailableActivities();
	    }
	}