package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EwaybillHomeScreen {

    private Functions functions = new Functions();

    public EwaybillHomeScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Create eWaybill']")
    private WebElement createEWayBillButton;

    @FindBy(xpath = "//*[text()='eWaybills']")
    private WebElement eWaybillsButton;

    @FindBy(xpath = "//*[text()='eWaybills list']")
    private WebElement eWaybillsListOption;


    public void clickOnCreateEWayBillButton() {

        functions.waitForElementToBeClickable(createEWayBillButton);
        createEWayBillButton.click();
    }

    public void hoverOverEWayBillsButton() throws InterruptedException {

        functions.waitForElementToBeClickable(eWaybillsButton);
        functions.moveToElement(eWaybillsButton);
    }

    public void clickOnEWaybillsListOption() {

        functions.waitForElementToBeClickable(eWaybillsListOption);
        eWaybillsListOption.click();
    }


}
