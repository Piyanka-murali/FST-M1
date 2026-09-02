package Appiumproject;

public class Activity1 {

	@Test
	public void addTasksTest() {

	    driver.activateApp("com.example.todo");

	    addTask("Complete Activity 1", "high");
	    addTask("Complete Activity 2", "medium");
	    addTask("Complete Activity 3", "low");

	    List<WebElement> tasks =
	            driver.findElements(AppiumBy.id("taskTitle"));

	    Assert.assertEquals(tasks.size(), 3);

	    Assert.assertTrue(
	            tasks.stream()
	                    .anyMatch(t -> t.getText().contains("Complete Activity 1")));

	    Assert.assertTrue(
	            tasks.stream()
	                    .anyMatch(t -> t.getText().contains("Complete Activity 2")));

	    Assert.assertTrue(
	            tasks.stream()
	                    .anyMatch(t -> t.getText().contains("Complete Activity 3")));
	}

	private void addTask(String taskName, String priority) {

	    driver.findElement(AppiumBy.id("addTaskBtn")).click();

	    driver.findElement(AppiumBy.id("taskTitleInput"))
	            .sendKeys(taskName);

	    driver.findElement(AppiumBy.id("priorityDropdown"))
	            .click();

	    driver.findElement(
	            AppiumBy.androidUIAutomator(
	                    "new UiSelector().text(\"" + priority + "\")"))
	            .click();

	    driver.findElement(AppiumBy.id("saveBtn")).click();
	}
}
