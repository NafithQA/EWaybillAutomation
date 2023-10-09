package eWaybill.base;

import eWaybill.helpers.DataLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.lang.reflect.Method;

public class Configurations {

    public static DataLoader dataLoader = new DataLoader();
    public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod()
    public void testSetup(String browserName, Method method) {

        // Browser Setup
        if (browserName.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Headless")) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void testTearDown() {

        // Driver Close
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
