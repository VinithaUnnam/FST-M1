import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

    protected WebDriver driver;

    public Baseclass() {
        // Set path to the WebDriver executable if required
        driver = new FirefoxDriver();
    }

    // Add a method to close the browser after the test
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
