package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample4 {
    public static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement dropDowm = driver.findElement(By.name("Month"));

        Select select = new Select(dropDowm);
        select.selectByIndex(2);
        Thread.sleep(1000);

        select.selectByIndex(5);
        Thread.sleep(1000);

        select.selectByValue("Oct");
        Thread.sleep(1000);

        select.deselectByIndex(2);
        Thread.sleep(1000);

        select.deselectAll();
        Thread.sleep(1000);

        Thread.sleep(5000);
        driver.close();
    }
}

