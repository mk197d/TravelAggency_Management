
import java.util.List;

/**
 * The GetPassenger class implements the PackageInterface and provides functionality
 * to retrieve details of a specific passenger from a package.
 */
public class GetPassenger extends ParentPackage {

    /**
     * Retrieves details of a specific passenger from the package.
     *
     * @param p The package from which to retrieve passenger details
     * @param name The name of the passenger
     * @param number The number of the passenger
     * @return The Passenger object containing the details of the specified passenger
     */
    public Passenger passenger_details(Package p, String name, int number) {
        Passenger person_i = new Passenger();

        List<Passenger> list_p = p.get_passengers();
        for(Passenger list_p_person: list_p) {
            if(list_p_person.get_name().equals(name) && list_p_person.get_number() == number) {
                person_i = list_p_person;
            }
        }
        return person_i;
    }
}
