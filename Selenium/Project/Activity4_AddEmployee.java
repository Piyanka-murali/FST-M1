package com.seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4_AddEmployee {

    @Test
    public void addEmployee() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Login
        driver.get("https://hrm.alchemy.hguy.co/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("txtUsername"))).sendKeys("orange");

        driver.findElement(By.id("txtPassword"))
                .sendKeys("5Nx#I6BK%r3$8vz0ch");

        driver.findElement(By.id("btnLogin"))
                .click();

        // Click PIM
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu_pim_viewPimModule")))
                .click();

        // Click Add Employee
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu_pim_addEmployee")))
                .click();

        // Enter Employee Details
        driver.findElement(By.id("firstName"))
                .sendKeys("Priyanka");

        driver.findElement(By.id("lastName"))
                .sendKeys("H");

        // Save
        driver.findElement(By.id("btnSave"))
                .click();

        // Verify employee added
        String firstName = driver.findElement(By.id("personal_txtEmpFirstName"))
                .getAttribute("value");

        Assert.assertEquals(firstName, "Priyanka");

        System.out.println("Employee Added Successfully");

        driver.quit();
    }
}