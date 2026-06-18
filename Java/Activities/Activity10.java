
package com.activity;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {
    public static void main(String[] args) {

        // 1. Create a Map named colours (Integer keys, String values)
        Map<Integer, String> colours = new HashMap<>();

        // 2. Add 5 colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Colours Map: " + colours);

        // 3. Remove one colour
        colours.remove(4); // removes Yellow
        System.out.println("After removing key 4: " + colours);

        // 4. Check if "Green" exists
        if (colours.containsValue("Green")) {
            System.out.println("Green is present in the map.");
        } else {
            System.out.println("Green is not present in the map.");
        }

        // 5. Print size of the Map
        System.out.println("Size of the map: " + colours.size());
    }
}
