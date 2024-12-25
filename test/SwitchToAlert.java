import org.openqa.selenium.Alert;
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

        // Firstly, click the "Open alert" button by using its ID as locator
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click(); // Click the above button found on the web page

        // Use the Alert class to define a new alert object and theen switch to that alert
        Alert alert = driver.switchTo().alert(); // to switch the driver's focus to the above opened alert box
        alert.accept(); // to press "Ok" on the alert box and close it

        // Quit the driver instance
        driver.quit();
    }
}
