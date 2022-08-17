package com.shivpatilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        System.out.println(driver.findElement(By.tagName("iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("//h1[text()='This is a sample page']")));
        System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
        driver.close();



    }


}
