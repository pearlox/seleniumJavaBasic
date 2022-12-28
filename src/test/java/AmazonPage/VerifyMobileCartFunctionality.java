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

import static utilities.SeleniumLibrary.driver;

public class VerifyMobileCartFunctionality {

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
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
