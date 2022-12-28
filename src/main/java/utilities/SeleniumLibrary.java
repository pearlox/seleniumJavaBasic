package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumLibrary {

    public static WebDriver driver;
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

    public static void initialization() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void click(String elementLocators) {
        String elementLocator = elementLocators.split("\\$")[0];
        String value = elementLocators.split("\\$")[1];

        WebElement element = null;

        //elementlocator = partial link text
        switch (elementLocator.toLowerCase()) {
            case "id" :
                element = driver.findElement(By.id(value)); break;
            case "xpath" :
                element = driver.findElement(By.xpath(value)); break;
            case "linktext" :
                element = driver.findElement(By.linkText(value)); break;
            default:
                System.out.println("element locator is defined incorrectly!!");
        }

        if(element!=null) {
            try {
                element.click();
            } catch (Exception e) {
                javascriptExecutor.executeScript("arguments[0].click();",element);
            }
        }
        else
            System.out.println("Webelement is found as null");
    }

    public void inputText() {

    }

    public boolean isDisplayed(String elementLocators) {
        String elementLocator = elementLocators.split("\\$")[0];
        String value = elementLocators.split("\\$")[1];

        WebElement element = null;
        boolean status = false;

        //elementlocator = partial link text
        switch (elementLocator.toLowerCase()) {
            case "id" :
                element = driver.findElement(By.id(value)); break;
            case "xpath" :
                element = driver.findElement(By.xpath(value)); break;
            case "linktext" :
                element = driver.findElement(By.linkText(value)); break;
            default:
                System.out.println("element locator is defined incorrectly!!");
        }

        if(element!=null) {
            status = element.isDisplayed();
        }
        else
            System.out.println("Webelement is found as null");

        return status;
    }
}
