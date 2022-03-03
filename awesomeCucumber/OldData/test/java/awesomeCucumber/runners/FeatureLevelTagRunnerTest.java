package awesomeCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        tags = "@featureTag",
        glue = {"awesomeCucumber.hooks", "awesomeCucumber.stepDefs", "awesomeCucumber.types"},
        features = "src/test/resources/awesomeCucumber"
)

public class FeatureLevelTagRunnerTest extends AbstractTestNGCucumberTests {
}
