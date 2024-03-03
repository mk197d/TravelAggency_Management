package com.mayank8197d.nymble;
import java.util.List;

/**
 * The DestinationPresent class implements the PackageInterface and provides functionality
 * to check if a destination is already present in the package's itinerary.
 */
public class DestinationPresent extends ParentPackage {

    /**
     * Checks if a destination is already present in the package's itinerary.
     *
     * @param p the package to check for destination presence
     * @param dest the name of the destination to check
     * @return true if the destination is already present, false otherwise
     */
    public boolean destination_present(Package p, String dest) {
        List<Destination> list = p.get_itinerary();
        for(Destination dest_i: list) {
            if(dest_i.get_name() == dest) {
                return true;
            }
        }
        return false;
    }

}
