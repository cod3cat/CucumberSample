package awesomeCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin =
        { "pretty", "summary", "html:target/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = true,
        monochrome = true
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}
