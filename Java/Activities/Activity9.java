
package com.activity;

import java.util.HashSet;

public class Activity9 {
    public static void main(String[] args) {

        // 1. Create a HashSet named hs
        HashSet<String> hs = new HashSet<>();

        // 2. Add 6 objects
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Pineapple");

        // 3. Print size
        System.out.println("Size of HashSet: " + hs.size());

        // 4. Remove an element
        hs.remove("Mango");
        System.out.println("After removing Mango: " + hs);

        // 5. Try removing an element not present
        boolean removed = hs.remove("Cherry");
        System.out.println("Trying to remove Cherry: " + removed);

        // 6. Use contains()
        if (hs.contains("Apple")) {
            System.out.println("Apple is present in the set.");
        } else {
            System.out.println("Apple is not present in the set.");
        }

        // 7. Print updated set
        System.out.println("Updated HashSet: " + hs);
    }
}
