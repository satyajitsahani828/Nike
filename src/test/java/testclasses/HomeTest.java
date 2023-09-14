package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;

    HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1, description = "verify window handling")
    public void verifyWindowHandlingFunctionality() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnFacebooklogo();
        softAssert.assertEquals(driver.getTitle(), "Nike. Just Do It. Nike IN", "Title should match");
        softAssert.assertAll();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
