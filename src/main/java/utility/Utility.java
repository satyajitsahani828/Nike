package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Utility extends WebTestBase {

    public static final long IMPLICIT_WAIT = 50;
    public static final long PAGE_LOAD = 60;
    public static final long EXPLICIT_WAIT = 70;
    public static WebDriverWait wait;

    public static void waitUntilElementToBeClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public static void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

    public static boolean isDisplayElement(WebElement element){
        return element.isDisplayed();
    }

    public static void dropDownElement(List<WebElement> elements, String textToSearchInsideDropdown) {
        for (WebElement e : elements) {
            if (e.getText().contains(textToSearchInsideDropdown)) {
            }
            System.out.println(e);
            e.click();
        }
    }

    //get window handel utility
    public static void handleWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String id : allWindow) {
            if (!(id.equals(parentWindow))) {
                driver.switchTo().window(id);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.close();
            }
            driver.switchTo().window(parentWindow);
        }
    }
}
