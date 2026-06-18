
package com.activity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity12 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scan = new Scanner(System.in);

        // Create ArrayList object
        ArrayList<Integer> list = new ArrayList<>();

        // Create Random object
        Random indexGen = new Random();

        // Accept multiple integer inputs
        System.out.println("Enter integers (enter a non-integer to stop):");

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        // Check if list is empty
        if (list.size() == 0) {
            System.out.println("No valid integers entered.");
        } else {
            int randomIndex = indexGen.nextInt(list.size());
            System.out.println("Random index: " + randomIndex);
            System.out.println("Value at index: " + list.get(randomIndex));
        }

        scan.close();
    }
}
