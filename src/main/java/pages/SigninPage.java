package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class SigninPage extends WebTestBase {

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='button']")
    WebElement signinBtn;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement keepmesignedinCheckBox;

   public SigninPage(){
       PageFactory.initElements(driver,this);
    }

    public void Signin(String email, String password){
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        Utility.waitUntilElementToBeClickable(signinBtn);
    }
}
