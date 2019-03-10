package global_utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectList extends Control {

    public SelectList(WebDriver driver, By locator){
        super(driver, locator);
    }

    public Select getSelected(){
        return new Select(this.getElement());
    }

    public void selectByText(String value){
        this.exists();
        this.getSelected().selectByVisibleText(value);
    }


}
