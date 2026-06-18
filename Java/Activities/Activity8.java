
package com.activity;

import java.util.ArrayList;

public class Activity8 {
    public static void main(String[] args) {

        // 1. Create an ArrayList named myList
        ArrayList<String> myList = new ArrayList<>();

        // 2. Add 5 names
        myList.add("Priya");
        myList.add("Rahul");
        myList.add("Anita");
        myList.add("Karthik");
        myList.add("Meena");

        // 3. Print all names using for loop
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 4. Get 3rd name
        System.out.println("\n3rd name: " + myList.get(2));

        // 5. Check using contains()
        if (myList.contains("Rahul")) {
            System.out.println("Rahul is present");
        } else {
            System.out.println("Rahul is not present");
        }

        // 6. Print size
        System.out.println("\nTotal names: " + myList.size());

        // 7. Remove a name
        myList.remove("Anita");

        System.out.println("After removal, size: " + myList.size());
    }
}
