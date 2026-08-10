package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        // Create Firefox driver instance
        driver = new FirefoxDriver();

        // Open website
        driver.get("https://training-support.net");
    }

    @Test
    public void verifyTitleAndNavigate() {

        // Get and print homepage title
        String homeTitle = driver.getTitle();
        System.out.println("Home Page Title: " + homeTitle);

        // Verify homepage title
        Assert.assertEquals(homeTitle, "Training Support");

        // Click About Us
        driver.findElement(By.linkText("About Us")).click();

        // Get and print About page title
        String aboutTitle = driver.getTitle();
        System.out.println("About Page Title: " + aboutTitle);

        // Verify About page title
        //Assert.assertEquals(aboutTitle, "About Training Support");
        Assert.assertEquals(aboutTitle, "Training Support");
    }

    @AfterClass
    public void tearDown() {

        // Close browser
        driver.close();
    }
}