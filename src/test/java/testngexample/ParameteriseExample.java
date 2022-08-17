package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class ParameteriseExample {

    public static WebDriver driver;

    @BeforeMethod
    public void Before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void ParameteriseClassify() throws InterruptedException {
        String name = "digitalparters";
        String city = "pune";
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(name + " " + city);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void after() {
        driver.close();

    }
    
}