package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title is : " + driver.getTitle());
		WebElement textInput = driver.findElement(By.id("textInput"));
		driver.findElement(By.id("textInputButton"));
		if (textInput.isEnabled()) {
			System.out.println("text field is enabled");
		} else {
			System.out.println("Text field is disabled");
		}
		driver.findElement(By.id("textInputButton")).click();
		if (textInput.isEnabled()) {
			System.out.println("text field is enabled");
		} else {
			System.out.println("Text field is disabled");
		}
		driver.quit();
	}
}
