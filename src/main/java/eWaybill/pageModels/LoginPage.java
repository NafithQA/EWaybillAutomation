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

    public void clickOnSignUpButton() {

        functions.waitForElementToBeClickable(signUpButton);
        signUpButton.click();
    }
}
