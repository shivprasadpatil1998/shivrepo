package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
        element.sendKeys("shivprasadpatil1998@gmail.com");

        Thread.sleep(2000);

        driver.close();
    }
}
