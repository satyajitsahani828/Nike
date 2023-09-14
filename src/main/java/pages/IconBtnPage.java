package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class IconBtnPage extends WebTestBase {

    @FindBy(xpath = "//div[@class='icon-chevron  css-304bid']")
    WebElement sortByIconBtn;

    public IconBtnPage(){
        PageFactory.initElements(driver,this);
    }

    public void sortByIconBtn() {
        Utility.waitUntilElementToBeClickable(sortByIconBtn);
    }

 /*   public boolean sortByIconBtnDisplay(){
       return Utility.isDisplayed(sortByIconBtn);
    }*/
}
