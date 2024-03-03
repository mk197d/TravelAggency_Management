

import java.util.List;

/**
 * The PrintActivityDetails class implements the PackageInterface and provides methods to print details of
 * activities within a package.
 */
public class PrintActivityDetails extends ParentPackage {
    private final DestinationInterface dest_int = new CheckActivity();
    private final ActivityInterface act_int = new PrintActivity();

    /**
     * Prints details of a specific activity within the package.
     * @param p The package containing the activity.
     * @param name The name of the activity.
     * @param code The code of the activity.
     */
    public void print_activity_details(Package p, String name, int code) {
        List<Destination> list_d = p.get_itinerary();
        Activity act_check = new Activity(code, name);
        
        for(Destination dest_i: list_d){
            if(dest_int.activity_present(act_check, dest_i)) {
                List<Activity> list_a = dest_i.get_Activities();

                for(Activity act_i: list_a) {
                    if(act_i.get_code() == code) {
                        act_int.print_details(act_i);
                    }
                }
            }
        }
    }
}
