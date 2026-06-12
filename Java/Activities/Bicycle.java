
package com.activity;

// Interfaces
interface BicycleParts {
    int tyres = 2;
    int maxSpeed = 100;
}

interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

// Base Class
public class Bicycle implements BicycleParts, BicycleOperations {

    int gears;
    int currentSpeed;

    // Constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Implement methods
    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    // Description method
    public void bicycleDesc() {
        System.out.println("No. of gears: " + gears);
        System.out.println("Max speed: " + maxSpeed);
    }
}
