package awesomeCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        tags = "@ruleTag",
        glue = {"awesomeCucumber.stepDefs", "awesomeCucumber.hooks", "awesomeCucumber.types"},
        features = "src/test/resources/awesomeCucumber"
)

public class RuleLevelTagRunnerTest extends AbstractTestNGCucumberTests {
}
