package com.microfocus.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo4Js {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");


        driver.findElement(By.partialLinkText("select your product type")).click();
        driver.findElement(By.partialLinkText("Credit Card")).click();

        WebElement ele= driver.findElement(By.xpath("//input[@name='DOB']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='12/03/2009'",ele);
    }
}
