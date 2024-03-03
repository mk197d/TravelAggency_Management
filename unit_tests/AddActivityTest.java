package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AddActivityTest {
    @Test

    public void check_if_activity_added() {
        final PackageInterface add_activity = new AddActivity();
        final PackageInterface add_destination = new AddDestination();

        Package travelPackage = new Package("package1", 10);

        add_destination.add_Destination(travelPackage, "destination1");
        assertTrue(add_activity.add_Activity(travelPackage, "activity1", 001, "This is first activity", "destination1", 100, 2));
    }
}