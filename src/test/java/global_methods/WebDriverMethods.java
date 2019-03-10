package global_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.fail;


/**
 * Central place for all driver commands
 */
public class WebDriverMethods {

    public static void getUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    public static String getCurrentUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public static void press(WebDriverWait wait, By locator) {
        ECMethods.waitForVisibilityOfElement(wait, locator).sendKeys(Keys.ENTER);
    }

    public static void click(WebDriver driver, WebDriverWait wait, By locator) {
        ECMethods.waitForElementToBeClickable(wait, locator).click();
    }

    public static String getTextFromElement(WebDriver driver, WebDriverWait wait, Object object) {
        ECMethods.waitForVisibilityOfElement(wait, object);
        if (object instanceof By) {
            return driver.findElement((By) object).getText();
        } else if (object instanceof WebElement) {
            return ((WebElement) object).getText();
        } else {
            fail("The given object type is either By or WebElement");
            return "Failed to get text from element";
        }
    }

    /**
     * Get text from WebElements
     *
     * @param object -> List<WebElements> objects from which we will get text
     * @return List<String> -> from passed WebElement List
     */
    public static List<String> getTextFromListOfWebElements(List<WebElement> object) {
        List<String> texts = new ArrayList<>();

        for (WebElement el : object) {
            String tmpText = el.getText();

            if (tmpText.length() == 0) {
                tmpText = el.getAttribute("textContent");
            }

            texts.add(tmpText);
        }
        return texts;
    }

    /**
     * Get innerText from WebElements
     *
     * @param object -> List<WebElements> objects from which we will get text
     * @return List<String> -> from passed WebElement List
     */
    public static List<String> getInnerTextFromListOfWebElements(List<WebElement> object) {
        List<String> texts = new ArrayList<>();

        for (WebElement el : object) {
            String tmpText = el.getText();

            if (tmpText.length() == 0) {
                tmpText = el.getAttribute("innerText");
            }

            texts.add(tmpText);
        }
        return texts;
    }

    public static void click(WebDriverWait wait, Object object) {
        ECMethods.waitForElementToBeClickable(wait, object).click();
    }

    /**
     * Insert text to WebElement locatored by passed "By" Locator
     * @param driver  - WebDriver object
     * @param wait    - WebDriverWait object
     * @param locator - Webelement selector
     * @param text    - string which contains input text
     */
    public static void enterText(WebDriver driver, WebDriverWait wait, By locator, String text) {
        ECMethods.waitForElementToBeClickable(wait, locator);
        driver.findElement(locator).sendKeys(text);
    }


    /**
     * Clear text in webelement located by "By" selector and insert new text to it.
     *
     * @param driver  - WebDriver object
     * @param wait    - WebDriverWait object
     * @param locator - Webelement selector
     * @param text    - string which contains input text
     */
    public static void clearTextAndInsertNewText(WebDriver driver, WebDriverWait wait, By locator, String text) {
        ECMethods.waitForElementToBeClickable(wait, locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }


}
