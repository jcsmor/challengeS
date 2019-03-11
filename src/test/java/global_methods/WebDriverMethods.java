package global_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Central place for all driver commands
 */
public class WebDriverMethods {

    public static void getUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void click(WebDriver driver, By locator) {
        ECMethods.waitForElementToBeClickable(driver, locator).click();
    }

    /**
     * Insert text to WebElement locatored by passed "By" Locator
     * @param driver  - WebDriver object
     * @param locator - Webelement selector
     * @param text    - string which contains input text
     */
    public static void enterText(WebDriver driver, By locator, String text) {
        ECMethods.waitForElementToBeClickable(driver, locator);
        driver.findElement(locator).sendKeys(text);
    }


}
