package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SigninPage;
import testbase.WebTestBase;

public class SignInTest extends WebTestBase {

    public HomePage homePage;

    public SigninPage signinPage;

    SignInTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        signinPage = new SigninPage();
    }

    @Test(description = "verify ValidEmailandPassword")
    public void verifySigninWithValidEmailAndValidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignin();
        signinPage.Signin(prop.getProperty("email"), prop.getProperty("password"));
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethod() throws InterruptedException {
        driver.close();
    }
}
