package com.microfocus.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Demo2DbFree {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();


        //switch to second tab
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("hello");
        //enter password as hello123
        driver.findElement(By.id("input_password")).sendKeys("hello123");
        //click on login
        driver.findElement(By.id("input_go")).click();

        driver.close();

        //switch to 1st tab
        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getTitle());

        driver.quit();


    }
}
