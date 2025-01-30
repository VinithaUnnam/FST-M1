package testNG;

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
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");  // Open the URL
    }

    @Test(priority = 1)
    public void test1() {
        driver.get("https://training-support.net");
        System.out.println("Title of page is: " + driver.getTitle());
    }

    @Test(priority = 0)
    public void test2() {
        Assert.assertEquals(driver.getTitle(), "Training Support");
        driver.findElement(By.linkText("About Us")).click();    
    }

    @AfterClass
    public void close() {
        driver.close();  // Close the browser window
    }
}
