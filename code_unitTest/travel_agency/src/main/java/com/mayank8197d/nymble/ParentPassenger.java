package com.mayank8197d.nymble;

public abstract class ParentPassenger implements PassengerInterface {

    public void print_details(Passenger person, Package P) {}

    
    public boolean check_balance_sufficient(Passenger person, Activity activity) {
        return true;
    }
    
    public void adjust_balance(String action, Passenger person, Activity activity) {}
}
