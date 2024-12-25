import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

// This test ensures automating an alert, switching to alert and closing it - all in the weeb page
public class SwitchToAlert {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the switch-window (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Quit the driver instance
        driver.quit();
    }
}
