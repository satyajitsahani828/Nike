package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class DropDownPage extends WebTestBase {



    @FindBy(xpath = "//button[@aria-label='Price: Low-High']")

    WebElement lowToHighDropDown;

    public DropDownPage(){
        PageFactory.initElements(driver,this);
    }

    public void lowToHighDropDown() {
        Utility.waitUntilElementToBeClickable(lowToHighDropDown);
    }

    public boolean lowToHighDropDownDisplay(){
        Utility.isDisplayed(lowToHighDropDown);
        return false;
    }
}
