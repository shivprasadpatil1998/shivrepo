package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClickExample {
   public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions actions = new Actions(driver);
        actions.contextClick(doubleClick).perform();

        Thread.sleep(5000);
        driver.close();

    }

}
