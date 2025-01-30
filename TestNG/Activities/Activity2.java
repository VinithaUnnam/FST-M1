package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@BeforeTest
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/target-practice/");
	}

	@Test(priority = 0)
	public void test1() {
		String title = driver.getTitle();
		Assert.assertEquals("title", "TrainingSupport","expected and actual result didnot match");
	}

	@Test(priority = 1)
	public void test2() {
		WebElement blackButton = driver.findElement(By.cssSelector("button.rounded-xl:nth-child(12)"));
		Assert.assertFalse(blackButton.isDisplayed(), "Black button should not be dispalyed.");
		Assert.assertEquals(blackButton.getText(), "red", "button colour is black not red."); 
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("test case is skipped");
	}

	@Test(priority=2)
	public void test4() {
		throw new SkipException("test case should skip");
	}

	@AfterClass
	public void afterclass() {
		driver.close();
	}
}
