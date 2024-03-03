

/**
 * The PrintActivity class implements the ActivityInterface and provides a method to print details of an activity.
 */
public class PrintActivity extends ParentActivity {

    /**
     * Prints the details of a specified activity.
     * @param activity The activity whose details are to be printed.
     */
    public void print_details(Activity activity) {
        System.out.println(activity.get_name() + ": " + activity.get_description());
        System.out.println("Cost: " + activity.get_cost() + " MaxCapacity: " + activity.get_capacity() + " Current Bookings: " + activity.get_bookings());
        System.out.println("Total Passengers: " + activity.get_passengers().size());
        for(Passenger person: activity.get_passengers()){
            System.out.println("Name: " + person.get_name() + " Number: " + person.get_number());
        }
    }
}
