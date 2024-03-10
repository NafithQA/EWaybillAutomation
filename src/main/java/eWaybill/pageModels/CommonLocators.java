package eWaybill.pageModels;

import eWaybill.helpers.DataLoader;
import eWaybill.helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonLocators {

    private Functions functions = new Functions();
    private DataLoader dataLoader = new DataLoader();

    public CommonLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
