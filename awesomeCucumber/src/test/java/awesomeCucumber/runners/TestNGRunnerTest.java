package awesomeCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        features = "src/test/resources/awesomeCucumber",
        glue = "awesomeCucumber.stepDefs",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@scenario2"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}


