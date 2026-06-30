package com.seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity5_EditUserInfo {

    @Test
    public void editUserInfo() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        // Login
        driver.get("https://hrm.alchemy.hguy.co/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("txtUsername")))
                .sendKeys("orange");

        driver.findElement(By.id("txtPassword"))
                .sendKeys("5Nx#I6BK%r3$8vz0ch");

        driver.findElement(By.id("btnLogin"))
                .click();

        // My Info
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu_pim_viewMyDetails")))
                .click();

        // Edit button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("btnSave")))
                .click();

        // First Name
        driver.findElement(By.id("personal_txtEmpFirstName"))
                .clear();

        driver.findElement(By.id("personal_txtEmpFirstName"))
                .sendKeys("Priyanka");

        // Last Name
        driver.findElement(By.id("personal_txtEmpLastName"))
                .clear();

        driver.findElement(By.id("personal_txtEmpLastName"))
                .sendKeys("H");

        // Gender Female
        driver.findElement(By.id("personal_optGender_2"))
                .click();

        // Nationality
        driver.findElement(By.id("personal_cmbNation"))
                .sendKeys("Indian");

        // Date of Birth
        driver.findElement(By.id("personal_DOB"))
                .clear();

        driver.findElement(By.id("personal_DOB"))
                .sendKeys("1995-01-10");

        // Save
        driver.findElement(By.id("btnSave"))
                .click();

        System.out.println("User Information Updated Successfully");

        driver.quit();
    }
}