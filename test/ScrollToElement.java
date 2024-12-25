import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

// This test class automates the process of scrolling to the desired element to find it below the initial visibility before entering input
public class ScrollToElement {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the KeyPress (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/scroll");

        // Automate finding the 'name' field by ID on the web page
        WebElement name = driver.findElement(By.id("name"));
        // To move to the above element using Actions class
        Actions actions = new Actions(driver); // Define new object of the Actions class
        actions.moveToElement(name); // to make the element in the view
        name.sendKeys("Henil Patel"); // Send keys to the element once it's in the view

        // Automate the 'date' field
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2025");

        // Quit the driver instance
        driver.quit();
    }
}
