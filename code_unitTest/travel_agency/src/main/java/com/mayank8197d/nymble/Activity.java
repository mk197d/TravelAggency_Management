package com.mayank8197d.nymble;

import java.util.ArrayList;
import java.util.List;

/**
 * The Activity class represents an activity that can be booked by passengers.
 * Each activity has a unique code, name, description, destination, cost, capacity, current bookings,
 * and a list of enrolled passengers.
 */
public class Activity {
    private int act_code; // The unique code of the activity.
    private String act_name; // The name of the activity.
    private String act_description; // The description of the activity.
    private String act_destination; // The destination of the activity.
    private double Cost; // The cost of the activity.
    private int capacity; // The maximum capacity of participants for the activity.
    private int bookings; // The number of bookings made for the activity.
    private List<Passenger> enrolled_passengers; // The list of passengers enrolled in the activity.

    /**
     * Constructs an Activity object with default values.
     * Default values: act_code = -1, act_name = "NA", act_destination = "NA",
     * act_description = "NA", Cost = -1, capacity = -1, bookings = 0.
     * The list of enrolled_passengers is initialized as an empty ArrayList.
     */
    public Activity() {
        this.act_code = -1;
        this.act_name = "NA";
        this.act_destination = "NA";
        this.act_description = "NA"; 
        this.Cost = -1;
        this.capacity = -1;
        this.bookings = 0;
        this.enrolled_passengers = new ArrayList<>();
    }

    /**
     * Constructs an Activity object with the given code and name.
     * Default values are set for other attributes.
     * @param code The unique code of the activity.
     * @param name The name of the activity.
     */
    public Activity(int code, String name) {
        this.act_code = code;
        this.act_name = name;
        this.act_destination = "NA";
        this.act_description = "NA"; 
        this.Cost = -1;
        this.capacity = -1;
        this.bookings = 0;
        this.enrolled_passengers = new ArrayList<>();
    }

    /**
     * Constructs an Activity object with the given attributes.
     * @param code The unique code of the activity.
     * @param name The name of the activity.
     * @param desc The description of the activity.
     * @param dest The destination of the activity.
     * @param cost The cost of the activity.
     * @param capacity The maximum capacity of participants for the activity.
     */
    public Activity(int code, String name, String desc, String dest, double cost, int capacity) {
        this.act_code = code;
        this.act_name = name;
        this.act_destination = dest;
        this.act_description = desc; 
        this.Cost = cost;
        this.capacity = capacity;
        this.bookings = 0;
        this.enrolled_passengers = new ArrayList<>();
    }

    /**
     * Retrieves the code of the activity.
     * @return The code of the activity.
     */
    public int get_code() {
        return this.act_code;
    }

    /**
     * Sets the code of the activity.
     * @param code The code to set for the activity.
     */
    public void set_code(int code) {
        this.act_code = code;
    }

    /**
     * Retrieves the name of the activity.
     * @return The name of the activity.
     */
    public String get_name() {
        return this.act_name;
    }

    /**
     * Sets the name of the activity.
     * @param name The name to set for the activity.
     */
    public void set_name(String name) {
        this.act_name = name;
    }

    /**
     * Retrieves the destination of the activity.
     * @return The destination of the activity.
     */
    public String get_destination() {
        return this.act_destination;
    }

    /**
     * Sets the destination of the activity.
     * @param destination The destination to set for the activity.
     */
    public void set_destination(String destination) {
        this.act_destination = destination;
    }

    /**
     * Retrieves the description of the activity.
     * @return The description of the activity.
     */
    public String get_description() {
        return act_description;
    }

    /**
     * Sets the description of the activity.
     * @param description The description to set for the activity.
     */
    public void set_description(String description) {
        this.act_description = description;
    }

    /**
     * Retrieves the cost of the activity.
     * @return The cost of the activity.
     */
    public double get_cost() {
        return this.Cost;
    }

    /**
     * Sets the cost of the activity.
     * @param cost The cost to set for the activity.
     */
    public void set_cost(int cost) {
        this.Cost = cost;
    }

    /**
     * Retrieves the maximum capacity of participants for the activity.
     * @return The maximum capacity of participants for the activity.
     */
    public int get_capacity() {
        return this.capacity;
    }

    /**
     * Sets the maximum capacity of participants for the activity.
     * @param capacity The maximum capacity to set for the activity.
     */
    public void set_capacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Retrieves the number of bookings made for the activity.
     * @return The number of bookings made for the activity.
     */
    public int get_bookings() {
        return this.bookings;
    }

    /**
     * Sets the number of bookings made for the activity.
     * @param bookings The number of bookings to set for the activity.
     */
    public void set_bookings(int bookings) {
        this.bookings = bookings;
    }

    /**
     * Retrieves the list of enrolled passengers for the activity.
     * @return The list of enrolled passengers for the activity.
     */
    public List<Passenger> get_passengers() {
        return this.enrolled_passengers;
    }

    /**
     * Sets the list of enrolled passengers for the activity.
     * @param passengers The list of enrolled passengers to set for the activity.
     */
    public void set_passengers(List<Passenger> passengers) {
        this.enrolled_passengers = passengers;
    }
}

