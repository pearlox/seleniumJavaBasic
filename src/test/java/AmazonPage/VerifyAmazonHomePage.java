package AmazonPage;

import functionalities.HomePageFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumLibrary;

import java.time.Duration;

public class VerifyAmazonHomePage {

    public WebDriver driver;
    public HomePageFunctionalities homePageFunctionalities;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
    }

    @BeforeTest
    public void beforeTest() {
        SeleniumLibrary.initialization();
        homePageFunctionalities = new HomePageFunctionalities();
    }

    @Test
    public void verifyIconsInHomePage() {

        driver.get("https://www.amazon.in/");
        boolean cartIsDisplayed = homePageFunctionalities.verifyCartIcon();
        Assert.assertTrue(cartIsDisplayed);


        homePageFunctionalities.verifyMobileIcon();
        homePageFunctionalities.verifyReturnAndOrderIcon();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
