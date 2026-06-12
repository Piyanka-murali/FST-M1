package com.activity;


//Abstract class
abstract class Book {
 String title;

 // Abstract method
 abstract void setTitle(String s);

 // Concrete method
 String getTitle() {
     return title;
 }
}

//Child class
class MyBook extends Book {

 // Implement abstract method
 @Override
 public void setTitle(String s) {
     title = s;
 }
}

//Main class
public class Activity5 {

 public static void main(String[] args) {

     // Create object of MyBook
     MyBook newNovel = new MyBook();

     String title = "Learning Java";

     // Set title
     newNovel.setTitle(title);

     // Print result
     System.out.println("The title is: " + newNovel.getTitle());
 }
}
