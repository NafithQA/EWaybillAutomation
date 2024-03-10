package commonSteps;

import eWaybill.helpers.DatabaseHandler;
import eWaybill.helpers.Functions;
import eWaybill.helpers.Queries.OtherQueries;
 import eWaybill.pageModels.StakeholdersRegistrationPage;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class StakeholderRegistrationSteps {
    WebDriver driver;
    public StakeholderRegistrationSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInRegistrationInfo(int Role) throws IOException, InterruptedException {

        Functions functions = new Functions();
         StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        Thread.sleep(750);
        stakeholdersRegistrationPage.clickOnBusinessActivityTypeDropDown();
        switch (Role) {
            case 1:
                stakeholdersRegistrationPage.clickOnClearingAgentOption();
                break;
            case 2:
                stakeholdersRegistrationPage.clickOnTruckingCompanyOption();
                break;
        }
        String ArabicName = String.valueOf("أتوميشن صاحب مصلحة " + functions.getRandomNameِAR());
        stakeholdersRegistrationPage.fillInCommercialNameInArabicField(ArabicName);
        Thread.sleep(750);
        String EnglishName = String.valueOf("stakeholders " + functions.getRandomNameEN());
        stakeholdersRegistrationPage.fillInCommercialNameInEnglishField(EnglishName);
        Thread.sleep(750);
        String randomCompanyRegistrationNumber = String.valueOf(functions.generateRandomNumber(6));
        stakeholdersRegistrationPage.fillInCompanyRegistrationNumberField(randomCompanyRegistrationNumber);
        functions.scrollThePageDown();
        functions.scrollThePageUp();
        stakeholdersRegistrationPage.clickOnCountryDropDown();
        stakeholdersRegistrationPage.clickOnGovernorateDropDown();
        stakeholdersRegistrationPage.clickOnMuscatOption();
        stakeholdersRegistrationPage.fillInAddressField("Muscat");
        String randomPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        stakeholdersRegistrationPage.fillInCompanyTelephoneNoField(randomPhoneNumber);
        functions.uploadAttachment(stakeholdersRegistrationPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        stakeholdersRegistrationPage.clickOnNextButton();
        String FullName = String.valueOf("automation user " + functions.getRandomNameEN());
        stakeholdersRegistrationPage.fillInFullNameField(FullName);
        stakeholdersRegistrationPage.clickOnUserNationalityDropDown();
        stakeholdersRegistrationPage.clickOnOmanOption();
        stakeholdersRegistrationPage.clickOnIdDocumentTypeDropDown();
        stakeholdersRegistrationPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        stakeholdersRegistrationPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        stakeholdersRegistrationPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        stakeholdersRegistrationPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(stakeholdersRegistrationPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        stakeholdersRegistrationPage.clickOnNextButton();
        Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
    }

    public void fillInRegistrationOwnerInfo() throws IOException, InterruptedException {
        Functions functions = new Functions();
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        Thread.sleep(750);
        stakeholdersRegistrationPage.clickOnBusinessActivityTypeDropDown();
        stakeholdersRegistrationPage.clickOnOwnerOption();
        String ArabicName = String.valueOf("أتوميشن صاحب مصلحة " + functions.getRandomNameِAR());
        stakeholdersRegistrationPage.fillInFullNameInArabicField(ArabicName);
        Thread.sleep(750);
        String EnglishName = String.valueOf("stakeholders " + functions.getRandomNameEN());
        stakeholdersRegistrationPage.fillInFullNameInEnglishField(EnglishName);
        stakeholdersRegistrationPage.clickOnCountryDropDown();
        stakeholdersRegistrationPage.clickOnMuscatOption();
        stakeholdersRegistrationPage.fillInAddressField("Muscat");
        stakeholdersRegistrationPage.clickOnNextButton();
        String FullName = String.valueOf("automation user " + functions.getRandomNameEN());
        stakeholdersRegistrationPage.fillInFullNameField(FullName);
        stakeholdersRegistrationPage.clickOnUserNationalityDropDown();
        stakeholdersRegistrationPage.clickOnOmanOption();
        stakeholdersRegistrationPage.clickOnIdDocumentTypeDropDown();
        stakeholdersRegistrationPage.clickOnPassportOption();
        String randomIdDocumentNumber = String.valueOf(functions.generateRandomNumber(12));
        stakeholdersRegistrationPage.fillInIdDocumentNoField(randomIdDocumentNumber);
        String randomAuthorizedManagerPhoneNumber = String.valueOf(functions.generateRandomNumber(10));
        stakeholdersRegistrationPage.fillInAuthorizedManagerMobileNoField(randomAuthorizedManagerPhoneNumber);
        stakeholdersRegistrationPage.fillInEmailField(functions.getRandomEmailString() + "@gmail.com");
        functions.scrollThePageDown();
        functions.uploadAttachment(stakeholdersRegistrationPage.getFirstAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg");
        functions.uploadAttachment(stakeholdersRegistrationPage.getSecondAttachmentButton(), System.getProperty("user.dir")
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img2.jpg");
        stakeholdersRegistrationPage.clickOnNextButton();
          Thread.sleep(5000);
        System.out.println(randomAuthorizedManagerPhoneNumber);
    }
    public void fillOTPFromDataBase () throws InterruptedException {
        Functions functions = new Functions();
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        Thread.sleep(5000);
        ArrayList<String> testData = databaseHandler.getOTPFromDataBase(OtherQueries.otpCodeQuery);
        String otpCode = testData.get(0);
        stakeholdersRegistrationPage.fillInVerificationCodeField(otpCode);
        stakeholdersRegistrationPage.clickOnNextButton();
        Thread.sleep(1000);
        String password = functions.generateRandomPassword();
        System.out.println("Password " + password);
        stakeholdersRegistrationPage.fillInNewPasswordField(password);
        System.out.println("Password " + password);
        stakeholdersRegistrationPage.fillInConfirmPasswordField(password);
        Thread.sleep(1000);
        stakeholdersRegistrationPage.clickOnNextButton();
        Thread.sleep(5000);
    }
}
