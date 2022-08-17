package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(element);
        action.perform();

        Thread.sleep(1000);

        driver.close();

    }
}

