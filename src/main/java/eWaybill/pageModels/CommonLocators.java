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

    @FindBy(id = "OWNED_FLEET_btn")
    private WebElement ownedFleetChooseButton;

    @FindBy(id = "UNOWNED_FLEET_btn")
    private WebElement unownedFleetChooseButton;

    @FindBy(id = "PPH00004_btn")
    private WebElement firstAvailablePackageChooseButton;

    @FindBy(id = "PPH00004_btn")
    private WebElement firstAvailablePackageChooseButtonOO;

    @FindBy(id = "PPH00004_btn")
    private WebElement firstAvailablePackageChooseButtonSP;

    @FindBy(id = "ACCESS_serviceBtn")
    private WebElement accessServiceChooseButton;

    @FindBy(id = "CNTR_serviceBtn")
    private WebElement cntrServiceChooseButton;

    @FindBy(xpath = "(//h4[@class='card-title info'])[1]")
    private WebElement firstCardTitle;

    @FindBy(xpath = "(//h4[@class='card-title info'])[2]")
    private WebElement secondCardTitle;

    @FindBy(xpath = "(//h4[@class='card-title info'])[3]")
    private WebElement thirdCardTitle;

    @FindBy(xpath = "(//h4[@class='card-title info'])[4]")
    private WebElement fourthCardTitle;

    @FindBy(xpath = "(//h4[@class='card-title info'])[5]")
    private WebElement fifthCardTitle;

    @FindBy(id = "swal2-title")
    private WebElement successfullPaymentMessage;

    @FindBy(id = "CREATE")
    private WebElement createButton;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-up']")
    private WebElement yesButton;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-down']")
    private WebElement noButton;

    // Agreement Check
    @FindBy(id = "checkAgree")
    private WebElement agreementCheckbox;

    public void clickOnYesButton() {

        functions.waitForElementToBeClickable(yesButton);
        yesButton.click();
    }

    public void clickOnNoButton() {

        functions.waitForElementToBeClickable(noButton);
        noButton.click();
    }

    public void clickOnOwnedFleetChooseButton() {

        functions.waitForElementToBeClickable(ownedFleetChooseButton);
        ownedFleetChooseButton.click();
    }

    public void clickOnUnownedFleetChooseButton() {

        functions.waitForElementToBeClickable(unownedFleetChooseButton);
        unownedFleetChooseButton.click();
    }

    public void clickOnFirstAvailablePackageChooseButton() {

        functions.waitForElementToBeClickable(firstAvailablePackageChooseButton);
        firstAvailablePackageChooseButton.click();
    }

    public void clickOnAccessServiceChooseButton() {

        functions.waitForElementToBeClickable(accessServiceChooseButton);
        accessServiceChooseButton.click();
        functions.waitForPageToLoad();
    }

    public void clickOnCntrServiceChooseButton() {

        functions.waitForElementToBeClickable(cntrServiceChooseButton);
        cntrServiceChooseButton.click();
    }

    public WebElement getFirstCardTitle() {

        functions.waitForElementToBeVisible(firstCardTitle);
        return firstCardTitle;
    }

    public WebElement getSecondCardTitle() {

        functions.waitForElementToBeVisible(secondCardTitle);
        return secondCardTitle;
    }

    public WebElement getThirdCardTitle() {

        functions.waitForElementToBeVisible(thirdCardTitle);
        return thirdCardTitle;
    }

    public WebElement getSuccessPaymentMessage() {

        functions.waitForElementToBeVisible(successfullPaymentMessage);
        return successfullPaymentMessage;
    }

    public void clickOnFirstAvailablePackageChooseButtonOO() {

        functions.waitForElementToBeClickable(firstAvailablePackageChooseButtonOO);
        firstAvailablePackageChooseButtonOO.click();
    }

    public void clickOnFirstAvailablePackageChooseButtonSP() {

        functions.waitForElementToBeClickable(firstAvailablePackageChooseButtonSP);
        firstAvailablePackageChooseButtonSP.click();
    }

    ///////////////// Click on Agreement Checkbox  /////////////////

    public void checkAgreementCheckbox() {

        functions.waitForElementToBeClickable(agreementCheckbox);
        functions.waitForPageToLoad();
        agreementCheckbox.click();
    }

    ///////////////// Get Agreement Checkbox  /////////////////

    public WebElement getAgreementCheckbox() {

        functions.waitForElementToBeClickable(agreementCheckbox);
        return agreementCheckbox;
    }

    public WebElement getCreateButton() {

        functions.waitForElementToBeClickable(createButton);
        return createButton;
    }

    public void clickOnCreateButton() {

        functions.waitForElementToBeClickable(createButton);
        createButton.click();
    }
}
