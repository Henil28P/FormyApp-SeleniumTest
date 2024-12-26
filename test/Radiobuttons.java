import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        // 1. Find the 1st radio button using by normal id method
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click(); // Click on the above 1st radio button found

        // 2. Find the 2nd radio button by attribute method (ie. input[attribute='value'])
        WebElement radioButton2 = driver.findElement(By.id("input[value='option2']"));
        radioButton2.click(); // Click on the above 2nd radio button found

        // 3. Find the 3rd radio button by XPath method (right-click on radio button element and
        // click "Inspect" from menu and again right-click on its code and --> "Copy" --> "Copy XPath"
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div[3]/input")); // This XPath shows is the path of all the tag names used to get to that element "radio-button-3"
        radioButton3.click(); // Click on the above 1st radio button found

        // Navigate WebDriver to the radiobutton (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // Quit the driver instance
        driver.quit();
    }
}
