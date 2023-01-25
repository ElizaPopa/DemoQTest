package implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserManager {

    public static ChromeDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static SafariDriver getSafariDriver() {
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    }
}
