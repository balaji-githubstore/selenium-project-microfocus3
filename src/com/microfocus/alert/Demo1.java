package com.microfocus.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        //click on go
        driver.findElement(By.xpath("//img[@alt='Go']")).click();

        //wait for alert is present
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);

        driver.switchTo().alert().accept();
    }
}
