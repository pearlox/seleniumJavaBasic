package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://demo.guru99.com/test/upload/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            /**
             * sendkeys work only if the input tag is present
             * <input type="file"....>
             */
            driver.findElement(By.id("uploadfile_0")).sendKeys("G:\\Demo.txt");

            Thread.sleep(3000);


            /**
             * Copy the file path which needs to be uploaded
             */
            StringSelection s = new StringSelection("G:\\Demo.txt");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);

            /**
             * click on upload button / choose button and then use robot class to paste the
             * copied contents and hit enter
             */
            driver.findElement(By.id("filelist")).click();

            Thread.sleep(3000);

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(2000);

            /**
             * Take screenshot using TakesScreenshot class object
             * Copy file to another file using FileUtils
             * to use FileUtils class, we need to import commons.io dependency
             */
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

            File destFile = new File(System.getProperty("user.dir")+File.separator+"screenshot.png");
            FileUtils.copyFile(srcFile,destFile);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
