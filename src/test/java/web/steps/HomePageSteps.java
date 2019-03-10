package web.steps;

import cucumber.api.java8.En;
import global_methods.ECMethods;
import global_methods.WebDriverMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class HomePageSteps {
    private WebDriver driver;
    private static final By WIKI_SEARCH_INPUT = By.cssSelector(".mw-ui-input");

    public HomePageSteps(){

    }

    @Before
    public void setUp(){
        //String baseUrl ="https://en.wiktionary.org/";
        System.setProperty("webdriver.chrome.driver", new File("src/drivers/chromedriver").getAbsolutePath());
        DesiredCapabilities cap = new DesiredCapabilities();
        driver = new ChromeDriver(cap);
        //driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testValidSearch(){
        String baseUrl ="https://en.wiktionary.org/";
        //driver.get(baseUrl);
        WebDriverMethods.getUrl(driver,"https://en.wiktionary.org/");
        ECMethods.waitForVisibilityOfElement(WebDriverWait wait, WIKI_SEARCH_INPUT);
        //WebDriverMethods.enterText(driver, WebDriverWait wait, WIKI_SEARCH_INPUT, "teste");

    }


}
