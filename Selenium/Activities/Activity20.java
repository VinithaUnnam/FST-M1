package selenium;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Activity20 {
	    public static void main(String[] args) throws InterruptedException {
	        // Initialize the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        // Navigate to the webpage
	        driver.get("https://training-support.net/webelements/alerts");
	        
	        // Print the page title
	        System.out.println("Page title: " + driver.getTitle());

	        // Locate and click the button to trigger the prompt alert
	        driver.findElement(By.id("prompt")).click();

	        // Switch to the alert window
	        Alert promptAlert = driver.switchTo().alert();

	        // Retrieve and display the alert's text
	        String alertMessage = promptAlert.getText();
	        System.out.println("Alert message: " + alertMessage);

	        // Enter text into the alert
	        promptAlert.sendKeys("Awesome!");
	        
	        // Wait for 5 seconds
	        Thread.sleep(5000);

	        // Accept the alert (click OK)
	        promptAlert.accept();

	        // Print the result message displayed on the page
	        System.out.println(driver.findElement(By.id("result")).getText());

	        // Close the browser
	        driver.quit();
	    }
	}


