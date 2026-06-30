package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity2_HeaderImage {

    @Test
    public void getHeaderImageURL() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://hrm.alchemy.hguy.co/");

        WebElement logo =
                driver.findElement(By.xpath("//img"));

        String imageURL = logo.getAttribute("src");

        System.out.println("Header Image URL: " + imageURL);

        driver.quit();
    }
}