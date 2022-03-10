package awesomeCucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "awesomeCucumber",
        features = "src/test/resources/awesomeCucumber",
        tags = "@smoke or @scenario2"
)

public class JunitRunnerTest {
}
