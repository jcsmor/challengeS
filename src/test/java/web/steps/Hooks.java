package web.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import global_constants.TestConfiguration;
import global_methods.Configuration;
import global_methods.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Hooks {
    private WebDriver driver;

    /**
     * Before Hook
     * Always executed Before each Scenario
     * Generates the WebDriver
     */
    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        Configuration.load();
        Configuration.print();
        System.setProperty("webdriver.chrome.driver", new File("src/drivers/chromedriver").getAbsolutePath());
        DesiredCapabilities cap = new DesiredCapabilities();
        Driver.add(Configuration.get("browser"),cap);
    }

    @After
    public void afterScenario(Scenario scenario){
        Driver.getDriver().quit();
    }
}
