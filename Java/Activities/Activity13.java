
package com.activity;

import java.util.Scanner;

public class Activity13 {

    public static void registerUser(String ageStr) {
        try {
            // Convert String to int
            int age = Integer.parseInt(ageStr);

            // Check age condition
            if (age < 18) {
                throw new IllegalArgumentException("Users must be at least 18 years old.");
            }

            // If valid
            System.out.println("Registration successful! Welcome aboard.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = scan.nextLine();

        // Call method
        registerUser(ageInput);

        scan.close();
    }
}
