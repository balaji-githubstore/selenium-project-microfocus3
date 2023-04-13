package com.microfocus.advance;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo8ShadowElements {
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

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("chrome://downloads/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        String output=js.executeScript("return document.title").toString();
        System.out.println(output);

        output= js.executeScript("return document.querySelector(\"body > downloads-manager\")" +
                ".shadowRoot.querySelector(\"#frb0\").shadowRoot.querySelector(\"#show\")" +
                ".innerText").toString();

        //Selenium 4 feature for shadow elements
        SearchContext sc= driver.findElement(By.tagName("downloads-manager")).getShadowRoot();
        sc=sc.findElement(By.cssSelector("#frb0")).getShadowRoot();
       output= sc.findElement(By.cssSelector("#show")).getText();
        System.out.println(output);

        System.out.println(output);
//        String text=driver.findElement(By.id("show")).getText();
//        System.out.println(text);

    }
}
