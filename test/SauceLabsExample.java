import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SauceLabsExample {

    public static final String USERNAME = "YOUR_USERNAME"; // Can be found from "User Settings" --> "My Account" --> under "User Information" section on SauceLabs account after logging in
    public static final String ACCESS_KEY = "YOUR_ACCESS_KEY"; // Can be found from "User Settings" --> "My Account" --> under "Access Key" section on SauceLabs account after logging in
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    // The above link can be verified from "User Settings" --> "My Account" --> under "Driver Creation" section as "Ondemand URL" on SauceLabs account after logging in

    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "macOS 10.12");
        caps.setCapability("version", "66.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("http://formy-project.herokuapp.com/");
    }
}
