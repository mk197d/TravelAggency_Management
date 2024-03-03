package com.mayank8197d.nymble;
import java.util.List;

/**
 * The EnrollPassenger class implements the PackageInterface and provides methods to enroll passengers
 * into activities within a package.
 */
public class EnrollPassenger extends ParentPackage {
    private final PackageInterface pack_int = new GetPassenger();
    private final DestinationInterface dest_int = new CheckActivity();
    private final PassengerInterface passenger_int = new AdjustBalance();
    private final PassengerInterface check_bal_sufficient = new CheckBalSufficient();

    /**
     * Enrolls a passenger into an activity within the package.
     * @param p The package.
     * @param person_name The name of the passenger to enroll.
     * @param passanger_number The number of the passenger to enroll.
     * @param activity_name The name of the activity to enroll in.
     * @param activity_code The code of the activity to enroll in.
     */
    public void enroll_passanger(Package p, String person_name, int passanger_number, String activity_name, int activity_code) {
        List<Destination> list_d = p.get_itinerary();
        
        Activity act_i = new Activity();
        act_i.set_code(activity_code);

        Passenger curPerson = pack_int.passenger_details(p, person_name, passanger_number);

        for(Destination dest_i: list_d) {
            if(dest_int.activity_present(act_i, dest_i)) {
                List<Activity> list_a = dest_i.get_Activities();
                for(Activity list_a_act: list_a) {
                    if(list_a_act.get_code() == activity_code) {
                        if(check_bal_sufficient.check_balance_sufficient(curPerson, act_i)) {
                            passenger_int.adjust_balance("add", curPerson, list_a_act);
                            List<Passenger> list_p = list_a_act.get_passengers();
                            list_a_act.set_bookings(list_a_act.get_bookings() + 1);
                            list_p.add(curPerson);
                        }
                        return;
                    }
                }
            }
        }
    }
}
