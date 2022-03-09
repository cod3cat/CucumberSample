package awesomeCucumber.domainObjects;

public class BillingDetails {
    private String billingFirstNameField;
    private String billingLastNameField;
    private String billingAddressOneField;
    private String billingCityField;
    private String billingStateDropdown;
    private String billingZipField;
    private String billingEmailAddress;

    public BillingDetails(String billingFirstNameField, String billingLastNameField, String billingAddressOneField,
                          String billingCityField, String billingStateDropdown, String billingZipField, String billingEmailAddress) {
        this.billingFirstNameField = billingFirstNameField;
        this.billingLastNameField = billingLastNameField;
        this.billingAddressOneField = billingAddressOneField;
        this.billingCityField = billingCityField;
        this.billingStateDropdown = billingStateDropdown;
        this.billingZipField = billingZipField;
        this.billingEmailAddress = billingEmailAddress;
    }

    public String getBillingFirstNameField() {
        return billingFirstNameField;
    }

    public void setBillingFirstNameField(String billingFirstNameField) {
        this.billingFirstNameField = billingFirstNameField;
    }

    public String getBillingLastNameField() {
        return billingLastNameField;
    }

    public void setBillingLastNameField(String billingLastNameField) {
        this.billingLastNameField = billingLastNameField;
    }

    public String getBillingAddressOneField() {
        return billingAddressOneField;
    }

    public void setBillingAddressOneField(String billingAddressOneField) {
        this.billingAddressOneField = billingAddressOneField;
    }

    public String getBillingCityField() {
        return billingCityField;
    }

    public void setBillingCityField(String billingCityField) {
        this.billingCityField = billingCityField;
    }

    public String getBillingStateDropdown() {
        return billingStateDropdown;
    }

    public void setBillingStateDropdown(String billingStateDropdown) {
        this.billingStateDropdown = billingStateDropdown;
    }

    public String getBillingZipField() {
        return billingZipField;
    }

    public void setBillingZipField(String billingZipField) {
        this.billingZipField = billingZipField;
    }

    public String getBillingEmailAddress() {
        return billingEmailAddress;
    }

    public void setBillingEmailAddress(String billingEmailAddress) {
        this.billingEmailAddress = billingEmailAddress;
    }
}
