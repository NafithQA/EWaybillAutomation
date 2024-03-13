package eWaybill.eWaybillTestCycle;

import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.EwaybillFormPage;
import eWaybill.pageModels.LoginPage;
import eWaybill.pageModels.SignUpPage;
import eWaybill.pageModels.StakeholdersRegistrationPage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class clearingAgentCycle extends Configurations {

    @Test(enabled = true)
    public void create_eWaybill() throws IOException, InterruptedException {
        Functions functions = new Functions();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        EwaybillFormPage ewaybillFormPage = new EwaybillFormPage(driver);
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        // Navigate To Qa URL
        functions.navigateToQaURL();

        // Login
        loginPage.fillInPhoneNumberField("88884444");
        loginPage.fillInPasswordField("Aa@123456");
        signUpPage.clickOnNextButton();
        loginPage.clickOnCreateEWayBillButton();

        // Fill in Sipper Information
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
        functions.scrollThePageUp();
        ewaybillFormPage.clickOnCreateEwaybillButton();
        ewaybillFormPage.clickOnConfirmButton();

        Thread.sleep(5000);
    }
}
