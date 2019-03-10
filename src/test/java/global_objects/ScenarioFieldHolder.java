package global_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Holds the components that may be required throughout a scenario's lifecycle.
 */
public class ScenarioFieldHolder {

    private WebDriver driver;
    private WebDriverWait driverWait;
    private String jobId;

    public ScenarioFieldHolder(WebDriver driver, WebDriverWait driverWait, String jobId) {
        this.driver = driver;
        this.driverWait = driverWait;
        this.jobId = jobId;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public String getJobId() {
        return jobId;
    }

}