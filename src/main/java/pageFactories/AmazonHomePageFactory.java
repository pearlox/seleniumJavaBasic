package pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageFactory {

    WebDriver driver;

    public AmazonHomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="nav-cart")
    WebElement cartIcon;

    @FindBy(xpath = "//a[@id='nav-orders']")
    WebElement orderIcon;

    @FindBy(xpath = "//div[@id='nav-logo']//a")
    WebElement logoIcon;

    //private String cartIcon = "id$nav-cart";

    public void verifyCartIcon() {
        //driver.findElement(By.id("")).isDisplayed();
        cartIcon.isDisplayed();
    }

}
