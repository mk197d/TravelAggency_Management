package com.mayank8197d.nymble;

import java.util.List;

/**
 * The PrintPassengerList class implements the PackageInterface and provides a method to print the list of passengers
 * within a package.
 */
public class PrintPassengerList extends ParentPackage {
    
    /**
     * Prints the list of passengers within the package.
     * @param p The package containing the passengers.
     */
    public void print_passanger_list(Package p) {
        List<Passenger> list_p = p.get_passengers();
        
        for(Passenger person_i: list_p) {
            System.out.println("Name: " + person_i.get_name() + " Number: " + person_i.get_number() + " Membership: " + person_i.get_status());
        }
    }
}
