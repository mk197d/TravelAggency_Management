package com.mayank8197d.nymble;

import java.util.List;

/**
 * The DestinationInterface interface extends the TravelPackage interface and provides additional methods
 * related to destinations within a travel package.
 */
public interface DestinationInterface extends TravelPackage {

    /**
     * Prints the details of a specified destination.
     * @param destination The destination whose details are to be printed.
     */
    public void print_details(Destination destination);

    /**
     * Adds a new activity to the specified destination.
     * @param activity The activity to be added.
     * @param destination The destination to which the activity is to be added.
     */
    public void add_new_activity(Activity activity, Destination destination);

    /**
     * Checks if a specified activity is present in the given destination.
     * @param activity The activity to be checked.
     * @param destination The destination in which to check for the activity.
     * @return True if the activity is present in the destination, otherwise false.
     */
    public boolean activity_present(Activity activity, Destination destination);

    /**
     * Retrieves the available activities within the specified destination.
     * @param destination The destination from which to retrieve available activities.
     * @return A list of available activities within the specified destination.
     */
    public List<Activity> get_available_activities(Destination destination);
}
