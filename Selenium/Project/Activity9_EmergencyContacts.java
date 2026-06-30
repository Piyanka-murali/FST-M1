package com.seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity9_EmergencyContacts {

    @Test
    public void retrieveEmergencyContacts() {

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

        // Emergency Contacts
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Emergency Contacts")))
                .click();

        // Get all rows from table
        List<WebElement> rows = driver.findElements(
                By.xpath("//table[@id='emgcontact_list']/tbody/tr"));

        System.out.println("Emergency Contacts:");

        for (WebElement row : rows) {

            System.out.println(row.getText());
            System.out.println("--------------------------------");
        }

        driver.quit();
    }
}