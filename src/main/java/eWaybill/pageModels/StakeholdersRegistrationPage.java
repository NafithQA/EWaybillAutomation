package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
public class StakeholdersRegistrationPage {
    private Functions functions = new Functions();
    public StakeholdersRegistrationPage(WebDriver driver) {    PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Sign up']")
    private WebElement signUpButton;


    @FindBy(xpath = "//input[@placeholder='Commercial Name in Arabic']")
    private WebElement commercialNameInArabicField;
    @FindBy(xpath = "//input[@placeholder='Full Name in Arabic']")
    private WebElement fullNameInArabicField;
    @FindBy(xpath = "//input[@placeholder='Full Name in English']")
    private WebElement fullNameInEnglishField;
    @FindBy(xpath = "//input[@placeholder='Commercial Name in English']")
    private WebElement commercialNameInEnglishField;

    @FindBy(name = "companyRegistrationNo")
    private WebElement companyRegistrationNumberField;

    @FindBy(xpath = "//div[@class='select__input-container css-136ehom']")
    private WebElement businessActivityTypeDropDown;

    @FindBy(xpath = "//*[text()='Freight Forwarder']")
    private WebElement freightForwarderOption;

    @FindBy(xpath = "//*[text()='Clearing Agent']")
    private WebElement clearingAgentOption;

    @FindBy(xpath = "//*[text()='Trucking Company']")
    private WebElement truckingCompanyOption;

    @FindBy(xpath = "//*[text()='Owner']")
    private WebElement ownerOption;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    private WebElement firstAttachmentButton;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    private WebElement secondAttachmentButton;

    @FindBy(xpath = "(//input[@type='file'])[3]")
    private WebElement thirdAttachmentButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement nextButton;

    @FindBy(xpath = "(//div[@class='select__input-container css-136ehom'])[3]")
    private WebElement countryDropDown;

    @FindBy(xpath = "(//div[@class='select__input-container css-136ehom'])[4]")
    private WebElement governorateDropDown;

    @FindBy(xpath = "(//div[@class='select__input-container css-136ehom'])[2]")
    private WebElement countryCodeDropDown;

    @FindBy(xpath = "//*[text()='Oman']")
    private WebElement omanOption;

    @FindBy(xpath = "//*[text()='Muscat']")
    private WebElement muscatOption;

    @FindBy(xpath = "//*[text()='Passport']")
    private WebElement passportOption;

    @FindBy(name = "address")
    private WebElement addressField;

    @FindBy(name = "companyTelephoneNo")
    private WebElement companyTelephoneNoField;

    @FindBy(name = "fullName")
    private WebElement fullNameField;

    @FindBy(xpath = "(//div[@class='select__input-container css-136ehom'])[1]")
    private WebElement userNationalityDropDown;

    @FindBy(xpath = "(//div[@class='select__input-container css-136ehom'])[2]")
    private WebElement idDocumentTypeDropDown;

    @FindBy(name = "idDocumentNo")
    private WebElement idDocumentNoField;

    @FindBy(name = "authorizedManagerMobileNo")
    private WebElement authorizedManagerMobileNoField;

    @FindBy(name = "email")
    private WebElement emailField;
    @FindBy(name = "verificationCode")
    private WebElement verificationCodeField;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(name = "newPassword")
    private WebElement newPasswordField;
//
//    @FindBy(xpath = "//button[type='submit']")
//    private WebElement submitButton;

    public void clickOnSignUpButton() {

        functions.waitForElementToBeClickable(signUpButton);
        signUpButton.click();
    }
    public void fillInCommercialNameInArabicField(String text) {

        functions.waitForElementToBeClickable(commercialNameInArabicField);
        commercialNameInArabicField.sendKeys(text);
    }
    public void fillInFullNameInArabicField(String text) {

        functions.waitForElementToBeClickable(fullNameInArabicField);
        fullNameInArabicField.sendKeys(text);
    }
    public void fillInFullNameInEnglishField(String text) {

        functions.waitForElementToBeClickable(fullNameInEnglishField);
        fullNameInEnglishField.sendKeys(text);
    }
    public void fillInCommercialNameInEnglishField(String text) {

        functions.waitForElementToBeClickable(commercialNameInEnglishField);
        commercialNameInEnglishField.sendKeys(text);
    }

    public void fillInCompanyRegistrationNumberField(String text) {

        functions.waitForElementToBeClickable(companyRegistrationNumberField);
        companyRegistrationNumberField.sendKeys(text);
    }

    public void clickOnBusinessActivityTypeDropDown() {
        functions.waitForElementToBeClickable(businessActivityTypeDropDown);
        businessActivityTypeDropDown.click();
    }

    public void clickOnFreightForwarderOption() {
        functions.waitForElementToBeClickable(freightForwarderOption);
        freightForwarderOption.click();
    }

    public void clickOnClearingAgentOption() {
        functions.waitForElementToBeClickable(clearingAgentOption);
        clearingAgentOption.click();
    }

    public void clickOnTruckingCompanyOption() {
        functions.waitForElementToBeClickable(truckingCompanyOption);
        truckingCompanyOption.click();
    }

    public void clickOnOwnerOption() {
        functions.waitForElementToBeClickable(ownerOption);
        ownerOption.click();
    }

    public WebElement getFirstAttachmentButton() {
        return firstAttachmentButton;
    }

    public WebElement getSecondAttachmentButton() {
        return secondAttachmentButton;
    }

    public WebElement getThirdAttachmentButton() {
        return thirdAttachmentButton;
    }

    public void clickOnNextButton() {
        functions.waitForElementToBeClickable(nextButton);
        nextButton.click();
    }

    public void clickOnCountryDropDown() {
        functions.waitForElementToBeClickable(countryDropDown);
        countryDropDown.click();
    }

    public void clickOnOmanOption() throws InterruptedException {
        functions.waitForElementToBeClickable(omanOption);
        omanOption.click();
    }

    public void clickOnGovernorateDropDown() {
        functions.waitForElementToBeClickable(governorateDropDown);
        governorateDropDown.click();
    }

    public void clickOnMuscatOption() {
        functions.waitForElementToBeClickable(muscatOption);
        muscatOption.click();
    }
    public void fillInAddressField(String text) {

        functions.waitForElementToBeClickable(addressField);
        addressField.sendKeys(text);
    }

    public void fillInCompanyTelephoneNoField(String text) {

        functions.waitForElementToBeClickable(companyTelephoneNoField);
        companyTelephoneNoField.sendKeys(text);
    }

    public void fillInFullNameField(String text) {

        functions.waitForElementToBeClickable(fullNameField);
        fullNameField.sendKeys(text);
    }

    public void clickOnUserNationalityDropDown() {
        functions.waitForElementToBeClickable(userNationalityDropDown);
        userNationalityDropDown.click();
    }

    public void clickOnIdDocumentTypeDropDown() {
        functions.waitForElementToBeClickable(idDocumentTypeDropDown);
        idDocumentTypeDropDown.click();
    }

    public void clickOnPassportOption() {
        functions.waitForElementToBeClickable(passportOption);
        passportOption.click();
    }

    public void fillInIdDocumentNoField(String text) {

        functions.waitForElementToBeClickable(idDocumentNoField);
        idDocumentNoField.sendKeys(text);
    }

    public void fillInAuthorizedManagerMobileNoField(String text) {

        functions.waitForElementToBeClickable(authorizedManagerMobileNoField);
        authorizedManagerMobileNoField.sendKeys(text);
    }

    public void fillInEmailField(String text) {

        functions.waitForElementToBeClickable(emailField);
        emailField.sendKeys(text);
    }

    public void fillInVerificationCodeField(String text) {

        functions.waitForElementToBeClickable(verificationCodeField);
        verificationCodeField.sendKeys(text);
    }

    public void fillInNewPasswordField(String text) {

        functions.waitForElementToBeClickable(newPasswordField);
        newPasswordField.sendKeys(text);
    }

    public void fillInConfirmPasswordField(String text) {

        functions.waitForElementToBeClickable(confirmPasswordField);
        confirmPasswordField.sendKeys(text);
    }
}



