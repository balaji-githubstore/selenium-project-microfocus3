package com.microfocus.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3githublogin {
    public static void main(String[] args) {

//        1.	Navigate to https://github.com/login
//        2.	Enter username as hello
//        3.	Enter password as 89hello
//        4.	Click Sign in

        WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/login");

        driver.findElement(By.id("login_field")).sendKeys("jack");
        driver.findElement(By.id("password")).sendKeys("jack123");

        driver.findElement(By.name("commit")).click();



    }
}
