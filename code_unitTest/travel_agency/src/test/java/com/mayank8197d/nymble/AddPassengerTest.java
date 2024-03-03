package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AddPassengerTest {
    @Test

    public void check_if_passenger_added() {
        final PackageInterface add_passenger = new AddPassenger();

        Package travelPackage = new Package("package1", 10);
        add_passenger.add_passenger(travelPackage, "person1", 1, "Gold", 1000);
        assertTrue(travelPackage.get_passengers().size() == 1);
        assertTrue(travelPackage.get_passengers().get(0).get_name() == "person1");
        assertTrue(travelPackage.get_passengers().get(0).get_number() == 1);
    }
}