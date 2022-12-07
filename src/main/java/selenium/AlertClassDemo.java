package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertClassDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://demoqa.com/alerts");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            /**
             * in order to accept / dismiss the web browser alert, we need to use Alert class
             */
            driver.findElement(By.id("alertButton")).click();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);

            /**
             * getText() will return the alert text
             * accept() will accept the alert (similar to click on ok button)
             * dimiss() will dismiss the alert (similar to click on cancel button)
             */
            String textinalert = alert.getText();
            System.out.println(textinalert);
            alert.accept();

            driver.findElement(By.id("timerAlertButton")).click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
            wait.until(ExpectedConditions.alertIsPresent());
            alert = driver.switchTo().alert();
            Thread.sleep(2000);
            textinalert = alert.getText();
            System.out.println(textinalert);
            alert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
