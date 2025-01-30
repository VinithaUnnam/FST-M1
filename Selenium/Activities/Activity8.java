package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/mouse-events");
        
        System.out.println("Title of page is: " + driver.getTitle());
        
        // Create an Actions object
        Actions builder = new Actions(driver);

        // Locate the elements for mouse events
        WebElement cargolock = driver.findElement(By.id("stage"));
        WebElement cargotoml = driver.findElement(By.xpath("//div[@class='toggle']"));
        WebElement src = driver.findElement(By.xpath("//div[@id='dragBox']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='dropBox']"));
        
        // Perform actions on the elements
        builder.click(cargolock)
               .pause(1000)
               .moveToElement(cargotoml)
               .pause(5000)
               .click(cargotoml)
               .build().perform();
        
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);

        // Double-click on the src element, pause, then right-click on the target
        builder.doubleClick(src)
               .pause(3000)
               .contextClick(target)
               .pause(3000)
               .build().perform();
        
        // Perform click on the menu item
        builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]")))
               .pause(5000)
               .build().perform();

        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);

        // Quit the driver
        driver.quit();
    }
}
