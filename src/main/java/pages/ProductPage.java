package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class ProductPage extends WebTestBase {

    @FindBy(xpath = "(//input[@aria-label='Search Products'])[1]")
    WebElement searchProduct;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public  void searchProduct() {
        searchProduct.sendKeys("shoes");
        Utility.waitUntilElementToBeClickable(searchProduct);
    }
}
