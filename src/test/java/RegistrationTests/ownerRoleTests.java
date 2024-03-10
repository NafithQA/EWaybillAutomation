package RegistrationTests;

import commonSteps.StakeholderRegistrationSteps;
import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.StakeholdersRegistrationPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class ownerRoleTests extends Configurations {

    @Test(enabled = true)
    public void External_Owner_Registration() throws IOException, InterruptedException {
          Functions functions = new Functions();
          StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
          StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

          // Navigate To Qa URL
          functions.navigateToQaURL();

          //Sign Up Button
          stakeholdersRegistrationPage.clickOnSignUpButton();

          // Fill-In Investors Registration Info
          stakeholderRegistrationSteps.fillInRegistrationOwnerInfo();

         // Check the OTP
         stakeholderRegistrationSteps.fillOTPFromDataBase();

    }
}
