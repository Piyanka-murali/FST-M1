package com.activity;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission,int make ) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		int tyres = 4;
		int doors = 4;
	}
	
public void displayCharacteristics() {
        System.out.println("displayCar Characteristics:");
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
}
	
	public void accelarate() { 
		System.out.println("Car is moving forward");
	}
	public void brake(){ 
		System.out.println("Car has stopped");
		
	}
}
