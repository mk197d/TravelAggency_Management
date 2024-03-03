

import java.util.List;

/**
 * The AddDestination class implements the PackageInterface and provides methods to add destinations
 * to a package.
 */
public class AddDestination extends ParentPackage {
    
    /**
     * Adds a new destination to the package with the specified name.
     * @param p The package to which the destination will be added.
     * @param name The name of the destination.
     */
    public void add_Destination(Package p, String name) {
        Destination newDest = new Destination(name);
        List<Destination> list = p.get_itinerary();
        list.add(newDest);
    }
    
}
