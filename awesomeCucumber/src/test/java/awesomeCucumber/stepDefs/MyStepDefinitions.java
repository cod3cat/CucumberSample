package awesomeCucumber.stepDefs;

import awesomeCucumber.factory.DriverFactory;
import awesomeCucumber.pages.CartPage;
import awesomeCucumber.pages.CheckoutPage;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MyStepDefinitions {
    private WebDriver driver;

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        driver = DriverFactory.getDriver();
        new StorePage(driver).load("https://askomdch.com/store");
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String productName) {
        new StorePage(driver).addToCart(productName);
    }

    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(int quantity, String productName) {
        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(productName, cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        driver = DriverFactory.getDriver();
        new StorePage(driver).load("https://askomdch.com/store");
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() {
        new StorePage(driver).addToCart("Blue Shoes");
    }

    @And("I'm on the Checkout page")
    public void iMOnTheCheckoutPage() {
        new CartPage(driver).checkOut();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails(List<Map<String, String>> billingDetails) {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setBillingDetails(billingDetails.get(0).get("firstName"),
                billingDetails.get(0).get("lastName"),
                billingDetails.get(0).get("address_line1"),
                billingDetails.get(0).get("city"),
                billingDetails.get(0).get("state"),
                billingDetails.get(0).get("zip"),
                billingDetails.get(0).get("email"));
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
        new CheckoutPage(driver).placeOrder();
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        Assert.assertEquals(new CheckoutPage(driver).getNotice(), "Thank you. Your order has been received.");
    }
}
