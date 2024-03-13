package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private Functions functions = new Functions();

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Sign up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@name='mobileNumber']")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[text()='Create eWaybill']")
    private WebElement createEWayBillButton;

    public void clickOnSignUpButton() {

        functions.waitForElementToBeClickable(signUpButton);
        signUpButton.click();
    }

    public void fillInPhoneNumberField(String phoneNumber) {

        functions.waitForElementToBeClickable(mobileNumberField);
        mobileNumberField.sendKeys(phoneNumber);
    }

    public void fillInPasswordField(String password) {

        functions.waitForElementToBeClickable(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickOnCreateEWayBillButton() {

        functions.waitForElementToBeClickable(createEWayBillButton);
        createEWayBillButton.click();
    }
}
