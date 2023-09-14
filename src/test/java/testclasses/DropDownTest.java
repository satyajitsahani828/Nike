package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class DropDownTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;
    DropDownTest() {
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
    @Test(priority = 6, description = "verifying drop down Functionality")
    public void verifyDropDownFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        productPage.searchProduct();
        mouseHoverPage.shoesMouseHoverBtn();
        iconBtnPage.sortByIconBtn();
        dropDownPage.lowToHighDropDown();
        softAssert.assertFalse(dropDownPage.lowToHighDropDownDisplay(),"dropdown should be selected");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
