import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// This test involves automating a datepicker functionality in a Selenium WebDriver test
// Click on a date field, it'll open up a datepicker in a calendar format with today's date highlighted and the datepicker closes after selecting a date and the field is populated with the selected date
public class Datepicker {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the datepicker (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/datepicker");

        // Automate the datepicker functionality test
        WebElement dateField = driver.findElement(By.id("datepicker")); // Find the Datepicker field
        dateField.sendKeys("03/01/2025"); // Can automate datepicker by opening up a datepicker and click on a specific field/date or can just send keys directly to the datepicker field
        // Close the Datepicker (just by sending keys to the datepicker field does not close it automatically
        dateField.sendKeys(Keys.RETURN); // Press "Enter" on the field and use Keys class and RETURN presses the "Enter" key

        // Quit the driver instance
        driver.quit();
    }
}
