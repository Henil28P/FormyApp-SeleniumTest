import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

// This test automates the test of successful sign up of a user in the Formy form page
public class Form {
    public static void main(String[] args) {

        // Set the location for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate WebDriver to the form (web page to be tested)
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        // Now define the assertion
        Assert.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        // Quit the driver instance
        driver.quit();
    }

}
