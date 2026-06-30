package com.seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity7_Qualifications {

    @Test
    public void addWorkExperience() {

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

        // Qualifications
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Qualifications")))
                .click();

        // Add Work Experience
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("addWorkExperience")))
                .click();

        // Company Name
        driver.findElement(By.id("experience_employer"))
                .sendKeys("ABC Technologies");

        // Job Title
        driver.findElement(By.id("experience_jobtitle"))
                .sendKeys("Test Engineer");

        // From Date
        driver.findElement(By.id("experience_from_date"))
                .sendKeys("2020-01-01");

        // To Date
        driver.findElement(By.id("experience_to_date"))
                .sendKeys("2024-12-31");

        // Comments
        driver.findElement(By.id("experience_comments"))
                .sendKeys("Automation Testing Experience");

        // Save
        driver.findElement(By.id("btnWorkExpSave"))
                .click();

        System.out.println("Work Experience Added Successfully");

        driver.quit();
    }
}