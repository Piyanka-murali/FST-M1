package com.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1_VerifyTitle {

	@Test
    public void verifyTitle() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://hrm.alchemy.hguy.co/");

        String actualTitle = driver.getTitle();

        System.out.println("Website Title: " + actualTitle);

        Assert.assertEquals(actualTitle, "OrangeHRM");

        driver.quit();
    }
}