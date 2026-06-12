package com.activity;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
      

        // Initialize array in random order
        int[] arr = {8, 3, 5, 2, 9, 1};

        // Display array before sorting
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        // Insertion Sort Logic
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // current element
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }

        // Display array after sorting
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }


	}
