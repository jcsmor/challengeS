package web.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import global_methods.Configuration;
import global_methods.Driver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

public class Hooks {
    /**
     * Before Hook
     * Always executed Before each Scenario
     * Generates the WebDriver
     */
    @Before("@Selenium")
    public void beforeScenario(Scenario scenario) throws Exception {
        Configuration.load();
        Configuration.print();
        System.setProperty("webdriver.chrome.driver", new File("src/drivers/chromedriver").getAbsolutePath());
        DesiredCapabilities cap = new DesiredCapabilities();
        Driver.add(Configuration.get("browser"),cap);
    }

    @After("@Selenium")
    public void afterScenario(Scenario scenario){
        Driver.getDriver().quit();
    }
}
