package awesomeCucumber.stepDefs;

import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.Product;
import awesomeCucumber.pages.CartPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartStepDefinitions {
    private final WebDriver driver;

    public CartStepDefinitions(TestContext testContext) {
        driver = testContext.driver;
    }

    @Then("I see {int} {product} in the cart")
    public void iSeeInTheCart(int quantity, Product product) {
        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(product.getName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }
}
