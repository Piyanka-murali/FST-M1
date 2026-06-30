package com.seleniumactivity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        // Initialize driver
        WebDriver driver = new FirefoxDriver();

        // Open website
        driver.get("https://training-support.net/webelements/login-form/");

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Enter username using XPath
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

        // Enter password using XPath
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        // Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Close browser
        driver.quit();
    }
}