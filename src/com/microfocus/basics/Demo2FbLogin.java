package com.microfocus.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FbLogin {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement ele= driver.findElement(By.id("email"));
        ele.sendKeys("hello123@gmail.com");

//        driver.findElement(By.id("email")).sendKeys("hello123999999@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("welcome");

        //click on login
        driver.findElement(By.name("login")).click();
    }
}
