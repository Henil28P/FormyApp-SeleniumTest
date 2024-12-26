import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

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

        // Add an implicit wait instead of a Thread.sleep()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicitly wait for 5 seconds to avoid synchronization issue in automated test

        // Find that element (the result that pops up produced by the autocomplete field)
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click(); // Click the result in the dropdown menu

        // Quit the driver instance
        driver.quit();
    }
}