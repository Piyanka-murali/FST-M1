package example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity11 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net");
    }

    @Test(dataProvider = "excelDataProvider")
    public void login(String username, String password) {

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @AfterClass
    public void afterClass() {

        if (driver != null) {
            driver.quit();
        }
    }

    public static List<List<String>> readExcel(String fileName) throws IOException {

        List<List<String>> data = new ArrayList<>();

        FileInputStream fis = new FileInputStream(fileName);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {

            List<String> rowData = new ArrayList<>();

            for (Cell cell : row) {
                rowData.add(cell.toString());
            }

            data.add(rowData);
        }

        workbook.close();
        fis.close();

        return data;
    }

    @DataProvider(name = "excelDataProvider")
    public static Object[][] inputData() throws IOException {

        List<List<String>> inputData =
                readExcel("src/test/resources/input.xlsx");

        Object[][] data =
                new Object[inputData.size()][2];

        for (int i = 0; i < inputData.size(); i++) {
            data[i] = inputData.get(i).toArray();
        }

        return data;
    }
}