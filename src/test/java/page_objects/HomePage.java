package page_objects;

import global_constants.TestConfiguration;
import global_methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joao Moreira on 10/03/2019.
 */
public class HomePage {

    // Selector constants
    private static final String WIKI_URL = TestConfiguration.WIKI_URL;
    private static final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
    private static final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");


    // Methods
    public static void goToWikiPage(WebDriver driver, WebDriverWait wait) {
        WebDriverMethods.getUrl(driver, WIKI_URL);
        //ECMethods.waitForVisibilityOfElement(wait, WIKI_SEARCH_INPUT);
    }

    public static void searchText(WebDriver driver, WebDriverWait wait, String mySearh ) {
        //WebDriverMethods.enterText(driver, wait, WIKI_SEARCH_INPUT, mySearh);
        //WebDriverMethods.click(driver, wait, WIKI_LOOKUP_BTN);

        //ECMethods.waitForVisibilityOfElement(wait, WIKI_SEARCH_INPUT);
    }

}
