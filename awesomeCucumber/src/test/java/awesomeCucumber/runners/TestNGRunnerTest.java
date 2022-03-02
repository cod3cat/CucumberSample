package awesomeCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin =
        { "pretty", "summary", "html:target/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@scenario1 or @scenario2",
        glue = {"awesomeCucumber.stepDefs", "awesomeCucumber.hooks"},
        features = "src/test/resources/awesomeCucumber"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}
