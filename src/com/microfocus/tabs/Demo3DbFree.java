package com.microfocus.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo3DbFree {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.online.citibank.co.in/");

        //click on phpMyAdmin »
        driver.findElement(By.partialLinkText("APPLY FOR CREDIT CARDS")).click();

        driver.findElement(By.xpath("//span[text()='Login']")).click();

        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());

        for( String win: windows)
        {
            System.out.println(win);
            driver.switchTo().window(win);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            if(driver.getTitle().equals("Citibank India"))
            {
                break;
            }
            System.out.println("---------------------");
        }


        driver.findElement(By.cssSelector("#User_Id")).sendKeys("hello");

        driver.close();

        windows=new ArrayList<String>(driver.getWindowHandles());

        for( String win: windows)
        {
            System.out.println(win);
            driver.switchTo().window(win);
            if(driver.getCurrentUrl().contains("apply"))
            {
                break;
            }
        }

        System.out.println(driver.getTitle());
    }
}
