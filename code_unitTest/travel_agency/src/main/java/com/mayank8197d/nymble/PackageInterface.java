package com.mayank8197d.nymble;
/**
 * The PackageInterface interface extends the TravelPackage interface and provides methods
 * to manage packages including adding passengers, activities, destinations, enrolling passengers
 * in activities, and printing itinerary details.
 */
public interface PackageInterface extends TravelPackage {

    /**
     * Adds a new passenger to the package with the specified details.
     * @param p The package to which the passenger will be added.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     * @param membership The membership status of the passenger.
     * @param init_balance The initial balance of the passenger.
     */
    public void add_passenger(Package p, String name, int number, String membership, int init_balance);

    /**
     * Adds a new activity to the package with the specified details.
     * @param p The package to which the activity will be added.
     * @param name The name of the activity.
     * @param code The code of the activity.
     * @param description The description of the activity.
     * @param destination The destination of the activity.
     * @param cost The cost of the activity.
     * @param capacity The capacity of the activity.
     * @return true if activity succesfully added else false
     */
    public boolean add_Activity(Package p, String name, int code, String description, String destination, double cost, int capacity);

    /**
     * Adds a new destination to the package with the specified name.
     * @param p The package to which the destination will be added.
     * @param name The name of the destination.
     */
    public void add_Destination(Package p, String name);
    
    /**
     * Enrolls a passenger in the specified activity within the package.
     * @param p The package in which the enrollment will occur.
     * @param person_name The name of the passenger to enroll.
     * @param passenger_number The number of the passenger to enroll.
     * @param activity_name The name of the activity to enroll in.
     * @param activity_code The code of the activity to enroll in.
     */
    public void enroll_passanger(Package p, String person_name, int passenger_number, String activity_name, int activity_code);
    
    /**
     * Prints the itinerary of the package, including destinations and activities.
     * @param p The package whose itinerary will be printed.
     */
    public void print_iteneary(Package p);
    
    /**
     * Prints details of a specific passenger within the package.
     * @param p The package containing the passenger.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     */
    public void print_passanger_details(Package p, String name, int number);
    
    /**
     * Prints details of a specific activity within the package.
     * @param p The package containing the activity.
     * @param name The name of the activity.
     * @param code The code of the activity.
     */
    public void print_activity_details(Package p, String name, int code);
    
    /**
     * Prints the available activities within the package.
     * @param p The package containing the activities.
     */
    public void print_available_activities(Package p);
    
    /**
     * Prints the list of passengers within the package.
     * @param p The package containing the passengers.
     */
    public void print_passanger_list(Package p);
    
    /**
     * Adds funds to the balance of a specified passenger within the package.
     * @param p The package containing the passenger.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     * @param amount The amount to add to the passenger's balance.
     */
    public void passanger_topup(Package p, String name, int number, double amount);
    
    /**
     * Removes a passenger from an activity within the package.
     * @param p The package containing the passenger and activity.
     * @param passanger_name The name of the passenger to opt out.
     * @param passanger_number The number of the passenger to opt out.
     * @param activity_name The name of the activity to opt out from.
     * @param activity_code The code of the activity to opt out from.
     */
    public void passanger_optOut(Package p, String passanger_name, int passanger_number, String activity_name, int activity_code);
    
    /**
     * Checks if a specified destination is present within the package.
     * @param p The package to check.
     * @param dest The name of the destination to check.
     * @return True if the destination is present, otherwise false.
     */
    public boolean destination_present(Package p, String dest); 
    
    /**
     * Retrieves details of a specific passenger within the package.
     * @param p The package containing the passenger.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     * @return The Passenger object with the specified name and number.
     */
    public Passenger passenger_details(Package p, String name, int number);
}
