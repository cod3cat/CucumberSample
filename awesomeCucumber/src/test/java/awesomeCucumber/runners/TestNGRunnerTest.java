package awesomeCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin =
        {"pretty", "summary", "html:target/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@scenario2",
        glue = {"awesomeCucumber.stepDefs", "awesomeCucumber.hooks", "awesomeCucumber.types"},
        features = "src/test/resources/awesomeCucumber"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}
