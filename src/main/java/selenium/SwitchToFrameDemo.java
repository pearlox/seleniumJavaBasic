package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwitchToFrameDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            //1
            driver.get("https://demoqa.com/frames");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.switchTo().frame("frame1");
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.switchTo().defaultContent();

            driver.switchTo().frame("frame2");
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.switchTo().defaultContent();

            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
