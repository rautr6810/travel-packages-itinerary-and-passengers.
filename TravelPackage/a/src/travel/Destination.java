package com.travel;

import java.util.List;

public class Destination {
	 private String name;
	    private List<Activity> activities;

	    public Destination(String name, List<Activity> activities) {
	        this.name = name;
	        this.activities = activities;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public List<Activity> getActivities() {
	        return activities;
	    }
	}

