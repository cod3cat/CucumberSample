package awesomeCucumber.pages;

import awesomeCucumber.domainObjects.BillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "billing_first_name") private WebElement billingFirstNameField;
    @FindBy(id = "billing_last_name") private WebElement billingLastNameField;
    @FindBy(id = "billing_address_1") private WebElement billingAddressOneField;
    @FindBy(id = "billing_city") private WebElement billingCityField;
    @FindBy(id = "billing_state") private WebElement billingStateDropdown;
    @FindBy(id = "billing_postcode") private WebElement billingZipField;
    @FindBy(id = "billing_email") private WebElement billingEmailAddress;
    @FindBy(id = "place_order") private WebElement placeOrderButton;
    @FindBy(css = ".woocommerce-notice") private WebElement noticeText;

    public CheckoutPage enterBillingFirstName(String billingFirstName) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingFirstNameField));
        e.clear();
        e.sendKeys(billingFirstName);
        return  this;
    }

    public CheckoutPage enterBillingLastName(String billingLastName) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingLastNameField));
        e.clear();
        e.sendKeys(billingLastName);
        return  this;
    }

    public CheckoutPage enterBillingAddressOne(String billingAddressOne) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingAddressOneField));
        e.clear();
        e.sendKeys(billingAddressOne);
        return  this;
    }

    public CheckoutPage enterBillingCity(String billingCity) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingCityField));
        e.clear();
        e.sendKeys(billingCity);
        return  this;
    }

    public CheckoutPage selectBillingState(String billingState) {
        Select select = new Select(wait.until(ExpectedConditions.elementToBeClickable(billingStateDropdown)));
        select.selectByVisibleText(billingState);
        return this;
    }

    public CheckoutPage enterBillingZipCode(String zipCode) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingZipField));
        e.clear();
        e.sendKeys(zipCode);
        return  this;
    }

    public CheckoutPage enterBillingEmail(String billingEmail) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(billingEmailAddress));
        e.clear();
        e.sendKeys(billingEmail);
        return  this;
    }

    public CheckoutPage setBillingDetails(BillingDetails billingDetails) {
       return enterBillingFirstName(billingDetails.getBillingFirstNameField()).
               enterBillingLastName(billingDetails.getBillingLastNameField()).
               enterBillingAddressOne(billingDetails.getBillingAddressOneField()).
               enterBillingCity(billingDetails.getBillingCityField()).
               selectBillingState(billingDetails.getBillingStateDropdown()).
               enterBillingZipCode(billingDetails.getBillingZipField()).
               enterBillingEmail(billingDetails.getBillingEmailAddress());
    }

    public CheckoutPage placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        return this;
    }

    public String getNotice() {
        return wait.until(ExpectedConditions.visibilityOf(noticeText)).getText();
    }
}
