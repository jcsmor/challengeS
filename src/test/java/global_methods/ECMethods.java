package global_methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Central place for expected conditions
 */
public class ECMethods {

    public static WebElement waitForVisibilityOfElement(WebDriverWait wait, Object desiredElement) {
        if(desiredElement instanceof By) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated((By)desiredElement));
        } else if (desiredElement instanceof WebElement) {
            return wait.until(ExpectedConditions.visibilityOf((WebElement)desiredElement));
        } else {
            Assert.fail("please provide either a BY object or a WebElement object!!");
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("placeholder")));
        }
    }

    public static WebElement waitForElementToBeClickable(WebDriverWait wait, Object desiredElement) {
        if(desiredElement instanceof By) {
            return wait.until(ExpectedConditions.elementToBeClickable((By)desiredElement));
        } else if (desiredElement instanceof WebElement) {
            return wait.until(ExpectedConditions.elementToBeClickable((WebElement)desiredElement));
        } else {
            Assert.fail("please provide either a BY object or a WebElement object!!");
            return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("placeholder")));
        }
    }

}

