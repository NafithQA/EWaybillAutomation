package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static eWaybill.base.Configurations.driver;

public class SignUpPage {

    private Functions functions = new Functions();

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Commercial Name in Arabic']")
    private WebElement commercialNameInArabicField;

    @FindBy(xpath = "//input[@placeholder='Commercial Name in English']")
    private WebElement commercialNameInEnglishField;

    @FindBy(name = "companyRegistrationNo")
    private WebElement companyRegistrationNumberField;

    @FindBy(xpath = "//div[@class='select__input-container css-136ehom']")
    private WebElement businessActivityTypeDropDown;

    @FindBy(xpath = "//*[text()='Freight Forwarder']")
    private WebElement freightForwarderOption;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement browseFileButton;

    public void fillInCommercialNameInArabicField(String text) {

        functions.waitForElementToBeClickable(commercialNameInArabicField);
        commercialNameInArabicField.sendKeys(text);
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

    public void clickOnCompanyRegistrationCertificateBrowseFileButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
    }
}
