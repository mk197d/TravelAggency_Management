
import java.util.List;

/**
 * The NewActivity class implements the DestinationInterface and provides methods to perform operations
 * related to activities in a destination.
 */
public class NewActivity extends ParentDestination {
    
    /**
     * Adds a new activity to the specified destination.
     * @param activity The activity to be added.
     * @param destination The destination to which the activity is to be added.
     */ 
    public void add_new_activity(Activity activity, Destination destination) {
        List<Activity> list = destination.get_Activities();
        list.add(activity);
    }

}
