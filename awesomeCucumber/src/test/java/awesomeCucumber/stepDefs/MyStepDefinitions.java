package awesomeCucumber.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MyStepDefinitions {
    private WebDriver driver;

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/store");
    }
    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String productName) throws InterruptedException {
        By addToCartButton = By.cssSelector("a[aria-label='Add " + productName + " to your cart']");
        driver.findElement(addToCartButton).click();
        Thread.sleep(3000);
        By viewCartLink = By.cssSelector("a[title = 'View cart']");
        driver.findElement(viewCartLink).click();
    }
    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(int quantity, String productName) {
        By productNameField = By.cssSelector("td[class = 'prodcut-name'] a");
        String actualProductName = driver.findElement(productNameField).getText();
        By productQuantityField = By.cssSelector("input[type = \"number\"]");
        String actualProductQuantity = driver.findElement(productQuantityField).getAttribute("value");

        Assert.assertEquals(actualProductName, productName);
        Assert.assertEquals(Integer.parseInt(actualProductQuantity), quantity);
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/store");
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() throws InterruptedException {
        Thread.sleep(2000);
        By addToCartButton = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
        driver.findElement(addToCartButton).click();
        Thread.sleep(3000);
        By viewCartLink = By.cssSelector("a[title = 'View cart']");
        driver.findElement(viewCartLink).click();
    }

    @And("I'm on the Checkout page")
    public void iMOnTheCheckoutPage() {
        By proceedToCheckOutButton = By.cssSelector(".checkout-button");
        driver.findElement(proceedToCheckOutButton).click();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails(List<Map<String, String>> billingDetails) {
        By billingFirstNameField = By.id("billing_first_name");
        By billingLastNameField = By.id("billing_last_name");
        By billingAddressOneField = By.id("billing_address_1");
        By billingCityField = By.id("billing_city");
        By billingStateDropdown = By.id("billing_state");
        By billingZipField = By.id("billing_postcode");
        By billingEmailAddress = By.id("billing_email");

        driver.findElement(billingFirstNameField).clear();
        driver.findElement(billingFirstNameField).sendKeys(billingDetails.get(0).get("firstName"));
        driver.findElement(billingLastNameField).clear();
        driver.findElement(billingLastNameField).sendKeys(billingDetails.get(0).get("lastName"));
        driver.findElement(billingAddressOneField).clear();
        driver.findElement(billingAddressOneField).sendKeys(billingDetails.get(0).get("address_line1"));
        driver.findElement(billingCityField).clear();
        driver.findElement(billingCityField).sendKeys(billingDetails.get(0).get("city"));

        Select select = new Select(driver.findElement(billingStateDropdown));
        select.selectByVisibleText(billingDetails.get(0).get("state"));

        driver.findElement(billingZipField).clear();
        driver.findElement(billingZipField).sendKeys(billingDetails.get(0).get("zip"));
        driver.findElement(billingEmailAddress).clear();
        driver.findElement(billingEmailAddress).sendKeys(billingDetails.get(0).get("email"));
    }

    @And("I place an order")
    public void iPlaceAnOrder() throws InterruptedException {
        By placeOrderButton = By.id("place_order");
        driver.findElement(placeOrderButton).click();
        Thread.sleep(3000);
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        By noticeText = By.cssSelector(".woocommerce-notice");
        String actualNoticeMessage = driver.findElement(noticeText).getText();
        Assert.assertEquals(actualNoticeMessage, "Thank you. Your order has been received.");
    }
}
