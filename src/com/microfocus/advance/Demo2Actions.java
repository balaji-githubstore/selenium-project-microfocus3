package com.microfocus.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo2Actions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nasscom.in/");

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();

        driver.findElement(By.xpath("//a[text()='Members Listing']")).click();
    }
}
