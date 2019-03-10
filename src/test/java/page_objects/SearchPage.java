package page_objects;

import global_constants.TestConfiguration;
import global_methods.Configuration;
import global_utils.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import global_utils.Edit;



public class SearchPage extends Page {
    // Selector constants
    public final By WIKI_SEARCH_INPUT = By.cssSelector("input[class *='mw-ui-input']");
    public final By WIKI_LOOKUP_BTN = By.cssSelector("input[class ='mw-ui-button']");

    public Edit inputSearchBox;
    public Control buttonLookUp;


    public SearchPage(WebDriver driver){
        super(driver);
        inputSearchBox = new Edit(this, WIKI_SEARCH_INPUT);
        buttonLookUp = new Control(this, WIKI_LOOKUP_BTN);
    }

    public Page navigate(){
        String baseUrl = Configuration.get("url");
        this.getDriver().get(baseUrl);
        return this;
    }


}
