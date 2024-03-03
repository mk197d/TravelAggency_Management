package com.mayank8197d.nymble;
import java.util.List;

/**
 * The AddActivity class implements the PackageInterface and provides methods to add activities
 * to a package.
 */
public class AddActivity extends ParentPackage {
    private final PackageInterface dest_present = new DestinationPresent();
    private final DestinationInterface dest_int = new CheckActivity();
    
    /**
     * Adds a new activity to the package with the specified details.
     * @param p The package to which the activity will be added.
     * @param name The name of the activity.
     * @param code The code of the activity.
     * @param description The description of the activity.
     * @param destination The destination of the activity.
     * @param cost The cost of the activity.
     * @param capacity The capacity of the activity.
     * @return true if activity succesfully added at defined destination else false
     */
    public boolean add_Activity(Package p, String name, int code, String description, String destination, double cost, int capacity) {
        Activity new_act = new Activity(code, name, description, destination, cost, capacity);
        List<Destination> list_d = p.get_itinerary();
        for(Destination dest_i: list_d) {
            if(dest_int.activity_present(new_act, dest_i)) {
                System.out.println("Activity already present at destination: " + dest_i.get_name());
                return false;
            }
        }

        if(dest_present.destination_present(p, destination)) {
            for(Destination dest_i: list_d) {
                if(dest_i.get_name() == destination) {
                    List<Activity> list_a = dest_i.get_Activities();
                    list_a.add(new_act);
                    return true;
                }
            }
        } else {
            System.out.println("Specified destination not present in the package.");
            return false;
        }

        return false;
    }
}
