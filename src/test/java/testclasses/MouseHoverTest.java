package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class MouseHoverTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;

    MouseHoverTest() {
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

    @Test(priority = 4, description = "verifying mouse hover Functionality")
    public void verifyMouseHoverFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        productPage.searchProduct();
        mouseHoverPage.shoesMouseHoverBtn();
        softAssert.assertTrue(mouseHoverPage.shoesMouseHoverBtnDisplay(), "shoes should be displayed");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
