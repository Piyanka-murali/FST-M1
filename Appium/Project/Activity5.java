package Appiumproject;

import org.testng.annotations.Test;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void loginSuccessTest() {

		    driver.get("https://training-support.net/webelements");

		    driver.findElement(
		            AppiumBy.androidUIAutomator(
		                    "new UiScrollable(new UiSelector().scrollable(true))" +
		                    ".scrollIntoView(new UiSelector().text(\"Login Form\"))"))
		            .click();

		    driver.findElement(By.id("username"))
		            .sendKeys("admin");

		    driver.findElement(By.id("password"))
		            .sendKeys("password");

		    driver.findElement(By.xpath("//button[text()='Submit']"))
		            .click();

		    String message =
		            driver.findElement(By.id("action-confirmation"))
		                    .getText();

		    Assert.assertTrue(
		            message.contains("valid credentials"));
		}
		

	}

}
