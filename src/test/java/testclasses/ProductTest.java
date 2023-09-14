package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

import java.util.Collections;

public class ProductTest extends WebTestBase {

    public HomePage homePage;
    public ProductPage productPage;
    public MouseHoverPage mouseHoverPage;
    public IconBtnPage iconBtnPage;
    public DropDownPage dropDownPage;
    public RadioBtnPage radioBtnPage;
    ProductTest() {
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
    @Test(priority = 3, description = "verifying Product Functionality")
    public void verifySearchProductFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        productPage.searchProduct();
        //softAssert.assertEquals(productPage.searchProduct(), "shoes", "product should be displayed");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
