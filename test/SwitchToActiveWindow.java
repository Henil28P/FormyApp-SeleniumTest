import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

// This test covers the fact that some apps have multiple windows, frames, and alerts that open on a page and it ensures to automate switching to the active window
// Note: Selenium WebDriver assigns each window a unique ID
// The switchTo() method is provided by the WebDriver interface and allows the driver to switch between windows, frames and alerts
// 3 ways to switch windows:
/*
1. driver.switchTo().window("windowName");
2. driver.switchTo().frmae("frameName");
3. driver.switchTo().alert();
*/
public class SwitchToActiveWindow {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the KeyPress (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Quit the driver instance
        driver.quit();
    }
}
