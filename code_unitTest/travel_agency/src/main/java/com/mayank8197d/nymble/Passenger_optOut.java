package com.mayank8197d.nymble;

import java.util.List;

/**
 * The Passenger_optOut class implements the PackageInterface and provides functionality
 * to remove a passenger from a specific activity within a package and adjust their balance accordingly.
 * This class ensures that when a passenger opts out of an activity, their balance is adjusted
 * and they are removed from the activity's passenger list.
 */
public class Passenger_optOut extends ParentPackage {
    private final PackageInterface pack_int = new GetPassenger();
    private final DestinationInterface dest_int = new CheckActivity();
    private final PassengerInterface passenger_int = new AdjustBalance();

    
    /**
     * Removes a passenger from a specific activity within a package and adjusts their balance accordingly.
     * If the passenger is enrolled in the specified activity, their balance is updated by adding cancellation charges
     * if applicable and they are removed from the activity's passenger list.
     *
     * @param p the package from which the passenger will be removed from the activity
     * @param passanger_name the name of the passenger to be removed
     * @param passanger_number the number of the passenger to be removed
     * @param activity_name the name of the activity from which the passenger will be removed
     * @param activity_code the code of the activity from which the passenger will be removed
     */
    
    public void passanger_optOut(Package p, String passanger_name, int passanger_number, String activity_name, int activity_code) {
        List<Destination> list_d = p.get_itinerary();
        
        Activity act_i = new Activity();
        act_i.set_code(activity_code);

        Passenger curPerson = pack_int.passenger_details(p, passanger_name, passanger_number);

        for(Destination dest_i: list_d) {
            
            if(dest_int.activity_present(act_i, dest_i)) {
                
                List<Activity> list_a = dest_i.get_Activities();
                
                for(Activity list_a_act: list_a) {
                    
                    if(list_a_act.get_code() == activity_code) {
                        
                        passenger_int.adjust_balance("remove", curPerson, list_a_act);

                        List<Passenger> list_p = list_a_act.get_passengers();
                        for(int i = 0; i < list_p.size(); i++) {
                            if((list_p.get(i)).get_name() == passanger_name && list_p.get(i).get_number() == passanger_number) {
                                list_a_act.set_bookings(list_a_act.get_bookings() - 1);
                                list_p.remove(i);
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

}
