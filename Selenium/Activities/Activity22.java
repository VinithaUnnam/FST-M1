package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://training-support.net/webelements/popups");

        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the launcher button and click it
        driver.findElement(By.id("launcher")).click();

        // Wait for the modal to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        // Find the input fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");

        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Wait for the success message to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-center")));

        // Print the success message
        String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
    }
}
