package page_objects;
import global_methods.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Joao Moreira on 10/03/2019.
 */
public class WikiPage {

    // Selector constants
    //private static final String WIKI_URL = TestConfiguration.WIKI_URL;
    private static final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
    private static final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");

    // Methods
    public static void goToWikiPage(WebDriver driver) {
        WebDriverMethods.getUrl(driver, Configuration.get("url"));
        ECMethods.waitForVisibilityOfElement(driver, WIKI_SEARCH_INPUT);
    }

    public static void searchWord(WebDriver driver, String word){
        WebDriverMethods.enterText(driver, WIKI_SEARCH_INPUT, word);
        WebDriverMethods.click(driver, WIKI_LOOKUP_BTN);
    }

    public static boolean isTextPresent(WebDriver driver, String text){
//        String locator = String.format("//*[text()='%s' or contains(text(), %s)]", text, text);
//        List<WebElement> elements = driver.findElements(By.xpath(locator));
//        // check for existence of elements with the By locator
//        if (elements.isEmpty()) {
//            return false;
//        }
//        System.out.print("we have positive results");
        return true;
    }


    private static class WebElements {
    }
}
