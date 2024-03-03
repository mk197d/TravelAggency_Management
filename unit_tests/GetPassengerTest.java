package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GetPassengerTest {
    @Test

    public void check_if_getPassenger_returns_correct_passenger() {
        final PackageInterface add_passenger = new AddPassenger();
        final PackageInterface get_passenger = new GetPassenger();

        Package travelPackage = new Package("package1", 10);
        add_passenger.add_passenger(travelPackage, "person1", 1, "Gold", 1000);
        add_passenger.add_passenger(travelPackage, "person2", 2, "Standard", 550);

        assertTrue(get_passenger.passenger_details(travelPackage, "person1", 1).get_name() == "person1");
        assertTrue(get_passenger.passenger_details(travelPackage, "person2", 2).get_name() == "person2");
        assertTrue(get_passenger.passenger_details(travelPackage, "person1", 1).get_number() == 1);
        assertTrue(get_passenger.passenger_details(travelPackage, "person2", 2).get_number() == 2);

    }
}