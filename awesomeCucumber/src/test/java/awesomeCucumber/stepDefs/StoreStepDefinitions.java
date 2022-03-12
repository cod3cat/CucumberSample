package awesomeCucumber.stepDefs;

import awesomeCucumber.constants.EndPoints;
import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.Product;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinitions {
    private final WebDriver driver;

    public StoreStepDefinitions(TestContext testContext) {
        driver = testContext.driver;
    }

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        new StorePage(driver).load(EndPoints.STORE.url);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        new StorePage(driver).addToCart(product.getName());
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() {
        new StorePage(driver).addToCart("Blue Shoes");
    }

}
