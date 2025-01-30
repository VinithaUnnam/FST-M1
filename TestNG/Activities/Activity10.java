package testNG;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Correct import
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity10 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form.");
    }

    @DataProvider(name = "Events")
    public Object[][] excelDetails() throws IOException {
        // Load the Excel file
        FileInputStream file = new FileInputStream(new File("C:\\Users\\003ZCE744\\Documents\\events_data.xlsx"));
        
        // Create a Workbook instance to work with the Excel file
        Workbook workbook = new XSSFWorkbook(file);  // Corrected here
        
        // Get the first sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0);

        // Get the number of rows in the sheet
        int rowCount = sheet.getPhysicalNumberOfRows();

        // Create an Object array to hold the data
        Object[][] data = new Object[rowCount - 1][4]; // 4 columns: Full Name, Email, Date, Details

        // Loop through the rows and columns to read the data
        for (int i = 1; i < rowCount; i++) { // start from row 1 (to skip the header)
            Row row = sheet.getRow(i);
            for (int j = 0; j < 4; j++) { // 4 columns
                Cell cell = row.getCell(j);
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            data[i - 1][j] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            if (j == 2) { // If the column is for Date (index 2), handle as a date
                                // Convert the numeric date to a string (format as needed)
                                Date date = cell.getDateCellValue();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                data[i - 1][j] = sdf.format(date); // Store as formatted date string
                            } else {
                                data[i - 1][j] = String.valueOf(cell.getNumericCellValue());
                            }
                            break;
                        default:
                            data[i - 1][j] = "";
                            break;
                    }
                } else {
                    data[i - 1][j] = "";
                }
            }
        }

        // Close the workbook
        workbook.close();
        file.close();

        return data;
    }

    @Test(dataProvider = "Events")
    public void simpleFormPage(String fullName, String email, String date, String details) {
        driver.findElement(By.cssSelector("#full-name")).sendKeys("fullName");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("event-date")).sendKeys(date);
        driver.findElement(By.id("additional-details")).sendKeys(details);
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/div[3]/form/button")).click();
        
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Reporter.log("Alert text is: " + alertText);
        alert.accept();  // Close the alert after capturing the text
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}
