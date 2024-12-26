import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// Even the most commonly used components on the web can be tricky to automate
// One of this component is Radio Buttons along with others which are drop-down menus, checkboxes, date pickers and file upload and
public class Radiobuttons {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the radiobutton (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // Quit the driver instance
        driver.quit();
    }
}
