package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Current Url is :"+ driver.getCurrentUrl());
      WebElement checkbox= driver.findElement(By.id("checkbox"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
        }
      driver.findElement(By.id("checkbox")).click();
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
        }
        driver.quit();
    }
}
