package eWaybill;

import eWaybill.base.Configurations;
import eWaybill.helpers.Functions;
import eWaybill.pageModels.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationTests extends Configurations {

    @Test(enabled = true)
    public void freightForwarderRoleRegistration () throws IOException, InterruptedException {

        Functions functions = new Functions();
        functions.navigateToQaURL();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnSignUpButton();



        Thread.sleep(4000);
    }
}

