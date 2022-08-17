package com.shivpatilselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowmExample {
    private static ChromeDriver driver;

        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver= new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

            WebElement dropDown = driver.findElement(By.name("country"));


        Select select = new Select(dropDown);

        select.selectByVisibleText("Afghanistan");

        Thread.sleep(2000);

        driver.close();

    }    }


