package Appiumproject;

import org.testng.annotations.Test;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void editTaskDeadlineTest() {

		    WebElement firstTask =
		            driver.findElements(AppiumBy.id("taskTitle")).get(0);

		    new TouchAction<>(driver)
		            .longPress(LongPressOptions.longPressOptions()
		                    .withElement(ElementOption.element(firstTask)))
		            .release()
		            .perform();

		    driver.findElement(AppiumBy.id("deadlineField")).click();

		    // Select next Saturday
		    driver.findElement(AppiumBy.accessibilityId("Next Saturday")).click();

		    driver.findElement(AppiumBy.id("saveBtn")).click();

		    String deadline =
		            driver.findElement(AppiumBy.id("deadlineText"))
		                    .getText();

		    Assert.assertFalse(deadline.isEmpty());
		}

	}

}
