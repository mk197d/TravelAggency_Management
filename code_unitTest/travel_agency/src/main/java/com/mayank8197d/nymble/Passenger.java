package com.mayank8197d.nymble;

/**
 * The Passenger class represents a passenger with their name, number, membership status, and balance.
 * It also includes constants for cancellation charges and discounts.
 */
public class Passenger {
    public final double cancellation_charges_std = 0.7; // Standard cancellation charges.
    public final double cancellation_charges_gold = 0.5; // Cancellation charges for gold members.
    public final double gold_discount = 0.1; // Discount for gold members.

    private String passenger_name; // The name of the passenger.
    private int passenger_number; // The number of the passenger.
    private String membership_status; // The membership status of the passenger.
    private double balance; // The balance of the passenger.

    /**
     * Constructs a Passenger object with default values.
     * Default values: passenger_name = "NA", passenger_number = -1,
     * membership_status = "NA", balance = 0.
     */
    public Passenger() {
        this.passenger_name = "NA";
        this.passenger_number = -1;
        this.membership_status = "NA";
        this.balance = 0;
    }

    /**
     * Constructs a Passenger object with the given attributes.
     * @param name The name of the passenger.
     * @param number The number of the passenger.
     * @param membership The membership status of the passenger.
     * @param init_balance The initial balance of the passenger.
     */
    public Passenger(String name, int number, String membership, double init_balance) {
        this.passenger_name = name;
        this.passenger_number = number;
        this.membership_status = membership;
        this.balance = init_balance;
    }

    /**
     * Retrieves the name of the passenger.
     * @return The name of the passenger.
     */
    public String get_name() {
        return passenger_name;
    }

    /**
     * Sets the name of the passenger.
     * @param name The name to set for the passenger.
     */
    public void set_name(String name) {
        this.passenger_name = name;
    }

    /**
     * Retrieves the number of the passenger.
     * @return The number of the passenger.
     */
    public int get_number() {
        return passenger_number;
    }

    /**
     * Sets the number of the passenger.
     * @param number The number to set for the passenger.
     */
    public void set_number(int number) {
        this.passenger_number = number;
    }

    /**
     * Retrieves the membership status of the passenger.
     * @return The membership status of the passenger.
     */
    public String get_status() {
        return this.membership_status;
    }

    /**
     * Sets the membership status of the passenger.
     * @param status The membership status to set for the passenger.
     */
    public void set_status(String status) {
        this.membership_status = status;
    }

    /**
     * Retrieves the balance of the passenger.
     * @return The balance of the passenger.
     */
    public double get_balance() {
        return this.balance;
    }

    /**
     * Sets the balance of the passenger.
     * @param balance The balance to set for the passenger.
     */
    public void set_balance(double balance) {
        this.balance = balance;
    }
}
