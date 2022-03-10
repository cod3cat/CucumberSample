package awesomeCucumber.hooks;

import awesomeCucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void before(Scenario scenario) {
        System.out.println("Before - Thread ID: " + Thread.currentThread().getId() + " .Scneario Name : " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
    }

    @After
    public void after(Scenario scenario){
        System.out.println("After - Thread ID: " + Thread.currentThread().getId() + " .Scneario Name : " + scenario.getName());
        driver.quit();
    }
}
