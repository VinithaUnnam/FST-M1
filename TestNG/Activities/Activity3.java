package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
@BeforeClass
public void openbrowser() {
	driver=new FirefoxDriver();
	driver.get(" https://training-support.net/webelements/login-form/");
}
@Test
public void logintestcase() {
	driver.findElement(By.id("username")).sendKeys("admin ");
	driver.findElement(By.id("password")).sendKeys("password ");
	driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
	String loginMessage=driver.findElement(By.cssSelector("h1.text-center")).getText();
	Assert.assertEquals("Login Success!", "Login Success!");	
}
@AfterClass
public void closebrowser() {
	driver.close();
}
}
