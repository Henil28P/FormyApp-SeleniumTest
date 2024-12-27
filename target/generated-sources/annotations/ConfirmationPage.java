import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
    // Confirm that the submission of form was successful by waiting for the success banner (green) to appear
    public static void waitForAlertBanner(WebDriver driver) {
        // 1. Add an explicit wait to wait for the Thanks page to appear and can choose the alert banner element to wait for upon submission
        WebDriverWait wait = new WebDriverWait(driver, 10); // Adding wait here is necessary because we're switching pages in the Formy app and it'll take some time for the new page to load
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert")))); // wait for 10 seconds for the 'alert' class to be visible
    }

    // Next, add an assertion using JUnit assertion framework for Java projects - assertions are used in test to confirm values and behaviours
    // A suitable assertion here would be to test the text displayed is equal to the expected text
    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText(); // Get the text from the 'alert' web element on page which will be the actual text that we'll get from the text
    }
}
