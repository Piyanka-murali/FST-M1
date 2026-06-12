
package com.activity;

public class Activity7 {

    public static void main(String[] args) {

        // Create object
        MountainBike mb = new MountainBike(5, 20, 10);

        // Display details
        mb.bicycleDesc();

        // Speed operations
        mb.speedUp(10);
        System.out.println("Speed after speeding up: " + mb.currentSpeed);

        mb.applyBrake(5);
        System.out.println("Speed after braking: " + mb.currentSpeed);

        // Update seat height
        mb.setHeight(20);
        System.out.println("Updated seat height: " + mb.seatHeight);
    }
}
