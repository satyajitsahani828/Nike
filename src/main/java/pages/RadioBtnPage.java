package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class RadioBtnPage extends WebTestBase {

    @FindBy(xpath = "//span[text()='Men']")

    WebElement menCheckBoxRadioBtn;

    public RadioBtnPage(){
        PageFactory.initElements(driver,this);
    }

    public void menCheckBoxRadioBtn(){
        Utility.waitUntilElementToBeClickable(menCheckBoxRadioBtn);
    }

    public boolean menCheckBoxRadioBtnDisplay() {
        return Utility.isDisplayed(menCheckBoxRadioBtn);
    }
}
