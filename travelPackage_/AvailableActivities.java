

import java.util.ArrayList;
import java.util.List;

/**
 * The AvailableActivities class implements the DestinationInterface and provides methods to retrieve
 * available activities within a destination.
 */
public class AvailableActivities extends ParentDestination {

    /**
     * Retrieves the available activities within the specified destination.
     * @param destination The destination from which to retrieve available activities.
     * @return A list of available activities within the specified destination.
     */
    public List<Activity> get_available_activities(Destination destination) {
        List<Activity> ret = new ArrayList<>();
        for(Activity act_i: destination.get_Activities()) {
            if(act_i.get_capacity() - act_i.get_bookings() > 0) {
                ret.add(act_i);
            }
        }
        return ret;
    }
}
