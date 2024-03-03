package com.mayank8197d.nymble;

import java.util.List;

/**
 * The PrintAvailableActivities class implements the PackageInterface and provides a method to print details of
 * available activities within a package.
 */
public class PrintAvailableActivities extends ParentPackage {
    private final DestinationInterface dest_int = new PrintDestination();
    
    /**
     * Prints details of available activities within the package.
     * @param p The package containing the activities.
     */
    public void print_available_activities(Package p) {
        List<Destination> list_d = p.get_itinerary();
        
        for(Destination dest_i: list_d){
            dest_int.print_details(dest_i);
        }
    }

}
