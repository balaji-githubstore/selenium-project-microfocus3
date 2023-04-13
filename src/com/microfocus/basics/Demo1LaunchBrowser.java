package com.microfocus.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1LaunchBrowser {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com/");

        //print the title of the page
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        System.out.println(driver.getTitle());

        //print the current url
        System.out.println(driver.getCurrentUrl());

        //print the entire html of that page
        System.out.println(driver.getPageSource());

        driver.quit();

//        driver=new ChromeDriver();
//        driver.get("https://www.facebook.com/");
    }
}
