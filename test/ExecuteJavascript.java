import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// Executing Javascript commands in WebDriver tests
// Selenium supports the JavascriptExecutor
// JavascriptExecutor Methods to run JS on the selected window or current page:
/*
1. executeAsyncScript - this executes an asynchronous piece of JS and
scripts executed with this method must explicitly signal they're finished by envoking the provided callback
2. executeScript - executes JS as the body of an anonymous function
*/
// Uses of JavascriptExecutor:
/*
1. When WebDriver fails to click on any element
2. To trigger actions on a page (ie. by generating alerts)
3. To perform movement on a page (eg. scrolling and zooming)
*/
public class ExecuteJavascript {

    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the modal (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/modal");

        // Quit the driver instance
        driver.quit();
    }
}