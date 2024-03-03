package com.mayank8197d.nymble;

import java.util.List;

/**
 * The PrintDestination class implements the DestinationInterface and provides a method to print details
 * of activities available in a destination.
 */
public class PrintDestination extends ParentDestination {
    private final DestinationInterface dest = new AvailableActivities();

    /**
     * Prints the details of activities available in the specified destination.
     * @param destination The destination whose available activities' details are to be printed.
     */
    public void print_details(Destination destination) {
        System.out.println("Destination: " + destination.get_name());
        List<Activity> available = dest.get_available_activities(destination);
        for(Activity act_i: available) {
            System.out.println(act_i.get_name() + ": " + act_i.get_description());
            System.out.println("Available Spaces: " + (act_i.get_capacity() - act_i.get_bookings()));
        }
    }

}
