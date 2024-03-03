package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AddDestinationTest {
    @Test

    public void check_if_destination_added() {
        final PackageInterface add_destination = new AddDestination();
        final PackageInterface destination_present = new DestinationPresent();

        Package travelPackage = new Package("package1", 10);

        add_destination.add_Destination(travelPackage, "destination1");
        assertTrue(destination_present.destination_present(travelPackage, "destination1"));
    }
}