package Appiumproject;

import org.testng.annotations.Test;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		public void completedTasksTest() {

		    List<WebElement> tasks =
		            driver.findElements(AppiumBy.id("taskCheckbox"));

		    tasks.get(0).click();
		    tasks.get(1).click();

		    WebElement thirdTask =
		            driver.findElements(AppiumBy.id("taskTitle")).get(2);

		    new TouchAction<>(driver)
		            .longPress(LongPressOptions.longPressOptions()
		                    .withElement(ElementOption.element(thirdTask)))
		            .release()
		            .perform();

		    WebElement slider =
		            driver.findElement(AppiumBy.id("progressSlider"));

		    int startX = slider.getLocation().getX();
		    int endX = startX + slider.getSize().getWidth() / 2;

		    new PointerInput(PointerInput.Kind.TOUCH, "finger");
		    // move slider to 50%

		    driver.findElement(AppiumBy.id("saveBtn")).click();

		    driver.findElement(AppiumBy.id("optionsMenu")).click();

		    driver.findElement(
		            AppiumBy.androidUIAutomator(
		                    "new UiSelector().text(\"Completed tasks\")"))
		            .click();

		    List<WebElement> completed =
		            driver.findElements(AppiumBy.id("taskTitle"));

		    Assert.assertEquals(completed.size(), 2);
		}

	}

}
