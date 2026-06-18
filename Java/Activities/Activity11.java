
package com.activity;

interface Addable {
    int add(int num1, int num2);
}

public class Activity11 {
    public static void main(String[] args) {

        // Lambda expression without body (single expression)
        Addable ad1 = (num1, num2) -> num1 + num2;

        // Lambda expression with body
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };

        // Testing both implementations
        System.out.println("Result using ad1: " + ad1.add(10, 20));
        System.out.println("Result using ad2: " + ad2.add(30, 40));
    }
}
