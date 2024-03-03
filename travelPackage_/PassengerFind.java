

import java.util.List;

/**
 * The PassengerFind class implements the ActivityInterface and provides methods to find a passenger
 * within an activity and print details of an activity.
 */
public class PassengerFind extends ParentActivity {

    /**
     * Retrieves the index of a specific passenger within an activity.
     * @param person The passenger for whom the index is to be retrieved.
     * @param activity The activity in which the passenger's index is to be found.
     * @return The index of the specified passenger in the given activity, or -1 if not found.
     */
    
    public int get_person_index(Passenger person, Activity activity){
        List<Passenger> list = activity.get_passengers();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).get_name().equals(person.get_name()) && list.get(i).get_number() == person.get_number()) {
                return i;
            }
        }
        return -1;
    }

}
