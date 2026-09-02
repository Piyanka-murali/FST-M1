package Appiumproject;

import org.testng.annotations.Test;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		public void todoListWebTest() {

		    driver.get("https://training-support.net/webelements");

		    driver.findElement(
		            AppiumBy.androidUIAutomator(
		                    "new UiScrollable(new UiSelector().scrollable(true))" +
		                    ".scrollIntoView(new UiSelector().text(\"To-Do List\"))"))
		            .click();

		    WebElement input =
		            driver.findElement(By.cssSelector("input"));

		    input.sendKeys("Add tasks to list");
		    input.sendKeys(Keys.ENTER);

		    input.sendKeys("Get number of tasks");
		    input.sendKeys(Keys.ENTER);

		    input.sendKeys("Clear the list");
		    input.sendKeys(Keys.ENTER);

		    List<WebElement> items =
		            driver.findElements(By.cssSelector("li"));

		    items.get(2).click();
		    items.get(3).click();
		    items.get(4).click();

		    Assert.assertEquals(items.size(), 5);
		}

	}

}
