package KatalonTest;

import implementation.ElementControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ItemsPage;

public class Base {
    public WebDriver driver;
    public ElementControl elementControl;
    public ItemsPage items;

    @BeforeMethod
    public void Initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://cms.demo.katalon.com/");
        elementControl = new ElementControl(driver);
        items = new ItemsPage(driver);
    }

    @AfterMethod
    public void EndTest() {
        driver.quit();
    }
}
