package com.shivpatilselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherParameterExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();

    }
}

