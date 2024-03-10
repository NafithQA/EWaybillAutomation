package eWaybill;

import eWaybill.base.Configurations;
import eWaybill.helpers.DatabaseHandler;
import eWaybill.helpers.Functions;
import eWaybill.helpers.PasswordGenerator;
import eWaybill.helpers.Queries.OtherQueries;
import eWaybill.pageModels.LoginPage;
import eWaybill.pageModels.SignUpPage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RegistrationTests extends Configurations {

    @Test(enabled = false)
    public void freightForwarderRoleRegistration() throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        loginPage.clickOnSignUpButton();
        signUpPage.fillInCommercialNameInArabicField("عمران");
        signUpPage.fillInCommercialNameInEnglishField("Emran");
        String randomCompanyRegistrationNumber = String.valueOf(functions.generateRandomNumber(6));
        signUpPage.fillInCompanyRegistrationNumberField(randomCompanyRegistrationNumber);
        signUpPage.clickOnBusinessActivityTypeDropDown();
        signUpPage.clickOnFreightForwarderOption();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        functions.scrollThePageUp();
        signUpPage.clickOnCountryDropDown();
        signUpPage.clickOnGovernorateDropDown();
        signUpPage.clickOnMuscatOption();
        signUpPage.fillInAddressField("Muscat");
        String randomPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInCompanyTelephoneNoField(randomPhoneNumber);
        signUpPage.clickOnNextButton();
        signUpPage.fillInFullNameField("Al Shefaa User");
        signUpPage.clickOnUserNationalityDropDown();
        signUpPage.clickOnOmanOption();
        signUpPage.clickOnIdDocumentTypeDropDown();
        signUpPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        signUpPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        signUpPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(signUpPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        signUpPage.clickOnNextButton();
        Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
<<<<<<< Updated upstream
        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
        String otpCode = testData.get(0);
        signUpPage.fillInVerificationCodeField(otpCode);
        signUpPage.clickOnNextButton();

        String randomPassword = PasswordGenerator.generateRandomPassword(10);
        signUpPage.fillInNewPasswordField(randomPassword);
        signUpPage.fillInConfirmPasswordField(randomPassword);
        signUpPage.clickOnNextButton();
=======
      //  ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
      //  String otpCode = testData.get(0);
       // signUpPage.fillInVerificationCodeField(otpCode);
       // signUpPage.clickOnNextButton();

//        String randomPassword = PasswordGenerator.generateRandomPassword(10);
//        signUpPage.fillInNewPasswordField(randomPassword);
//        signUpPage.fillInConfirmPasswordField(randomPassword);
//        signUpPage.clickOnNextButton();
>>>>>>> Stashed changes

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void truckingBrokerRoleRegistration() throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        loginPage.clickOnSignUpButton();
        signUpPage.fillInCommercialNameInArabicField("عمران");
        signUpPage.fillInCommercialNameInEnglishField("Emran");
        String randomCompanyRegistrationNumber = String.valueOf(functions.generateRandomNumber(6));
        signUpPage.fillInCompanyRegistrationNumberField(randomCompanyRegistrationNumber);
        signUpPage.clickOnBusinessActivityTypeDropDown();
        signUpPage.clickOnTruckingBrokerOption();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        functions.scrollThePageUp();
        signUpPage.clickOnCountryDropDown();
        signUpPage.clickOnGovernorateDropDown();
        signUpPage.clickOnMuscatOption();
        signUpPage.fillInAddressField("Muscat");
        String randomPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInCompanyTelephoneNoField(randomPhoneNumber);
        signUpPage.clickOnNextButton();
        signUpPage.fillInFullNameField("Al Shefaa User");
        signUpPage.clickOnUserNationalityDropDown();
        signUpPage.clickOnOmanOption();
        signUpPage.clickOnIdDocumentTypeDropDown();
        signUpPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        signUpPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        signUpPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(signUpPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        signUpPage.clickOnNextButton();
        Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
<<<<<<< Updated upstream
        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
        String otpCode = testData.get(0);
        signUpPage.fillInVerificationCodeField(otpCode);
        signUpPage.clickOnNextButton();

        String randomPassword = PasswordGenerator.generateRandomPassword(10);
        signUpPage.fillInNewPasswordField(randomPassword);
        signUpPage.fillInConfirmPasswordField(randomPassword);
        signUpPage.clickOnNextButton();
=======
//        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
//        String otpCode = testData.get(0);
//        signUpPage.fillInVerificationCodeField(otpCode);
//        signUpPage.clickOnNextButton();
//
//        String randomPassword = PasswordGenerator.generateRandomPassword(10);
//        signUpPage.fillInNewPasswordField(randomPassword);
//        signUpPage.fillInConfirmPasswordField(randomPassword);
//        signUpPage.clickOnNextButton();
>>>>>>> Stashed changes

        Thread.sleep(5000);
    }

    @Test(enabled = true)
    public void clearingAgentRoleRegistration() throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        loginPage.clickOnSignUpButton();
        signUpPage.fillInCommercialNameInArabicField("عمران");
        signUpPage.fillInCommercialNameInEnglishField("Emran");
        String randomCompanyRegistrationNumber = String.valueOf(functions.generateRandomNumber(6));
        signUpPage.fillInCompanyRegistrationNumberField(randomCompanyRegistrationNumber);
        signUpPage.clickOnBusinessActivityTypeDropDown();
        signUpPage.clickOnClearingAgentOption();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        functions.scrollThePageUp();
        signUpPage.clickOnCountryDropDown();
        signUpPage.clickOnGovernorateDropDown();
        signUpPage.clickOnMuscatOption();
        signUpPage.fillInAddressField("Muscat");
        String randomPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInCompanyTelephoneNoField(randomPhoneNumber);
        signUpPage.clickOnNextButton();
        signUpPage.fillInFullNameField("Al Shefaa User");
        signUpPage.clickOnUserNationalityDropDown();
        signUpPage.clickOnOmanOption();
        signUpPage.clickOnIdDocumentTypeDropDown();
        signUpPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        signUpPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        signUpPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(signUpPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        signUpPage.clickOnNextButton();
        Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
<<<<<<< Updated upstream
        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
        String otpCode = testData.get(0);
        signUpPage.fillInVerificationCodeField(otpCode);
        signUpPage.clickOnNextButton();

        String randomPassword = PasswordGenerator.generateRandomPassword(10);
        signUpPage.fillInNewPasswordField(randomPassword);
        signUpPage.fillInConfirmPasswordField(randomPassword);
        signUpPage.clickOnNextButton();

        Thread.sleep(5000);
=======
//       ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
//       String otpCode = testData.get(0);
//       signUpPage.fillInVerificationCodeField(otpCode);
//        signUpPage.clickOnNextButton();
//
//        String randomPassword = PasswordGenerator.generateRandomPassword(10);
//       signUpPage.fillInNewPasswordField(randomPassword);
//      signUpPage.fillInConfirmPasswordField(randomPassword);
//       signUpPage.clickOnNextButton();
//
//       Thread.sleep(5000);
>>>>>>> Stashed changes
    }

    @Test(enabled = false)
    public void truckingCompanyRoleRegistration() throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        loginPage.clickOnSignUpButton();
        signUpPage.fillInCommercialNameInArabicField("عمران");
        signUpPage.fillInCommercialNameInEnglishField("Emran");
        String randomCompanyRegistrationNumber = String.valueOf(functions.generateRandomNumber(6));
        signUpPage.fillInCompanyRegistrationNumberField(randomCompanyRegistrationNumber);
        signUpPage.clickOnBusinessActivityTypeDropDown();
        signUpPage.clickOnTruckingCompanyOption();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.scrollThePageDown();
        signUpPage.clickOnNextButton();
        functions.scrollThePageUp();
        signUpPage.clickOnCountryDropDown();
        signUpPage.clickOnGovernorateDropDown();
        signUpPage.clickOnMuscatOption();
        signUpPage.fillInAddressField("Muscat");
        String randomPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInCompanyTelephoneNoField(randomPhoneNumber);
        signUpPage.clickOnNextButton();
        signUpPage.fillInFullNameField("Al Shefaa User");
        signUpPage.clickOnUserNationalityDropDown();
        signUpPage.clickOnOmanOption();
        signUpPage.clickOnIdDocumentTypeDropDown();
        signUpPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        signUpPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        signUpPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        signUpPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(signUpPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(signUpPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        signUpPage.clickOnNextButton();
        Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
<<<<<<< Updated upstream
        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
        String otpCode = testData.get(0);
        signUpPage.fillInVerificationCodeField(otpCode);
        signUpPage.clickOnNextButton();

        String randomPassword = PasswordGenerator.generateRandomPassword(10);
        signUpPage.fillInNewPasswordField(randomPassword);
        signUpPage.fillInConfirmPasswordField(randomPassword);
        signUpPage.clickOnNextButton();
=======
//        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery(randomAuthorizedManagerPhoneNumber));
//        String otpCode = testData.get(0);
//        signUpPage.fillInVerificationCodeField(otpCode);
//        signUpPage.clickOnNextButton();
//
//        String randomPassword = PasswordGenerator.generateRandomPassword(10);
//        signUpPage.fillInNewPasswordField(randomPassword);
//        signUpPage.fillInConfirmPasswordField(randomPassword);
//        signUpPage.clickOnNextButton();
>>>>>>> Stashed changes

        Thread.sleep(5000);
    }
}
