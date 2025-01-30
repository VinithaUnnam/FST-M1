package selenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import java.time.Duration;

	public class Activity21 {
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        // Create the Wait object
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://training-support.net/webelements/tabs");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());
	        // Print the handle of the parent window
	        System.out.println("Current tab: " + driver.getWindowHandle());

	        // Find the button to open a new tab and click it
	        WebElement openTabButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open A New Tab']")));
	        openTabButton.click();

	        // Wait for the second tab to open
	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	        // Print all window handles
	        System.out.println("Currently open windows: " + driver.getWindowHandles());

	        // Switch focus to the latest tab (new tab)
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }

	        // Wait for the new page to load and the 'Another One' button to be clickable
	        WebElement anotherOneButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
	        // Print the handle of the current tab
	        System.out.println("Current tab: " + driver.getWindowHandle());
	        // Print the title and heading of the new page
	        System.out.println("New Page title: " + driver.getTitle());
	        System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());

	        // Find and click the button on the new page to open another tab
	        anotherOneButton.click();

	        // Wait for the third tab to open
	        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

	        // Switch focus to the new tab
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


