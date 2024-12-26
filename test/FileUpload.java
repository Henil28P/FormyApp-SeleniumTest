import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// This test involves automating testing the uploading a file to web page functionality and resetting to clear the file uploaded
// A nice thing about uploading files with Selenium is that we can simply send keys to the upload field instead of going through and choosing the file manually
public class FileUpload {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the fileupload (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/fileupload");

        // Quit the driver instance
        driver.quit();
    }
}
