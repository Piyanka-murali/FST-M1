package com.seleniumactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://training-support.net/webelements/login-form/");
		
		System.out.println("print title is:" + driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("priya123");
		
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        

        driver.quit();

		
		

		
		

		

	}

}
