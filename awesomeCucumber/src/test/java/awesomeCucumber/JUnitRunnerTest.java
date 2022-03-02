package awesomeCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin =
        {"pretty", "html:target/cucumber.html"}
)
public class JUnitRunnerTest {
}