package awesomeCucumber.stepDefs;

import awesomeCucumber.constants.EndPoints;
import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.BillingDetails;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinitions {
    private final WebDriver driver;
    private final TestContext context;

    public CustomerStepDefinitions(TestContext testContext) {
        context = testContext;
        driver = testContext.driver;
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        new StorePage(driver).load(EndPoints.STORE.url);
    }

    @Given("my billing details are")
    public void my_billing_details_are(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }
}
