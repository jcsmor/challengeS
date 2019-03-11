package global_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Central place for expected conditions
 */
public class ECMethods {
    private static final int ELEMENT_WAIT_TIME = Integer.parseInt(Configuration.get("ELEMENT_WAIT_TIME"));


    public static WebElement waitForVisibilityOfElement(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, ELEMENT_WAIT_TIME);
        return wait
                .pollingEvery(50, TimeUnit.MILLISECONDS)
                .withMessage(String.format("Element %s not found", locator))
                .until(AdditionalConditions.visibilityOfFirstLocatedBy(locator));
    }

    public static WebElement waitForElementToBeClickable(WebDriver webDriver, Object desiredElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, ELEMENT_WAIT_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(((By)desiredElement)));
        }

    public static List<WebElement> waitForVisibilityOfAllElements(WebDriver webDriver, By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, ELEMENT_WAIT_TIME);
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

}

