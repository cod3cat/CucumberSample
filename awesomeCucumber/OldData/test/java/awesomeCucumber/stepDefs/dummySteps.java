package awesomeCucumber.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dummySteps {
    @Given("I'm a dummy")
    public void iMADummy() {
        System.out.println("I'm a dummy");
    }
    @When("I do dummy things")
    public void iDoDummyThings() {
        System.out.println("I do dummy things");
    }
    @Then("dummy things happen")
    public void dummyThingsHappen() {
        System.out.println("dummy things happen");
    }
}
