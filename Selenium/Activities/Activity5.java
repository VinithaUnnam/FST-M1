package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        if (checkbox.isDisplayed()) {
            System.out.println("Element is visible");
        } else {
            System.out.println("Element is not visible");
        }
        checkbox.click();
        if (checkbox.isDisplayed()) {
            System.out.println("Element is visible");
        } else {
            System.out.println("Element is not visible");
        }
        driver.quit();
    }
}
