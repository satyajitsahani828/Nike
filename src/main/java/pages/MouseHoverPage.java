package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class MouseHoverPage extends WebTestBase {

    @FindBy(xpath = "(//span[text()='shoes'])[1]")
    WebElement shoesMouseHoverBtn;

    public MouseHoverPage() {
        PageFactory.initElements(driver, this);
    }

    public void shoesMouseHoverBtn() {
        Utility.waitUntilElementToBeClickable(shoesMouseHoverBtn);
    }

    public boolean shoesMouseHoverBtnDisplay() {
        return Utility.isDisplayed(shoesMouseHoverBtn);
    }
}
