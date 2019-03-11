//package global_utils;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Page {
//    private WebDriver driver;
//
//    // Selector constants
//    public final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
//    public final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");
//
//
//    public Page(WebDriver driver){
//        super();
//        this.driver = driver;
//    }
//
//    public WebDriver getDriver(){
//        return driver;
//    }
//
//    public Page navigate(){
//        return this;
//    }
//
//    public boolean isTextPresent(String text){
//        String locator = String.format("//*[text()='%s' or contains(text(), %s)]", text, text);
//        Control element = new Control(this, By.xpath(locator));
//        return element.exists();
//    }
//
//
//}
