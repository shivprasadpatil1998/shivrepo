package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shankar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        Thread.sleep(1000);
        driver.close();

    }
}
