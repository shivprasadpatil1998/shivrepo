package com.shivpatilselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.AllPermission;

public class AlartExample {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);

        alert.dismiss();
        driver.close();

        }
        }
