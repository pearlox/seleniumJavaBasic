package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class NewWindowDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            //1
            driver.get("https://demoqa.com/browser-windows");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            String parentWindow = driver.getWindowHandle();
            driver.findElement(By.id("windowButton")).click();
            //2

            Set<String> windowIDs = driver.getWindowHandles();
            for (String windowHandle:windowIDs) {
                if(parentWindow.equalsIgnoreCase(windowHandle)) {

                } else {
                    driver.switchTo().window(windowHandle);
                    driver.manage().window().maximize();
                    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//                    driver.close();
//                    driver.switchTo().defaultContent();
                    driver.switchTo().window(parentWindow);
                    System.out.println(driver.findElement(By.id("tabButton")).isDisplayed());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
