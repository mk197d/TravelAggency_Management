

/**
 * The CheckActivity class implements the DestinationInterface and provides methods to check
 * the presence of an activity in a destination.
 */
public class CheckActivity extends ParentDestination {

    /**
     * Checks if a specified activity is present in the given destination.
     * @param activity The activity to be checked.
     * @param destination The destination in which to check for the activity.
     * @return True if the activity is present in the destination, otherwise false.
     */
    public boolean activity_present(Activity activity, Destination destination) {
        for(Activity act_i: destination.get_Activities()) {
            if(act_i.get_code() == activity.get_code()) {
                return true;
            }
        }
        return false;
    }

}
