//package page_objects;
//
//import global_constants.TestConfiguration;
//import global_methods.*;
//import global_utils.Control;
//import global_utils.Edit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
///**
// * Created by Joao Moreira on 10/03/2019.
// */
//public class HomePage extends Control {
//
//    // Selector constants
//    private static final String WIKI_URL = TestConfiguration.WIKI_URL;
//    private static final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
//    private static final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");
//
//    public HomePage(WebDriver driver, By locator) {
//        super(driver, locator);
//    }
//
//
//    // Methods
//    public static void goToWikiPage(WebDriver driver) {
//        WebDriverMethods.getUrl(driver, WIKI_URL);
//    }
//
//    public void searchText(String mySearh ) {
//        Edit.setText(mySearh);
//    }
//
//}
