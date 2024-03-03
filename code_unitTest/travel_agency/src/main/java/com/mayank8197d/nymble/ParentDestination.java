package com.mayank8197d.nymble;
import java.util.ArrayList;
import java.util.List;

public abstract class ParentDestination implements DestinationInterface {
    
    public void print_details(Destination destination) {}

    public void add_new_activity(Activity activity, Destination destination) {
        
    }

    public boolean activity_present(Activity activity, Destination destination) {
        return true;
    }

    
    public List<Activity> get_available_activities(Destination destination) {
        List<Activity> ret = new ArrayList<>();
        return ret;
    }
}
