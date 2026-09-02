package Appiumproject;

import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null) {
            driver.quit();
        }
    }
}