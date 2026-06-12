
package com.activity;

import java.util.ArrayList;
import java.util.Date;

public class Plane {

    private ArrayList<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Add passengers
    public void onboard(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
        } else {
            System.out.println("Plane is full!");
        }
    }

    // Take off
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    // Land
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // Getters
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}
