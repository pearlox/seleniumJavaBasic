package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class SeleniumBasicDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
//            driver.get("https://www.manutd.com/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//
//            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gigyalogin']")));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gigyalogin']")));
//
//            WebElement element = driver.findElement(By.xpath("//div[@id='gigyalogin']"));
//            element.click();

            /*driver.get("https://demoqa.com/alerts");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.findElement(By.id("alertButton")).click();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);

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
            alert.accept();*/

//            driver.get("https://www.manutd.com/");
            /*driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
//            WebElement element = driver.findElement(By.id("accessible-megamenu-undefined"));
            actions.keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).sendKeys("def").build().perform();
            actions.contextClick(element).perform();

            Thread.sleep(3000);*/

            /*driver.get("https://phptravels.net/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.id("select2-hotels_city-container"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();


            //Tool tip
            System.out.println(element.getAttribute("title"));*/

            driver.get("https://demo.guru99.com/test/upload/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.findElement(By.id("uploadfile_0")).sendKeys("G:\\Demo.txt");

            Thread.sleep(3000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
