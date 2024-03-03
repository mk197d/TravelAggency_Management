package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DestinationPresentTest {
    @Test

    public void check_if_destination_present_returns_correct_bool() {
        final PackageInterface add_destination = new AddDestination();
        final PackageInterface destination_present = new DestinationPresent();

        Package travelPackage = new Package("package1", 10);

        add_destination.add_Destination(travelPackage, "destination1");
        add_destination.add_Destination(travelPackage, "destination2");
        add_destination.add_Destination(travelPackage, "destination5");
        
        assertTrue(destination_present.destination_present(travelPackage, "destination1"));
        assertTrue(destination_present.destination_present(travelPackage, "destination2"));
        assertFalse(destination_present.destination_present(travelPackage, "destination3"));
        assertFalse(destination_present.destination_present(travelPackage, "destination4"));
        assertTrue(destination_present.destination_present(travelPackage, "destination5"));

    }
}