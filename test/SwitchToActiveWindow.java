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

        // Navigate WebDriver to the switch-window (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Open the new tab by clicking the 'Open new tab' button
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // Get both the handles and switch to the handle for the tab that has opened by clicking the above button
        String originalHandle = driver.getWindowHandle(); // get the original window handle (get the handle/ID of the window to switch to

        // Loop to iterate through the 2 handles and switch back to the tab that was opened originally
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1); // switch to the 2nd tab that's opened
        }

        // After switching to the newly opened tab (handle1), switch back to the 1st tab (original window where the test started)
        driver.switchTo().window(originalHandle);

        // Quit the driver instance
        driver.quit();
    }
}
