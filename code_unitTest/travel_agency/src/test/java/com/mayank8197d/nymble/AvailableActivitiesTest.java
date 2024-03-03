package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AvailableActivitiesTest {
    @Test

    public void check_if_correct_activities_are_listed() {
        final PackageInterface add_activity = new AddActivity();
        final PackageInterface add_destination = new AddDestination();
        final DestinationInterface available_activities = new AvailableActivities();

        Package travelPackage = new Package("package1", 10);

        add_destination.add_Destination(travelPackage, "destination1");
        add_destination.add_Destination(travelPackage, "destination2");

        add_activity.add_Activity(travelPackage, "activity1", 001, "This is first activity", "destination1", 99, 2);
        add_activity.add_Activity(travelPackage, "activity2", 002, "This is second activity", "destination2", 100, 0);
        add_activity.add_Activity(travelPackage, "activity3", 003, "This is third activity", "destination2", 499, 2);
        add_activity.add_Activity(travelPackage, "activity4", 004, "This is fourth activity", "destination1", 985, 2);
        add_activity.add_Activity(travelPackage, "activity5", 005, "This is fifth activity", "destination1", 100, 0);

        List<Activity> available_at_dest1 = available_activities.get_available_activities(travelPackage.get_itinerary().get(0));        
        List<Activity> available_at_dest2 = available_activities.get_available_activities(travelPackage.get_itinerary().get(1));      
        
        assertTrue(available_at_dest1.size() == 2);
        assertTrue(available_at_dest1.get(0).get_code() == 001);
        assertTrue(available_at_dest1.get(1).get_code() == 004);

        assertTrue(available_at_dest2.size() == 1);
        assertTrue(available_at_dest2.get(0).get_code() == 003);

    }
}