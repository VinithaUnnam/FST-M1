package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println("Title of the page is: " + driver.getTitle());
        String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
        System.out.println("Third header text: " + thirdHeaderText);
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color");
        System.out.println("Color of fifth header: " + fifthHeaderColor);
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("class");
        System.out.println("Class of 'Purple' button: " + purpleButtonClass);
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println("Text of 'Slate' button: " + slateButtonText);
        driver.quit();
    }
}
