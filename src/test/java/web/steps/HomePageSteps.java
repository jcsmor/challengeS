package web.steps;

import cucumber.api.java8.En;
import global_methods.Configuration;
import global_methods.Driver;
import global_methods.ECMethods;
import global_methods.WebDriverMethods;
import global_utils.BaseStepDefinition;
import global_utils.Control;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import page_objects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class HomePageSteps {//extends Control implements En {
    private WebDriver driver;

    public HomePageSteps() {
//        And("^(?:the user navigates to the wikipage$)", () -> {
//            HomePage.goToWikiPage(getDriver(), getDriverWait());
//        });
    }


    @Before
    public void setUp() throws Exception {
        Configuration.load();
        Configuration.print();
        String baseUrl = Configuration.get("url");
        System.setProperty("webdriver.chrome.driver", new File("src/drivers/chromedriver").getAbsolutePath());

        DesiredCapabilities cap = new DesiredCapabilities();
        Driver.add(Configuration.get("browser"),cap);

        driver = Driver.current();
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testValidSearch(){
        HomePage.goToWikiPage(driver);
        //HomePage.searchText(driver, "apple");
    }


}
