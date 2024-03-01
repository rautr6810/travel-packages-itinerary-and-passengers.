package com.travel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PassengerTest {

    @Test
    public void testSignUp() {
        // Creating a standard passenger
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
        // Creating an activity
        Activity activity = new Activity("Sightseeing", "Enjoy the sights", 50.0, 20);
        
        // Signing up for an activity
        boolean signedUp = passenger.signUp(activity);
        
        // Asserting that signing up is successful
        assertTrue(signedUp);
        // Asserting that activity is added to passenger's activities list
        assertEquals(1, passenger.getActivities().size());
        // Asserting that balance is deducted
        assertEquals(0.0, passenger.getBalance(), 0.01);
    }
}
