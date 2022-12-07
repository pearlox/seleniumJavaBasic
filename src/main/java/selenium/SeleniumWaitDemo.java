package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.manutd.com/");

            /**
             * implicit wait will wait for particular time for each and every actions
             */
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            /**
             * Explicit wait will wait for the certain conditions provided
             * using explicit wait we can avoid StaleElementException from selenium
             */
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));

            /**
             * there are n number of ExpectedConditions available
             * presenceOfElementLocated will wait until the element is loaded in DOM
             * visibilityOfElementLocated will wait until the element is visible in DOM
             */
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gigyalogin']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gigyalogin']")));

            WebElement element = driver.findElement(By.xpath("//div[@id='gigyalogin']"));
            element.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
