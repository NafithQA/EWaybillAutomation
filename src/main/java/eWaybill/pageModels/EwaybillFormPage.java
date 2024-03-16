package eWaybill.pageModels;

import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EwaybillFormPage {

    private Functions functions = new Functions();

    public EwaybillFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@aria-label='Trucking Company']")
    private WebElement truckingCompanyDropDown;

    @FindBy(xpath = "//input[@aria-label='Country']")
    private WebElement countryDropDown;

    @FindBy(xpath = "//*[text()='1233210203 - Shefaa test']")
    private WebElement shefaaTCOption;

    @FindBy(xpath = "//*[text()='Oman']")
    private WebElement omanOption;

    @FindBy(xpath = "//*[text()='Other']")
    private WebElement otherOption;

    @FindBy(xpath = "//input[@name='consigneeStakeholderName']")
    private WebElement shipperNameField;

    @FindBy(xpath = "//input[@name='consigneeMobileNo']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@aria-label='Discharge Location']")
    private WebElement dischargeLocationDropDown;

    @FindBy(xpath = "//input[@name='dischargeAddressText']")
    private WebElement dischargeAddressField;

    @FindBy(xpath = "//input[@name='dateTime']")
    private WebElement dateTimeField;

    @FindBy(xpath = "(//button[@tabindex='0'])[3]")
    private WebElement firstAvailableDateOption;

    @FindBy(xpath = "//*[text()='OK']")
    private WebElement okButton;

    @FindBy(xpath = "//input[@aria-label='Type Of Goods']")
    private WebElement typeOfGoodsDropDown;

    @FindBy(xpath = "//*[text()='Containers']")
    private WebElement containersOption;

    @FindBy(xpath = "//input[@name='numberOfPackages']")
    private WebElement numberOfPackagesField;

    @FindBy(xpath = "//input[@name='descriptionOfGoods']")
    private WebElement descriptionOfGoodsField;

    @FindBy(xpath = "//input[@name='valueOfGoods']")
    private WebElement valueOfGoodsField;

    @FindBy(xpath = "//*[text()='Create eWaybill']")
    private WebElement createEwaybillButton;

    @FindBy(xpath = "//*[text()='Confirm']")
    private WebElement confirmButton;

    public void clickOnTruckingCompanyDropDown() {

        functions.waitForElementToBeClickable(truckingCompanyDropDown);
        truckingCompanyDropDown.click();
    }

    public void fillInTruckingCompanyDropDown(String truckingCompany) {

        functions.waitForElementToBeClickable(truckingCompanyDropDown);
        truckingCompanyDropDown.sendKeys(truckingCompany);
    }

    public void clickOnShefaaTCOption() {

        functions.waitForElementToBeClickable(shefaaTCOption);
        shefaaTCOption.click();
    }

    public void fillInShipperNameField(String shipperName) {

        functions.waitForElementToBeClickable(shipperNameField);
        shipperNameField.sendKeys(shipperName);
    }

    public void clickOnCountryDropDown() {

        functions.waitForElementToBeClickable(countryDropDown);
        countryDropDown.click();
    }

    public void fillInCountryDropDown(String country) {

        functions.waitForElementToBeClickable(countryDropDown);
        countryDropDown.sendKeys(country);
    }

    public void clickOnOmanOption() {

        functions.waitForElementToBeClickable(omanOption);
        omanOption.click();
    }

    public void fillInPhoneNumberField(String phoneNumber) {

        functions.waitForElementToBeClickable(phoneNumberField);
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void clickOnDischargeLocationDropDown() {

        functions.waitForElementToBeClickable(dischargeLocationDropDown);
        dischargeLocationDropDown.click();
    }

    public void fillInDischargeLocationDropDown(String dischargeLocation) {

        functions.waitForElementToBeClickable(dischargeLocationDropDown);
        dischargeLocationDropDown.sendKeys(dischargeLocation);
    }

    public void clickOnOtherOption() {

        functions.waitForElementToBeClickable(otherOption);
        otherOption.click();
    }

    public void fillInDischargeAddressDropDown(String dischargeAddress) {

        functions.waitForElementToBeClickable(dischargeAddressField);
        dischargeAddressField.sendKeys(dischargeAddress);
    }

    public void clickOnDateTimeField() {

        functions.waitForElementToBeClickable(dateTimeField);
        dateTimeField.click();
    }

    public void clickOnFirstAvailableDateOption() {

        functions.waitForElementToBeClickable(firstAvailableDateOption);
        firstAvailableDateOption.click();
    }

    public void clickOnOkButton() {

        functions.waitForElementToBeClickable(okButton);
        okButton.click();
    }

    public void clickOnTypeOfGoodsDropDown() {

        functions.waitForElementToBeClickable(typeOfGoodsDropDown);
        typeOfGoodsDropDown.click();
    }

    public void fillInTypeOfGoodsDropDown(String typeOfGoods) {

        functions.waitForElementToBeClickable(typeOfGoodsDropDown);
        typeOfGoodsDropDown.sendKeys(typeOfGoods);
    }

    public void clickOnContainersOption() {

        functions.waitForElementToBeClickable(containersOption);
        containersOption.click();
    }

    public void fillInNumberOfPackages(String numberOfPackages) {

        functions.waitForElementToBeClickable(numberOfPackagesField);
        numberOfPackagesField.sendKeys(numberOfPackages);
    }

    public void fillInDescriptionOfGoodsField(String descriptionOfGoods) {

        functions.waitForElementToBeClickable(descriptionOfGoodsField);
        descriptionOfGoodsField.sendKeys(descriptionOfGoods);
    }

    public void fillInValueOfGoodsField(String valueOfGoods) {

        functions.waitForElementToBeClickable(valueOfGoodsField);
        valueOfGoodsField.sendKeys(valueOfGoods);
    }

    public void clickOnCreateEwaybillButton() {

        functions.waitForElementToBeClickable(createEwaybillButton);
        createEwaybillButton.click();
    }

    public void clickOnConfirmButton() {

        functions.waitForElementToBeClickable(confirmButton);
        confirmButton.click();
    }
}
