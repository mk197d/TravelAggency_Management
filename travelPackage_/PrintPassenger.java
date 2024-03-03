

/**
 * The PrintPassenger class implements the PassengerInterface and provides a method to print details
 * of a passenger and their enrolled activities.
 */
public class PrintPassenger extends ParentPassenger {
    private final ActivityInterface act_Interface = new PassengerFind();

    /**
     * Prints the details of a specified passenger and package.
     * @param person The passenger whose details are to be printed.
     * @param P The package associated with the passenger.
     */
    public void print_details(Passenger person, Package P) {
        System.out.println("Name: " + person.get_name() + " Number: " + person.get_number() + " Membership: " + person.get_status());
        System.out.println("Available Balance: " + person.get_balance() + " Enrolled Activities: ");
        for(Destination dest_i: P.get_itinerary()) {
            System.out.println("Destination: " + dest_i.get_name());
            for(Activity act_i: dest_i.get_Activities()) {
                if(act_Interface.get_person_index(person, act_i) >= 0) {
                    System.out.println("Activity: " + act_i.get_name() + " Code: " + act_i.get_code());
                }
            }
        }
    }
}
