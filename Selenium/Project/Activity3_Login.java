package com.seleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3_Login {

	@Test
	public void loginToOrangeHRM() {

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");

	    WebDriver driver = new ChromeDriver(options);

	    driver.manage().window().maximize();

	    driver.get("https://hrm.alchemy.hguy.co/");

	    driver.findElement(By.id("txtUsername"))
	          .sendKeys("orange");

	    driver.findElement(By.id("txtPassword"))
	          .sendKeys("5Nx#I6BK%r3$8vz0ch");

	    driver.findElement(By.id("btnLogin"))
	          .click();

	    Assert.assertTrue(
	        driver.getCurrentUrl().contains("dashboard"));

	    driver.quit();
	}
}