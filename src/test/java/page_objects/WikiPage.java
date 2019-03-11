package page_objects;
import global_methods.*;
import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by Joao Moreira on 10/03/2019.
 */
public class WikiPage {

    // Selector constants
    private static final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
    private static final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");
    private static final By WIKI_SEARCH_RESULTS = By.cssSelector(".mw-parser-output > ol > li");

    // Methods
    public static void goToWikiPage(WebDriver driver) {
        WebDriverMethods.getUrl(driver, Configuration.get("url"));
        ECMethods.waitForVisibilityOfElement(driver, WIKI_SEARCH_INPUT);
    }

    public static void searchWord(WebDriver driver, String word){
        WebDriverMethods.enterText(driver, WIKI_SEARCH_INPUT, word);
        WebDriverMethods.click(driver, WIKI_LOOKUP_BTN);
    }

    public static boolean isTextContained(WebDriver driver, String text){
        List<WebElement> listOfItems = ECMethods.waitForVisibilityOfAllElements(driver, WIKI_SEARCH_RESULTS);
        for (WebElement element : listOfItems) {
            String elementText = element.getText();
            if (elementText.toLowerCase().contains(text.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}



// For didactic proposes
//    public static boolean isTextPresent(WebDriver driver, String text){
//        String locator = String.format("//*[text()='%s' or contains(text(), '%s')]", text, text);
//        List<WebElement> elements = driver.findElements(By.xpath(locator));
//        // check for existence of elements with the By locator
//        if (elements.isEmpty()) {
//            return false;
//        }
//        System.out.print("we have positive results");
//        return true;
//    }