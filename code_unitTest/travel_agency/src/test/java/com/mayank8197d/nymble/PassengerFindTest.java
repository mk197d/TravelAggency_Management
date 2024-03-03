package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PassengerFindTest {
    @Test

    public void check_if_correct_index_returned() {
        final ActivityInterface find_index = new PassengerFind();
        final PackageInterface add_passenger = new AddPassenger();
        final PackageInterface add_activity = new AddActivity();
        final PackageInterface add_destination = new AddDestination();
        final PackageInterface enroll_passenger = new EnrollPassenger();

        Package travelPackage = new Package("package1", 10);  
        add_passenger.add_passenger(travelPackage, "p1", 1, "Gold", 2000);      
        add_passenger.add_passenger(travelPackage, "p2", 2, "Standard", 500);      
        add_passenger.add_passenger(travelPackage, "p3", 3, "Premium", -1);  

        add_destination.add_Destination(travelPackage, "destination1");
        add_activity.add_Activity(travelPackage, "activity1", 001, "This is first activity", "destination1", 100, 2);

            

        enroll_passenger.enroll_passanger(travelPackage, "p1", 1, "act", 001);
        enroll_passenger.enroll_passanger(travelPackage, "p2", 2, "act", 001);
        enroll_passenger.enroll_passanger(travelPackage, "p3", 3, "act", 001);

        Passenger per1 = travelPackage.get_passengers().get(0);
        Passenger per2 = travelPackage.get_passengers().get(1);
        Passenger per3 = travelPackage.get_passengers().get(2);

        Activity act = travelPackage.get_itinerary().get(0).get_Activities().get(0);
        assertTrue(find_index.get_person_index(per3, act) == 2);
        assertTrue(find_index.get_person_index(per2, act) == 1);
        assertTrue(find_index.get_person_index(per1, act) == 0);
        
    }
}