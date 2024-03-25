package eWaybill.pageModels;

import eWaybill.helpers.DataLoader;
import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonLocators {

    private Functions functions = new Functions();
    private DataLoader dataLoader = new DataLoader();

    public CommonLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement nextButton;

    public void clickOnContinueButton() {

        functions.waitForElementToBeClickable(continueButton);
        continueButton.click();
    }

    public void clickOnNextButton() {

        functions.waitForElementToBeClickable(nextButton);
        nextButton.click();
    }
}
