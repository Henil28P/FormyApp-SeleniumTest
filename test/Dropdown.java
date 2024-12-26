import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// This test involves automating a dropdown menu functionality test using Selenium WebDriver
public class Dropdown {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the dropdown (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/dropdown");

        // Test to automate selecting an option from a dropdown menu
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton")); // Find the dropdown button element on the web page using its "id"
        dropDownMenu.click(); // To click the dropdown menu button and expose all its options

        // Next, select a random option to test from the list exposed above
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete")); // Find one of the options from the dropdown list of id as "autocomplete"
        autocompleteItem.click(); // Click one of the option of id of "autocomplete" to test dropdown functionality

        // Quit the driver instance
        driver.quit();
    }
}
