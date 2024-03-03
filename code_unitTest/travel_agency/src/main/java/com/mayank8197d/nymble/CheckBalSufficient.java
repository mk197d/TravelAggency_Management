package com.mayank8197d.nymble;

/**
 * The CheckBalSufficient class implements the PassengerInterface and provides a method to check
 * if a passenger's balance is sufficient for a given activity.
 */
public class CheckBalSufficient extends ParentPassenger {

    /**
     * Checks if the balance of a specified passenger is sufficient for a given activity.
     * @param person The passenger whose balance is to be checked.
     * @param activity The activity for which the balance is to be checked.
     * @return True if the balance is sufficient, otherwise false.
     */
    public boolean check_balance_sufficient(Passenger person, Activity activity) {
        if(person.get_status().equals("Standard")) {
            return person.get_balance() >= activity.get_cost();
        } else if(person.get_status().equals("Gold")) {
            return person.get_balance() >= activity.get_cost() * (1 - person.gold_discount);
        } else {
            return true;
        }
    }

}
