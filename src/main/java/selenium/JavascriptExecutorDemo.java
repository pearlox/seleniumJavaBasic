package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class JavascriptExecutorDemo {

    protected static void takeScreenshot(WebDriver driver,String filePath) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File(filePath);
        FileUtils.copyFile(srcFile,destFile);
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://demoqa.com/books");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            /**
             * we need to create object for javascriptExecutor class
             */
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

            WebElement nicholasElement = driver.findElement(By.xpath("//div[text()='Nicholas C. Zakas']"));

            /**
             * scrollintoview(true) will scroll into that element
             * scrollBy(0,250) -> (x-0,y-250) it will scroll the page by 250 px
             */
            javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",nicholasElement);
            javascriptExecutor.executeScript("window.scrollBy(0,200)");
            Thread.sleep(1000);
            takeScreenshot(driver,System.getProperty("user.dir")+File.separator+"Nicholas.png");

            WebElement searchBoxElement = driver.findElement(By.id("searchBox"));
            javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",searchBoxElement);
            Thread.sleep(1000);

            /**
             * enter text into the text area
             */
            javascriptExecutor.executeScript("arguments[0].setAttribute('value',arguments[1]);",searchBoxElement,"java");

            WebElement searchButtonElement = driver.findElement(By.id("basic-addon2"));

            /**
             * click an element
             */
            javascriptExecutor.executeScript("arguments[0].click",searchButtonElement);
            takeScreenshot(driver,System.getProperty("user.dir")+File.separator+"Search.png");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
