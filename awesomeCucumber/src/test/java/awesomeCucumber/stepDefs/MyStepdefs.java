package awesomeCucumber.stepDefs;

import awesomeCucumber.objects.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I'm on store page");
    }
    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I added things to cart : " +product.getName());
    }
    @Then("I see {int} {product} in the cart")
    public void iSeeInTheCart(Integer int1, Product product) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then I see 1 item in cart: " +product.getName());
    }

    @Given("I'm a dummy")
    public void iMADummy() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I do dummy things")
    public void iDoDummyThings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dummy things happen")
    public void dummyThingsHappen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
