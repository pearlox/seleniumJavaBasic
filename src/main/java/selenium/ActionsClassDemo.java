package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsClassDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            /**
             * Actions class will be used to do perform operation such as mouse hover, drag and drop, double click,
             * right click, click, send input to text box/text area, getting tool tip and much more
             */
            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));

            /**
             * keyDown is used to press the key
             * keyUp is used to release the pressed key
             * if we are using two or more operation in actions, then we need to build and then perform
             */
            actions.keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).sendKeys("def").build().perform();

            /**
             * if we want to right click at any element, then we need to use context click
             * since we are using only one action here, build() is not required
             */
            actions.contextClick(element).perform();

            Thread.sleep(3000);

            driver.get("https://phptravels.net/");

            element = driver.findElement(By.id("select2-hotels_city-container"));

            /**
             * to hover an element, use moveToElement()
             */
            actions.moveToElement(element).perform();

            /**
             * tooltip value will be always under 'title' attribute
             */
            System.out.println(element.getAttribute("title"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
