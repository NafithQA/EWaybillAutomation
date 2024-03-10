package RegistrationTests;

import commonSteps.StakeholderRegistrationSteps;
import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.StakeholdersRegistrationPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class clearingAgentRoleTests extends Configurations {

    @Test(enabled = true)
    public void External_Clearing_Agent_Registration() throws IOException, InterruptedException {
          Functions functions = new Functions();
          StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
          StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

          // Navigate To Qa URL
          functions.navigateToQaURL();

          //Sign Up Button
          stakeholdersRegistrationPage.clickOnSignUpButton();

          // Fill-In Investors Registration Info
          stakeholderRegistrationSteps.fillInRegistrationInfo(1);

         // Check the OTP
          stakeholderRegistrationSteps.fillOTPFromDataBase();
    }
}
