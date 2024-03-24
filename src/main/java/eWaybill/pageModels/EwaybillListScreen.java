package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EwaybillListScreen {

    private Functions functions = new Functions();

    public EwaybillListScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()='Under Review'])[1]")
    private WebElement underReviewLabel;

    @FindBy(xpath = "(//span[@title='View eWaybill'])[1]")
    private WebElement viewFirstEwaybillButton;

    @FindBy(xpath = "//*[text()='Status']")
    private WebElement statusSortButton;

    public void clickOnStatusSortButton() {

        functions.waitForElementToBeClickable(statusSortButton);
        statusSortButton.click();
    }

    public void clickViewFirstEwaybillButton() {

        functions.waitForElementToBeClickable(viewFirstEwaybillButton);
        viewFirstEwaybillButton.click();
    }
}
