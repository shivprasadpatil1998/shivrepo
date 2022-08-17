package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shankar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.xpath("input[class='signinbtn']")).click();
        Thread.sleep(1000);
        driver.close();

    }
}

