package eWaybill;

import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.LoginPage;
import eWaybill.pageModels.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
        signUpPage.clickOnCompanyRegistrationCertificateBrowseFileButton();

        Thread.sleep(4000);
    }
}
