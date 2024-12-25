import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// Drag and Drop can be great for moving or manipulating images (cropping or resizing) on screen and arranging components on the screen (ie. such as moving virtual notecards around in columns)
public class DragAndDrop {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the dragdrop (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        // Quit the driver instance
        driver.quit();
    }
}
