

public abstract class ParentPackage implements PackageInterface {
    public void add_passenger(Package p, String name, int number, String membership, int init_balance) {}

    
    public boolean add_Activity(Package p, String name, int code, String description, String destination, double cost, int capacity) {
        return true;
    }

    
    public void add_Destination(Package p, String name) {}
    
    public void enroll_passanger(Package p, String person_name, int passanger_number, String activity_name, int activity_code) {}
    
    
    public void print_iteneary(Package p) {}
    
    
    public void print_passanger_details(Package p, String name, int number) {}
    
    
    public void print_activity_details(Package p, String name, int code) {}
    
    
    public void print_available_activities(Package p) {}
    
    
    public void print_passanger_list(Package p) {}

    
    
    public void passanger_topup(Package p, String name, int number, double amount) {}
    
    
    public void passanger_optOut(Package p, String passanger_name, int passanger_number, String activity_name, int activity_code) {}
    
    public boolean destination_present(Package p, String dest) {
        return true;
    }

    public Passenger passenger_details(Package p, String name, int number) {
        Passenger person_i = new Passenger();
        return person_i;
    }
}
