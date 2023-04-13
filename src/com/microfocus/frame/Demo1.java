package com.microfocus.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
        //enter userid as test123
        driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
        //click on continue
        driver.findElement(By.linkText("CONTINUE")).click();

        //come out of the frame basically to main html
        driver.switchTo().defaultContent();


    }
}
