package eWaybill;

import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.LoginPage;
import eWaybill.pageModels.SignUpPage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class RegistrationTests extends Configurations {

    @Test(enabled = true)
    public void freightForwarderRoleRegistration() throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

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
    }
}
