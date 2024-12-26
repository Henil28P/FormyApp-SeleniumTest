import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the KeyPress (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        // Automate the autocomplete field
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA"); // Send text input to the autocomplete field

        // Add an Explicit wait instead of an implicit wait and Thread.sleep()
        WebDriverWait wait = new WebDriverWait(driver, 10); // Create an object 'wait' using WebDriverWait class and set 10 seconds as max time to wait

        // Find that element (the result that pops up produced by the autocomplete field)
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item"))); // set expected condition based on visibility of the autocomplete field element
        autocompleteResult.click(); // Click the result in the dropdown menu

        // Quit the driver instance
        driver.quit();
    }
}