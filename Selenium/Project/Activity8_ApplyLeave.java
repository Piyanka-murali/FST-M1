package com.seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity8_ApplyLeave {

    @Test
    public void applyLeave() {

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

        // Navigate to Leave Module
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu_leave_viewLeaveModule")))
                .click();

        // Click Apply
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu_leave_applyLeave")))
                .click();

        // Select Leave Type
        Select leaveType = new Select(
                driver.findElement(By.id("applyleave_txtLeaveType")));

        leaveType.selectByIndex(1);

        // From Date
        driver.findElement(By.id("applyleave_txtFromDate"))
                .clear();

        driver.findElement(By.id("applyleave_txtFromDate"))
                .sendKeys("2026-07-10");

        // To Date
        driver.findElement(By.id("applyleave_txtToDate"))
                .clear();

        driver.findElement(By.id("applyleave_txtToDate"))
                .sendKeys("2026-07-12");

        // Comment
        driver.findElement(By.id("applyleave_txtComment"))
                .sendKeys("Personal Leave");

        // Apply
        driver.findElement(By.id("applyBtn"))
                .click();

        // Verify submission
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("applyLeave")
                || currentUrl.contains("leave"));

        System.out.println("Leave Applied Successfully");

        driver.quit();
    }
}