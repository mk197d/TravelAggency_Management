package com.mayank8197d.nymble;
import java.util.ArrayList;
import java.util.List;

/**
 * The Package class represents a travel package containing information about its name, capacity,
 * passengers, and itinerary.
 */
public class Package {
    private String package_name; // The name of the package
    private int package_capacity; // The capacity of the package
    private List<Passenger> package_passengers; // The list of passengers in the package
    private List<Destination> package_itinerary; // The list of destinations in the package

    /**
     * Constructs a new Package object with the specified name and capacity.
     *
     * @param name The name of the package
     * @param capacity The capacity of the package
     */
    public Package(String name, int capacity) {
        this.package_name = name;
        this.package_capacity = capacity;
        this.package_passengers = new ArrayList<>(); // Initialize passengers list
        this.package_itinerary = new ArrayList<>(); // Initialize itinerary list
    }

    /**
     * Retrieves the name of the package.
     *
     * @return The name of the package
     */
    public String get_name() {
        return package_name;
    }

    /**
     * Sets the name of the package.
     *
     * @param name The name of the package
     */
    public void set_name(String name) {
        this.package_name = name;
    }

    /**
     * Retrieves the capacity of the package.
     *
     * @return The capacity of the package
     */
    public int get_capacity() {
        return this.package_capacity;
    }

    /**
     * Sets the capacity of the package.
     *
     * @param capacity The capacity of the package
     */
    public void set_capacity(int capacity) {
        this.package_capacity = capacity;
    }

    /**
     * Retrieves the list of passengers in the package.
     *
     * @return The list of passengers in the package
     */
    public List<Passenger> get_passengers() {
        return this.package_passengers;
    }

    /**
     * Sets the list of passengers in the package.
     *
     * @param passengers The list of passengers in the package
     */
    public void set_passengers(List<Passenger> passengers) {
        this.package_passengers = passengers;
    }

    /**
     * Retrieves the list of destinations in the package's itinerary.
     *
     * @return The list of destinations in the package's itinerary
     */
    public List<Destination> get_itinerary() {
        return this.package_itinerary;
    }

    /**
     * Sets the list of destinations in the package's itinerary.
     *
     * @param itinerary The list of destinations in the package's itinerary
     */
    public void set_itinerary(List<Destination> itinerary) {
        this.package_itinerary = itinerary;
    }
}
