package example;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/simple-form");
    }

    @DataProvider(name = "csvDataProvider")
    public Object[][] readCsv() throws Exception {

        List<Object[]> data = new ArrayList<>();

        BufferedReader br =
                new BufferedReader(
                        new FileReader("src/test/resources/input.csv"));

        String line;

        // Skip header
        br.readLine();

        while ((line = br.readLine()) != null) {

            String[] values = line.split(",");

            data.add(new Object[] {
                    values[0],
                    values[1],
                    values[2],
                    values[3]
            });
        }

        br.close();

        Object[][] result = new Object[data.size()][];

        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }

        return result;
    }

    @Test(dataProvider = "csvDataProvider")
    public void testForm(String fullName,
                         String email,
                         String eventDate,
                         String details) {

        driver.findElement(By.id("full-name")).clear();
        driver.findElement(By.id("full-name"))
                .sendKeys(fullName);

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email"))
                .sendKeys(email);

        driver.findElement(By.name("event-date")).clear();
        driver.findElement(By.name("event-date"))
                .sendKeys(eventDate);

        driver.findElement(By.id("additional-details")).clear();
        driver.findElement(By.id("additional-details"))
                .sendKeys(details);

        driver.findElement(
                By.xpath("//button[text()='Submit']"))
                .click();

        String actualMessage =
                driver.findElement(
                        By.id("action-confirmation"))
                        .getText();

        assertEquals(
                actualMessage,
                "Your event has been scheduled!"
        );

        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}