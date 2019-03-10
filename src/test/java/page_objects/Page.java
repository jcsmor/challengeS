package page_objects;

import gherkin.lexer.Pa;
import global_utils.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {

    private WebDriver driver;

    public Page(WebDriver driver){
        super();
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public Page navigate(){
        return this;
    }

    public boolean inTextPresent(String text){
        String locator = String.format("//*[text()='%s' or contains(text(), %s)]", text, text);
        Control element = new Control(this, By.xpath(locator));
        return element.exists();
    }


}
