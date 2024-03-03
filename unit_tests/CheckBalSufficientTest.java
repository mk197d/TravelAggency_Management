package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CheckBalSufficientTest {
    @Test

    public void check_if_balance_sufficient() {
        final PackageInterface add_passenger = new AddPassenger();
        final PackageInterface add_activity = new AddActivity();
        final PackageInterface add_destination = new AddDestination();
        final PassengerInterface check_bal_sufficient = new CheckBalSufficient();

        Package travelPackage = new Package("package1", 10);
        add_passenger.add_passenger(travelPackage, "person1", 1, "Gold", 90);
        add_passenger.add_passenger(travelPackage, "person2", 2, "Standard", 90);
        add_passenger.add_passenger(travelPackage, "person3", 3, "Standard", 100);

        

        add_destination.add_Destination(travelPackage, "destination1");
        add_activity.add_Activity(travelPackage, "activity1", 001, "This is first activity", "destination1", 100, 2);

        Passenger per1 = travelPackage.get_passengers().get(0);
        Passenger per2 = travelPackage.get_passengers().get(1);
        Passenger per3 = travelPackage.get_passengers().get(2);

        Activity act = travelPackage.get_itinerary().get(0).get_Activities().get(0);
        
        // 10% discount for gold passenger
        assertTrue(check_bal_sufficient.check_balance_sufficient(per1, act));

        // Normal rate for standard passenger
        assertFalse(check_bal_sufficient.check_balance_sufficient(per2, act));
        assertTrue(check_bal_sufficient.check_balance_sufficient(per3, act));

    }
}