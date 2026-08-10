package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void beforeMethod() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void testCase1() {

        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        Assert.assertEquals(title, "Selenium: Target Practice");
    }
    
    @Test
    public void testCase2() {

        WebElement blackButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//button[contains(@class,'black')]")));

        Assert.assertTrue(blackButton.isDisplayed());

        System.out.println("Button text: " + blackButton.getText());
    }

    @Test(enabled = false)
    public void testCase3() {

        String subHeading = driver.findElement(
                By.className("sub"))
                .getText();

        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testCase4() {

        throw new SkipException("Skipping test case");
    }

    @AfterTest
    public void afterMethod() {

        driver.quit();
    }
}