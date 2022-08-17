package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldExample {
    private static ChromeDriver driver;

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

            WebElement elementA = driver.findElement(By.name("A"));
            WebElement elementD =  driver.findElement(By.xpath("//li[text()='D']"));

            Actions actions = new Actions(driver);
            actions.clickAndHold(elementA).moveToElement(elementD).perform();

            Thread.sleep(2000);
            driver.close();

        }
    }