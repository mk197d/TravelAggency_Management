

/**
 * The PrintPassenger_package class implements the PackageInterface and provides methods to print
 * details of passengers within a package.
 */
public class PrintPassenger_package extends ParentPackage {
    private final PassengerInterface passenger_int = new PrintPassenger();
    private final PackageInterface pack_int = new GetPassenger();

    
    /**
     * Prints details of a specific passenger within the package.
     * @param p The package containing the passenger.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     */
    public void print_passanger_details(Package p, String name, int number) {
        Passenger curr_person = pack_int.passenger_details(p, name, number);
        passenger_int.print_details(curr_person, p);
    }
}
