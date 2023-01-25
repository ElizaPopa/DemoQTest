package pages;

import implementation.ElementControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BasePage {
    final WebDriver driver;
    final ElementControl elementControl;
    public BasePage(WebDriver driver) {
        this.driver = driver;
//        this.jsUtils = new JavascriptUtils(driver);
        elementControl = new ElementControl(driver);
   //     this.logger = Logger.getLogger(this.getClass().getName());
        PageFactory.initElements(driver, this);
    }
//    public String getCurrentUrl(){
//        return driver.navigate().to("https://cms.demo.katalon.com/");
//
//    }

}