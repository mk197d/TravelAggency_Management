package com.mayank8197d.nymble;

/**
 * The PassengerInterface interface extends the TravelPackage interface and provides additional methods
 * related to passengers within a travel package.
 */
public interface PassengerInterface extends TravelPackage {

    /**
     * Prints the details of a specified passenger and package.
     * @param person The passenger whose details are to be printed.
     * @param P The package associated with the passenger.
     */
    public void print_details(Passenger person, Package P);

    /**
     * Checks if the balance of a specified passenger is sufficient for a given activity.
     * @param person The passenger whose balance is to be checked.
     * @param activity The activity for which the balance is to be checked.
     * @return True if the balance is sufficient, otherwise false.
     */
    public boolean check_balance_sufficient(Passenger person, Activity activity);

    /**
     * Adjusts the balance of a specified passenger based on a given action and activity.
     * @param action The action to be performed, either "deduct" or "refund".
     * @param person The passenger whose balance is to be adjusted.
     * @param activity The activity for which the balance is to be adjusted.
     */
    public void adjust_balance(String action, Passenger person, Activity activity);
}
