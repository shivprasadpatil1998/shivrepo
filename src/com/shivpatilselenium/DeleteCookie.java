package com.shivpatilselenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookie {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie a : cookies){
            System.out.println(a);
        }
        System.out.println("after deleting");
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
