import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

// This test automates the test of successful sign up of a user in the Formy form page
public class Form {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the form (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/form");

        // Automate test for all fields in the sign up form of Formy app
        driver.findElement(By.id("first-name")).sendKeys("Alex");
        driver.findElement(By.id("last-name")).sendKeys("Crisp");
        driver.findElement(By.id("job-title")).sendKeys("Associate Test Engineer");
        driver.findElement(By.id("radio-button-1")).click(); // Click on the 1st radio button for highest level of education as "High School"
        driver.findElement(By.id("checkbox-1")).click(); // Click on the 1st checkbox for selecting Gender as "Male"
        driver.findElement(By.cssSelector("option[value='1']")).click(); // Click the option of '1' for Years of Experience drop-down field
        driver.findElement(By.id("datepicker")).sendKeys("01/04/2025"); // Select the date from the datepicker field
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); // to click out of (close) the datepicker field after selecting the date

        // Submit the form
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click(); // Click on the submit button (it has multiple classes so need to be separated by .

        // Quit the driver instance
        driver.quit();
    }
}
