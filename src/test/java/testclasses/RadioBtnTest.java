package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class RadioBtnTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;
    RadioBtnTest() {
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
    @Test(priority = 7, description = "verifying radio btn Functionality")
    public void verifyRadioBtnFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        productPage.searchProduct();
        mouseHoverPage.shoesMouseHoverBtn();
        iconBtnPage.sortByIconBtn();
        dropDownPage.lowToHighDropDown();
        radioBtnPage.menCheckBoxRadioBtn();
        softAssert.assertTrue(radioBtnPage.menCheckBoxRadioBtnDisplay(),"Button should be displayed");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
