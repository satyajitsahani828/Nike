package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class IconBtnTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;
    IconBtnTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        productPage = new ProductPage();
        mouseHoverPage = new MouseHoverPage();
        iconBtnPage = new IconBtnPage();
        dropDownPage = new DropDownPage();
        radioBtnPage = new RadioBtnPage();
    }
    @Test(priority = 5, description = "verifying icon btn Functionality")
    public void verifyiconBtnFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        productPage.searchProduct();
        mouseHoverPage.shoesMouseHoverBtn();
        iconBtnPage.sortByIconBtn();
        //softAssert.assertTrue(iconBtnPage.sortByIconBtnDisplay(),"icon should be selected");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
