package com.microfocus.advance;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo6ChromeOptions {
    public static void main(String[] args) {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Mine\\New folder");

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selenium.dev/downloads");

        driver.findElement(By.partialLinkText("32")).click();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://google.com");

    }
}
