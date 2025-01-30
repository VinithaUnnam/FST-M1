package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void beforeclass() {
        // Initialize the WebDriver and navigate to the webpage
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
    }

    @BeforeMethod
    public void beforemethod() {
        // Ensure switching to the default content (useful if switching between iframes)
        driver.switchTo().defaultContent();
    }

    @Test(priority = 1)
    public void simpleAlertTestCase() {
        // Trigger the simple alert
        driver.findElement(By.id("simple")).click();
        Reporter.log("You've just triggered a simple alert!");

        // Get the alert text
        Alert alert = driver.switchTo().alert();
        String alerttext = alert.getText();
        System.out.println("Text of alert: " + alerttext);
        Reporter.log("Got the alert text: " + alerttext);

        // Assert that the alert text matches the expected text
        Assert.assertEquals(alerttext, "You've just triggered a simple alert!");

        // Accept the alert
        alert.accept();
        Reporter.log("Alert has been accepted.");
        Reporter.log("Testcase1 has ended.");
    }

    @Test(priority = 2)
    public void confirmAlertTestCase() {
        // Trigger the confirm alert
        driver.findElement(By.id("confirmation")).click();
        Reporter.log("You've just triggered a confirmation alert!");

        Alert alert = driver.switchTo().alert();
        Reporter.log("Switched to alert.");

        // Get the alert text
        String alerttext = alert.getText();
        System.out.println("Text of alert: " + alerttext);
        Reporter.log("Text of alert is: " + alerttext);

        // Assert that the alert text matches the expected text
        Assert.assertEquals(alerttext, "You've just triggered a confirmation alert!");

        // Accept the alert
        alert.accept();
        Reporter.log("Alert has been accepted.");
        Reporter.log("Testcase2 has ended.");
    }

    @Test(priority = 3)
    public void promptAlertTestCase() {
        // Trigger the prompt alert
        driver.findElement(By.id("prompt")).click();
        Reporter.log("You have triggered a prompt button: 'I'm a Prompt! Type something into me!'");

        Alert alert = driver.switchTo().alert();
        
        // Send text to the prompt and get the alert text
        alert.sendKeys("Test input for prompt");
        Reporter.log("Provided the input for prompt.");

        String alerttext = alert.getText();
        System.out.println("Text of alert: " + alerttext);
        Reporter.log("Text of alert is: " + alerttext);

        // Assert that the alert text matches the expected text
        Assert.assertEquals(alerttext, "I'm a Prompt! Type something into me!");

        // Log the message using Reporter
        Reporter.log("Alert text is success: " + alerttext);

        // Accept the alert
        alert.accept();
        Reporter.log("Alert has been accepted.");
        Reporter.log("Testcase3 has ended.");
    }

    @AfterClass
    public void closebrowser() {
        // Close the browser after all tests have finished
        driver.quit();
    }
}
