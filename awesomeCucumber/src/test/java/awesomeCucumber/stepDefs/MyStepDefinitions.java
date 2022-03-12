package awesomeCucumber.stepDefs;

import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.BillingDetails;
import org.openqa.selenium.WebDriver;

public class MyStepDefinitions {
    private final WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepDefinitions(TestContext testContext) {
        this.driver = testContext.driver;
    }

}
