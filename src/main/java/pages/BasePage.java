package pages;

import implementation.ElementControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    final WebDriver driver;
    final ElementControl elementControl;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementControl = new ElementControl(driver);
        PageFactory.initElements(driver, this);
    }
}