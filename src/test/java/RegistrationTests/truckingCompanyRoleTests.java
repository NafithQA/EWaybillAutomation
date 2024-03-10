package RegistrationTests;

import commonSteps.StakeholderRegistrationSteps;
import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.StakeholdersRegistrationPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class truckingCompanyRoleTests extends Configurations {

    @Test(enabled = true)
    public void External_Trucking_Company_Registration() throws IOException, InterruptedException {
          Functions functions = new Functions();
          StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
          StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

          // Navigate To Qa URL
          functions.navigateToQaURL();

          //Sign Up Button
          stakeholdersRegistrationPage.clickOnSignUpButton();

          // Fill-In Investors Registration Info
          stakeholderRegistrationSteps.fillInRegistrationInfo(2);

         // Check the OTP
          stakeholderRegistrationSteps.fillOTPFromDataBase();
    }
}
