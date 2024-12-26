import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// This test involves automating a dropdown menu functionality test using Selenium WebDriver
public class Dropdown {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the dropdown (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/dropdown");

        // Quit the driver instance
        driver.quit();
    }
}
