package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CheckActivityTest {
    @Test

    public void check_if_function_returns_true() {
        final PackageInterface add_activity = new AddActivity();
        final PackageInterface add_destination = new AddDestination();
        final DestinationInterface activity_present = new CheckActivity();

        Package travelPackage = new Package("package1", 10);

        add_destination.add_Destination(travelPackage, "destination1");
        add_destination.add_Destination(travelPackage, "destination2");

        add_activity.add_Activity(travelPackage, "activity1", 001, "This is first activity", "destination1", 99, 2);
        add_activity.add_Activity(travelPackage, "activity2", 002, "This is second activity", "destination2", 100, 0);

        assertTrue(activity_present.activity_present(travelPackage.get_itinerary().get(0).get_Activities().get(0), travelPackage.get_itinerary().get(0)));
        assertTrue(activity_present.activity_present(travelPackage.get_itinerary().get(1).get_Activities().get(0), travelPackage.get_itinerary().get(1)));

    }
}