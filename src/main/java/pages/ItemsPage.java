package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemsPage extends BasePage {
    @FindBy(css="a[href='?add-to-cart=54']")
    private WebElement flyingNinja;
    @FindBy(css="a[href='?add-to-cart=26']")
    private WebElement happyNinjaTShirt;
    @FindBy(css="a[href='?add-to-cart=27']")
    private WebElement happyNinja;
    @FindBy(css="a[href='?add-to-cart=25']")
    private WebElement ninjaSilhouette;
    @FindBy(className = "added_to_cart wc-forward")
    private WebElement viewCart;
    //css="a[href='https://cms.demo.katalon.com/cart']")

//    @FindBy(className ="select2-selection select2-selection--single")
//    private WebElement sortButton;
    List<WebElement> sortButton = driver.findElements(By.className("elect2-selection select2-selection--single"));

    List<WebElement> elements = driver.findElements(By.cssSelector("a"));

    public ItemsPage(WebDriver driver) {
        super(driver);
    }

    public void addRandomItems() {
        elementControl.clickElement(flyingNinja);
        elementControl.clickElement(happyNinjaTShirt);
        elementControl.clickElement(happyNinja);
        elementControl.clickElement(ninjaSilhouette);
        elementControl.clickElement(viewCart);
    }

    public boolean checkMyCart() {
        boolean elementIsDisplayed = elementControl.isDisplayed(flyingNinja);
        if (elementIsDisplayed){
            return true;
        } else {
            return false;
        }
    }

    public WebElement searchLowestPrice() {
        for (WebElement element : sortButton) {
            if (element.getText().equals("Sort by price: low to high")) {
                return (WebElement) sortButton;
            }
            break;
        }
        return null;
    }
}
