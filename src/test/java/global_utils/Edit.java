package global_utils;

import org.openqa.selenium.By;
import page_objects.Page;


public class Edit extends Control {

    public Edit(Page parentValue, By locatorValue){
        super(parentValue, locatorValue);
    }

    public void setText(String value){
        this.click();
        this.getElement().clear();
        this.getElement().sendKeys(value);
    }


}
