package testNG;

import org.apache.poi.ss.usermodel.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
@BeforeClass
public void beforeclass() {
	driver=new FirefoxDriver();
	driver.get("https://training-support.net/webelements/target-practice");
}
@Test
public void title() {
	String title=driver.getTitle();
	Assert.assertEquals("Target Practice", "Target Practice");
}
@Test(groups ="headertest")
public void headertagtexttest() {
	WebElement h3tag=driver.findElement(By.tagName("h3"));
	h3tag.getText();
}
@Test
public void headertextcolortest() {
	WebElement thirdheader=driver.findElement(By.cssSelector("h5.text-3xl"));
	String textcolor=thirdheader.getCssValue("color");
	System.out.println("color of text is :"+ textcolor);
	Assert.assertEquals("rgb(147, 51, 234)", "rgb(147, 51, 234)");	
}
@Test(groups="buttontest")
public void buttontexttest() {
	WebElement button=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[8]"));
	button.getText();
	Assert.assertEquals("emerald", "emerald");
}
@Test
public void buttoncolortest() {
	WebElement color=driver.findElement(By.cssSelector("button.rounded-xl:nth-child(9)"));
	String color1=color.getCssValue("color");
	System.out.println("color of button is :"+color1);
	Assert.assertEquals("rgb(88, 28, 135)", "rgb(88, 28, 135)");
}
@AfterClass
public void closebrowser() {
	driver.close();
}

}
