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

        // Quit the driver instance
        driver.quit();
    }
}
