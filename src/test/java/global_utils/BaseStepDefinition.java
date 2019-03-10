package global_utils;

import global_constants.Platform;
import global_constants.TestConfiguration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by joao moreira on 10/03/2019.
 * All step definition classes should extend this class. It provides the driver and
 * driverWait objects for the current thread.
 */

public abstract class BaseStepDefinition {

    private WebDriver driver;
    private WebDriverWait driverWait;


    /**
     * @return The driver instance for the current thread.
     */
    public WebDriver getDriver() {
        driver.manage().window().setSize(new Dimension(1420, 1200));
        return driver;
    }

    /**
     * @return The driver wait instance for the current thread.
     */

    public WebDriverWait getDriverWait() {
        return driverWait;
    }
}
