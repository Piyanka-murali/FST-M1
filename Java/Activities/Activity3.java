package com.activity;

public class Activity3 {
		
    public static void main(String[] args) {
    

    	 String device = "THERMOSTAT";
    	        int value = 45;

    	        if (device == null) {
    	            System.out.println("Error: No device detected.");
    	        } 
    	        else if (device.equals("THERMOSTAT")) {

    	            if (value >= 40) {
    	                System.out.println("[Thermostat] Warning: Temperature high.");
    	            } else {
    	                System.out.println("[Thermostat] Temperature is set to " + value);
    	            }

    	        } 
    	        else if (device.equals("LIGHT")) {
    	            System.out.println("[Light] Adjusting brightness to " + value + "%.");
    	        } 
    	        else {
    	            System.out.println("Unknown device");
    	        }

    	
    	
    }
    
	}