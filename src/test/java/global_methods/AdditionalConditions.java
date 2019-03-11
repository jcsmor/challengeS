package global_methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

/**
 * Class responsible for storing the project specific Wait Conditions for Selenium
 */
public class AdditionalConditions {

    /**
     * Method responsible for executing a wait based on a piece of JavaScript
     *
     * @param condition represents the piece of JavaScript. Usually it's a call to a function "return fuctionName();"
     * @return a wrapped boolean, used by the Explicit Wait on Selenium, stating the status of the wait.
     */
    public static ExpectedCondition<Boolean> scriptedCondition(String condition) {
        return driver -> Boolean.valueOf(((JavascriptExecutor) driver).executeScript(condition).toString());
    }

    /**
     * Method responsible for executing a wait based on the VISIBILITY of the FIRST element located by a BY locator.
     * @param locator represents the By locator of Selenium.
     * @return the wrapped element itself found or null
     */
    public static ExpectedCondition<WebElement> visibilityOfFirstLocatedBy(By locator) {
        return new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                List<WebElement> webElementList = driver.findElements(locator);

                // check for existence of elements with the By locator
                if (webElementList.isEmpty()) {
                    throw new NoSuchElementException("Cannot locate an element using " + locator);
                }

                // Filters the list by isDisplayed and then retrieves the first.
                return webElementList
                        .stream()
                        .filter(WebElement::isDisplayed)
                        .findFirst()
                        .orElse(null);
            }

            public String toString() {
                return "visibility of first located by " + locator;
            }
        };
    }
}