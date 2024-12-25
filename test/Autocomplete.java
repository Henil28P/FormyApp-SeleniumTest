import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the KeyPress (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        // Automate the autocomplete field
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA"); // Send text input to the autocomplete field

        // To avoid NoSuchElementException (timing issue - slow the test down after entering the address
        Thread.sleep(1000); // sleep for 1000 milliseconds (1 second) to wait for the next element to load from dropdown results

        // Find that element (the result that pops up produced by the autocomplete field)
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click(); // Click the result in the dropdown menu

        // Quit the driver instance
        driver.quit();
    }
}