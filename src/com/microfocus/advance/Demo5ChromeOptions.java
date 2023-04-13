package com.microfocus.advance;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo5ChromeOptions {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless");


        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://irctc.co.in/");

        System.out.println(driver.getTitle());

        TakesScreenshot ts= (TakesScreenshot) driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        file.renameTo(new File("error.png"));


    }
}
