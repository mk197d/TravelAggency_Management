
import java.util.ArrayList;
import java.util.List;

/**
 * The Destination class represents a destination with its associated activities.
 */
public class Destination {
    private String destination_name; // The name of the destination.
    private List<Activity> destination_activities; // The list of activities associated with the destination.

    /**
     * Constructs a Destination object with the given name.
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.destination_name = name;
        this.destination_activities = new ArrayList<>();
    }

    /**
     * Retrieves the name of the destination.
     * @return The name of the destination.
     */
    public String get_name() {
        return this.destination_name;
    }

    /**
     * Sets the name of the destination.
     * @param name The name to set for the destination.
     */
    public void set_name(String name) {
        this.destination_name = name;
    }

    /**
     * Retrieves the list of activities associated with the destination.
     * @return The list of activities associated with the destination.
     */
    public List<Activity> get_Activities() {
        return this.destination_activities;
    }

    /**
     * Sets the list of activities associated with the destination.
     * @param activities The list of activities to set for the destination.
     */
    public void set_Activities(List<Activity> activities) {
        this.destination_activities = activities;
    }
}
