package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//span[text()='Sign In']")
    WebElement signinRegisterBtn;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/nike']")
    WebElement facebookLogo;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignin() {
        signinRegisterBtn.click();
    }

    public void clickOnFacebooklogo() {
        Utility.waitUntilElementToBeClickable(facebookLogo);
        Utility.handleWindow();
    }
}
