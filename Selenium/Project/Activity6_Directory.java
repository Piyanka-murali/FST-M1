package com.seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6_Directory {

    @Test
    public void verifyDirectoryMenu() {

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

        // Verify Directory Menu
        WebElement directoryMenu =
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.id("menu_directory_viewDirectory")));

        Assert.assertTrue(directoryMenu.isDisplayed(),
                "Directory menu is not visible");

        Assert.assertTrue(directoryMenu.isEnabled(),
                "Directory menu is not clickable");

        directoryMenu.click();

        // Verify heading
        String pageHeading =
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h1")))
                        .getText();

        Assert.assertEquals(pageHeading, "Search Directory");

        System.out.println("Directory menu is visible and clickable.");

        driver.quit();
    }
}