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

    @FindBy(xpath = "//*[text()='Accept eWaybill']")
    private WebElement acceptEwaybillButton;

    @FindBy(xpath = "//*[text()='Reject eWaybill']")
    private WebElement rejectEwaybillButton;

    @FindBy(xpath = "//*[text()='Cancel eWaybill']")
    private WebElement cancelEwaybillButton;

    @FindBy(xpath = "//*[text()='Confirm']")
    private WebElement confirmButton;

    // Trucking Company Information

    @FindBy(xpath = "//input[@aria-label='Vehicle Nationality']")
    private WebElement vehicleNationalityDropDown;

    @FindBy(xpath = "//input[@aria-label='Vehicle Class']")
    private WebElement vehicleClassDropDown;

    @FindBy(xpath = "//*[text()='Heavy Truck']")
    private WebElement heavyTruckOption;

    @FindBy(xpath = "(//input[@aria-label='Code'])[1]")
    private WebElement truckPlateNumberCodeDropDown;

    @FindBy(xpath = "//*[text()='A']")
    private WebElement firstPlateCodeOption;

    @FindBy(xpath = "//input[@name='truckPlateNumber']")
    private WebElement truckPlateNumberField;

    @FindBy(xpath = "(//input[@aria-label='Code'])[2]")
    private WebElement trailerPlateNumberCodeDropDown;

    @FindBy(xpath = "//input[@name='trailerPlateNumber']")
    private WebElement trailerPlateNumberField;

    @FindBy(xpath = "//input[@aria-label='Trailer Type']")
    private WebElement trailerTypeDropDown;

    @FindBy(xpath = "//input[@aria-label='Driver Nationality']")
    private WebElement driverNationalityDropDown;

    @FindBy(xpath = "//input[@name='driverName']")
    private WebElement driverNameField;

    @FindBy(xpath = "//input[@aria-label='Dial Code']")
    private WebElement countryCodeDropDown;

    @FindBy(xpath = "//input[@name='driverMobileNumber']")
    private WebElement driverMobileNumberField;

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

    public void clickOnVehicleNationalityDropDown() {

        functions.waitForElementToBeClickable(vehicleNationalityDropDown);
        vehicleNationalityDropDown.click();
    }

    public void fillInVehicleNationalityDropDown(String vehicleNationality) {

        functions.waitForElementToBeClickable(vehicleNationalityDropDown);
        vehicleNationalityDropDown.sendKeys(vehicleNationality);
    }

    public void clickOnVehicleClassDropDown() {

        functions.waitForElementToBeClickable(vehicleClassDropDown);
        vehicleClassDropDown.click();
    }

    public void fillInVehicleClassDropDown(String vehicleClass) {

        functions.waitForElementToBeClickable(vehicleClassDropDown);
        vehicleClassDropDown.sendKeys(vehicleClass);
    }

    public void clickOnHeavyTruckOption() {

        functions.waitForElementToBeClickable(heavyTruckOption);
        heavyTruckOption.click();
    }

    public void clickOnTruckPlateCodeDropDown() {

        functions.waitForElementToBeClickable(truckPlateNumberCodeDropDown);
        truckPlateNumberCodeDropDown.click();
    }

    public void fillInTruckPlateCodeDropDown(String truckPlateCode) {

        functions.waitForElementToBeClickable(truckPlateNumberCodeDropDown);
        truckPlateNumberCodeDropDown.sendKeys(truckPlateCode);
    }

    public void clickOnFirstPlateCodeOption() {

        functions.waitForElementToBeClickable(firstPlateCodeOption);
        firstPlateCodeOption.click();
    }

    public void fillInTruckPlateNumberField(String truckPlateNumber) {

        functions.waitForElementToBeClickable(truckPlateNumberField);
        truckPlateNumberField.sendKeys(truckPlateNumber);
    }

    public void clickOnTrailerPlateCodeDropDown() {

        functions.waitForElementToBeClickable(trailerPlateNumberCodeDropDown);
        trailerPlateNumberCodeDropDown.click();
    }

    public void fillInTrailerPlateCodeDropDown(String trailerPlateCode) {

        functions.waitForElementToBeClickable(trailerPlateNumberCodeDropDown);
        trailerPlateNumberCodeDropDown.sendKeys(trailerPlateCode);
    }

    public void fillInTrailerPlateNumberField(String trailerPlateNumber) {

        functions.waitForElementToBeClickable(trailerPlateNumberField);
        trailerPlateNumberField.sendKeys(trailerPlateNumber);
    }

    public void clickOnTrailerTypeDropDown() {

        functions.waitForElementToBeClickable(trailerTypeDropDown);
        trailerTypeDropDown.click();
    }

    public void fillInTrailerTypeDropDown(String trailerType) {

        functions.waitForElementToBeClickable(trailerTypeDropDown);
        trailerTypeDropDown.sendKeys(trailerType);
    }

    public void fillInDriverNameField(String driverName) {

        functions.waitForElementToBeClickable(driverNameField);
        driverNameField.sendKeys(driverName);
    }

    public void fillInDriverMobileNumberField(String driverMobileNumber) {

        functions.waitForElementToBeClickable(driverMobileNumberField);
        driverMobileNumberField.sendKeys(driverMobileNumber);
    }

    public void clickOnAcceptEwaybillButton() {

        functions.waitForElementToBeClickable(acceptEwaybillButton);
        acceptEwaybillButton.click();
    }

    public void clickOnRejectEwaybillButton() {

        functions.waitForElementToBeClickable(rejectEwaybillButton);
        rejectEwaybillButton.click();
    }

    public void clickOnCancelEwaybillButton() {

        functions.waitForElementToBeClickable(cancelEwaybillButton);
        cancelEwaybillButton.click();
    }
}
