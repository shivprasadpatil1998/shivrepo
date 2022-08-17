package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("shivprasadpatill998@gmail.com");
        Thread.sleep(2000);
        driver.close();

        List<WebElement> elements= driver.findElements(By.tagName("input"));
        for (WebElement a : elements){
            System.out.println(a);
        }
        driver.close();
    }
}