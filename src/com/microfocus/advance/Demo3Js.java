package com.microfocus.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo3Js {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");




        driver.findElement(By.partialLinkText("select your product type")).click();
        driver.findElement(By.partialLinkText("Credit Card")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#bill-date-long').value='12/03/2009'");
    }
}
