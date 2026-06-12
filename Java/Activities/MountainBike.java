
package com.activity;

// Derived Class
public class MountainBike extends Bicycle {

    int seatHeight;

    // Constructor
    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    // Set seat height
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Override method
    @Override
    public void bicycleDesc() {
        super.bicycleDesc();
        System.out.println("Seat height: " + seatHeight);
    }
}
