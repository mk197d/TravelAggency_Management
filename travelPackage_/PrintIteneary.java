

import java.util.List;


/**
 * The PrintIteneary class implements the PackageInterface and provides a method to print
 * the itinerary of a package.
 */
public class PrintIteneary extends ParentPackage {
    private final DestinationInterface dest_int = new PrintDestination();
    
    /**
     * Prints the itinerary of the package.
     * @param p The package whose itinerary is to be printed.
     */
    public void print_iteneary(Package p) {
        List<Destination> list_d = p.get_itinerary();
        for(Destination dest_i: list_d) {
            dest_int.print_details(dest_i);
        }
    }
}
