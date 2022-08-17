package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample3 {
    public static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement dropDowm = driver.findElement(By.name("country"));

        Select select = new Select(dropDowm);

        select.getAllSelectedOptions();

        Thread.sleep(5000);
        driver.close();

    }
}

