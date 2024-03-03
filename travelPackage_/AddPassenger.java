

import java.util.List;

/**
 * The AddPassenger class implements the PackageInterface and provides methods to add passengers
 * to a package.
 */
public class AddPassenger extends ParentPackage {
    
    /**
     * Adds a new passenger to the package with the specified details.
     * @param p The package to which the passenger will be added.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     * @param membership The membership status of the passenger.
     * @param init_balance The initial balance of the passenger.
     */
    
    public void add_passenger(Package p, String name, int number, String membership, int init_balance) {
        Passenger newPerson = new Passenger(name, number, membership, init_balance);
        List<Passenger> list = p.get_passengers();
        list.add(newPerson);
    }
}
