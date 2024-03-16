package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EwaybillGridScreen {

    private Functions functions = new Functions();
    WebDriver driver;

    public EwaybillGridScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()='Under Review'])[1]")
    private WebElement underReviewLabel;

    @FindBy(xpath = "//span[@title='View eWaybill']")
    private WebElement viewEwaybillButton;

    public void clickOnCreateEWayBillButton() {

        functions.waitForElementToBeClickable(underReviewLabel);
        WebElement getADemo=driver.findElement(By.tagName("button"));

    }

}
