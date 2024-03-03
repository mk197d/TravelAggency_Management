
/**
 * The AdjustBalance class implements the PassengerInterface and provides methods to adjust
 * the balance of a passenger based on certain actions and activities.
 */
public class AdjustBalance extends ParentPassenger {
    /**
     * Adjusts the balance of a specified passenger based on a given action and activity.
     * @param action The action to be performed, either "add" or "remove".
     * @param person The passenger whose balance is to be adjusted.
     * @param activity The activity for which the balance is to be adjusted.
     */
    public void adjust_balance(String action, Passenger person, Activity activity) {
        if(person.get_status().equals("Standard")) {
            if(action.equals("add")) {
                person.set_balance(person.get_balance() - activity.get_cost());
            } else if(action.equals("remove")) {
                person.set_balance(person.get_balance() + activity.get_cost() * (1 - person.cancellation_charges_std));
            }
        } else if(person.get_status().equals("Gold")) {
            if(action.equals("add")) {
                person.set_balance(person.get_balance() - (1 - person.gold_discount) * activity.get_cost());
            } else if(action.equals("remove")) {
                person.set_balance(person.get_balance() + (1 - person.gold_discount) * activity.get_cost() * (1 - person.cancellation_charges_gold));
            }
        }
    }
}
