import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the KeyPress (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/keypress");

        // Automate the 'name' field
        WebElement name = driver.findElement(By.id("name"));
        name.click(); // Make the field active or selected (use mouse input to click on the field before entering the name)
        name.sendKeys("Henil Patel"); // Automate entering a sample name in the name field

        // Automate the "Button" click to submit the form
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        // Quit the driver instance
        driver.quit();
    }
}
