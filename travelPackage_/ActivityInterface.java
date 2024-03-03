
/**
 * The ActivityInterface interface extends the TravelPackage interface and provides additional methods
 * related to activities within a travel package.
 */
public interface ActivityInterface extends TravelPackage {

    /**
     * Retrieves the index of a specific passenger within an activity.
     * @param person The passenger for whom the index is to be retrieved.
     * @param activity The activity in which the passenger's index is to be found.
     * @return The index of the specified passenger in the list of given activity.
     */
    public int get_person_index(Passenger person, Activity activity);

    /**
     * Prints the details of a specified activity.
     * @param activity The activity whose details are to be printed.
     */
    public void print_details(Activity activity);
}
