import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

// Drag and Drop can be great for moving or manipulating images (cropping or resizing) on screen
// and arranging components on the screen (ie. such as moving virtual notecards around in columns)
public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the dragdrop (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        // Find elements by their suitable locators on web page to drag (source element - image), and drop (destination element - box)
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        // Define a new instance of the Actions class
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform(); // takes 2 parameters (source, target)

        // Slow the test down by 2 seconds to clearly see and test drag and drop action by driver
        Thread.sleep(2000);

        // Quit the driver instance
        driver.quit();
    }
}
