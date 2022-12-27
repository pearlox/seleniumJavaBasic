package functionalities;

import objectRepository.AmazonHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageFunctionalities {

    AmazonHomePage amazonHomePage = new AmazonHomePage();

    public boolean verifyCartIcon(WebDriver driver) {

        boolean status=false;
        String elementLocator = amazonHomePage.cartIcon.split("\\$")[0];
        String value = amazonHomePage.cartIcon.split("\\$")[1];

        if(elementLocator.equalsIgnoreCase("id")) {
            status = driver.findElement(By.id(value)).isDisplayed();
        } else if(elementLocator.equalsIgnoreCase("xpath")) {
            status = driver.findElement(By.xpath(value)).isDisplayed();
        }

        return status;
    }

    public void verifyReturnAndOrderIcon(WebDriver driver) {

    }

    public void verifyMobileIcon(WebDriver driver) {

    }

}
