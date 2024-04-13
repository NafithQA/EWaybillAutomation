package eWaybill.eWaybillTestCycle;

import apiHandler.ApiHandler;
import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class clearingAgentCycle extends Configurations {

    @Test(enabled = false, priority = 0)
    public void create_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        EwaybillHomeScreen ewaybillHomeScreen = new EwaybillHomeScreen(driver);

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login as Clearing Agent
        loginPage.fillInPhoneNumberField(dataLoader.credentialsData("clearingAgentUSer"));
        loginPage.fillInPasswordField(dataLoader.credentialsData("commonLoginPassword"));
        signUpPage.clickOnNextButton();
        ewaybillHomeScreen.clickOnCreateEWayBillButton();

        // Fill in Shipper Information
        ewaybillFormPage.clickOnTruckingCompanyDropDown();
        ewaybillFormPage.fillInTruckingCompanyDropDown("Shefaa");
        ewaybillFormPage.clickOnShefaaTCOption();
        ewaybillFormPage.fillInShipperNameField("Salem Ahmad");
        ewaybillFormPage.clickOnCountryDropDown();
        ewaybillFormPage.fillInCountryDropDown("Oman");
        ewaybillFormPage.clickOnOmanOption();
        ewaybillFormPage.fillInPhoneNumberField("125551788");
        ewaybillFormPage.clickOnDischargeLocationDropDown();
        ewaybillFormPage.fillInDischargeLocationDropDown("Other");
        ewaybillFormPage.clickOnOtherOption();
        ewaybillFormPage.fillInDischargeAddressDropDown("Amman");
        ewaybillFormPage.clickOnDateTimeField();
        ewaybillFormPage.clickOnFirstAvailableDateOption();
        ewaybillFormPage.clickOnOkButton();
        signUpPage.clickOnNextButton();

        // Fill in Shipment Information
        ewaybillFormPage.clickOnTypeOfGoodsDropDown();
        ewaybillFormPage.fillInTypeOfGoodsDropDown("Containers");
        ewaybillFormPage.clickOnContainersOption();
        ewaybillFormPage.fillInNumberOfPackages("75");
        ewaybillFormPage.fillInDescriptionOfGoodsField("Gas");
        ewaybillFormPage.fillInValueOfGoodsField("100000");
        functions.scrollThePageDown();
        ewaybillFormPage.clickOnDateTimeField();
        ewaybillFormPage.clickOnFirstAvailableDateOption();
        signUpPage.clickOnNextButton();

        // Skip Insurance Information's
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();

        // Skip Demurrage Information's
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        Thread.sleep(2000);

        // Upload Attachments
        functions.uploadAttachment(stakeholdersRegistrationPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getThirdAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");

        // Confirm eWaybill Creation
        functions.scrollThePageUp();
        ewaybillFormPage.clickOnCreateEwaybillButton();
        ewaybillFormPage.clickOnConfirmButton();

        Thread.sleep(3000);
    }

    @Test(enabled = false, priority = 1)
    public void accept_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillHomeScreen ewaybillHomeScreen = new EwaybillHomeScreen(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        CommonLocators commonLocators = new CommonLocators(driver);

        // Create eWaybill through API
        ApiHandler.createEwaybill();

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login as Trucking Company
        loginPage.fillInPhoneNumberField(dataLoader.credentialsData("truckingCompanyUser1"));
        loginPage.fillInPasswordField(dataLoader.credentialsData("commonLoginPassword"));
        signUpPage.clickOnNextButton();

        // Navigate to EWaybills List & Sort
        ewaybillHomeScreen.hoverOverEWayBillsButton();
        ewaybillHomeScreen.clickOnEWaybillsListOption();
        Thread.sleep(5000);

        // Search for an eWaybill with its status as "Under Review"
        clearingAgentCycle.findEwaybillWithSpecificStatus("Under Review");
        commonLocators.clickOnContinueButton();

        // Fill in Trucking Company Information's
        ewaybillFormPage.clickOnVehicleClassDropDown();
        ewaybillFormPage.fillInVehicleClassDropDown("Heavy Truck");
        ewaybillFormPage.clickOnHeavyTruckOption();
        ewaybillFormPage.clickOnTruckPlateCodeDropDown();
        ewaybillFormPage.fillInTruckPlateCodeDropDown("A");
        ewaybillFormPage.clickOnFirstPlateCodeOption();
        ewaybillFormPage.fillInTruckPlateNumberField("65214");
        ewaybillFormPage.fillInDriverNameField("Ahmad Ali");
        ewaybillFormPage.fillInDriverMobileNumberField("80808080");
        commonLocators.clickOnNextButton();

        // Skip Insurance Information's
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();

        // Skip Demurrage Information's
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        Thread.sleep(3000);

        // Upload Attachments
        functions.uploadAttachment(stakeholdersRegistrationPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getThirdAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");

        // Accept eWaybill Creation
        functions.scrollThePageUp();
        ewaybillFormPage.clickOnAcceptEwaybillButton();
        ewaybillFormPage.clickOnConfirmButton();

        Thread.sleep(3000);
    }

    @Test(enabled = false, priority = 2)
    public void reject_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillHomeScreen ewaybillHomeScreen = new EwaybillHomeScreen(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);

        // Create eWaybill through API
        ApiHandler.createEwaybill();

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login as Trucking Company
        loginPage.fillInPhoneNumberField(dataLoader.credentialsData("truckingCompanyUser1"));
        loginPage.fillInPasswordField(dataLoader.credentialsData("commonLoginPassword"));
        signUpPage.clickOnNextButton();

        // Navigate to EWaybills List & Sort
        ewaybillHomeScreen.hoverOverEWayBillsButton();
        ewaybillHomeScreen.clickOnEWaybillsListOption();
        Thread.sleep(5000);

        // Search for an eWaybill with its status as "Under Review"
        clearingAgentCycle.findEwaybillWithSpecificStatus("Under Review");

        // Accept eWaybill Creation
        functions.scrollThePageUp();
        ewaybillFormPage.clickOnRejectEwaybillButton();
        ewaybillFormPage.clickOnConfirmButton();

        Thread.sleep(3000);
    }

    @Test(enabled = false, priority = 3)
    public void cancel_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);
        EwaybillHomeScreen ewaybillHomeScreen = new EwaybillHomeScreen(driver);

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login as Clearing Agent
        loginPage.fillInPhoneNumberField(dataLoader.credentialsData("clearingAgentUSer"));
        loginPage.fillInPasswordField(dataLoader.credentialsData("commonLoginPassword"));
        signUpPage.clickOnNextButton();

        
        // Navigate to EWaybills List & Sort
        ewaybillHomeScreen.hoverOverEWayBillsButton();
        ewaybillHomeScreen.clickOnEWaybillsListOption();
        Thread.sleep(5000);

        // Search for an eWaybill with its status as "Active"
        clearingAgentCycle.findEwaybillWithSpecificStatus("Active");

        // Accept eWaybill Creation
        functions.scrollThePageUp();
        ewaybillFormPage.clickOnCancelEwaybillButton();
        ewaybillFormPage.clickOnConfirmButton();

        Thread.sleep(3000);
    }

    @Test(enabled = true, priority = 3)
    public void confirm_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);
        EwaybillHomeScreen ewaybillHomeScreen = new EwaybillHomeScreen(driver);

        // Create eWaybill through Create API
        String eWaybillId = ApiHandler.createEwaybill();

        // Accept eWaybill through Accept API
        ApiHandler.acceptEwaybill(eWaybillId);

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login as Clearing Agent
        loginPage.fillInPhoneNumberField(dataLoader.credentialsData("clearingAgentUSer"));
        loginPage.fillInPasswordField(dataLoader.credentialsData("commonLoginPassword"));
        signUpPage.clickOnNextButton();

        // Navigate to EWaybills List & Sort
        ewaybillHomeScreen.hoverOverEWayBillsButton();
        ewaybillHomeScreen.clickOnEWaybillsListOption();
        Thread.sleep(5000);

        // Search for an eWaybill with its status as "Active"
        clearingAgentCycle.findEwaybillWithSpecificStatus("Pending Approval");


        Thread.sleep(3000);
    }

    public static void findEwaybillWithSpecificStatus(String elementText) throws InterruptedException {
        EwaybillListScreen ewaybillListScreen = new EwaybillListScreen(driver);

        // Loop through "Status" Column Cells to Find the Cell Index of "Under Review" Status
        List<WebElement> eWaybillStatusColumnElements = driver.findElements(By.xpath("//td[7]"));
        outerLoop:
        for (int sortCount = 0; sortCount < 5; sortCount++) {
            ewaybillListScreen.clickOnStatusSortButton();
            Thread.sleep(3000);
            for (int i = 0; i < eWaybillStatusColumnElements.size(); i++) {
                System.out.println("Element in cell " + i + " is " + eWaybillStatusColumnElements.get(i).getText());
                if (eWaybillStatusColumnElements.get(i).getText().equalsIgnoreCase(elementText)) {
                    i++;
                    driver.findElement(By.xpath("(//span[@title='View eWaybill'])[" + i + "]")).click();
                    break outerLoop;
                }
            }
        }
    }
}