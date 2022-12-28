package functionalities;

import objectRepository.AmazonHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.SeleniumLibrary;

import java.util.List;

public class HomePageFunctionalities extends SeleniumLibrary {

    AmazonHomePage amazonHomePage = new AmazonHomePage();

    public boolean verifyCartIcon() {

        boolean status=isDisplayed(amazonHomePage.cartIcon);
        return status;
    }

    public void verifyReturnAndOrderIcon() {

    }

    public void verifyMobileIcon() {

    }

    public void verifySearchSuggestions() {

    }

}
