package com.microfocus.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Demo4FBSignUp {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/"); //wait for page load

        //click on create new account
        driver.findElement(By.linkText("Create new account")).click();//findelement will check for presence of element in 0.5s

        //enter firstname as bala
        driver.findElement(By.name("firstname")).sendKeys("peter");

        //enter lastname as dina
        driver.findElement(By.name("lastname")).sendKeys("bala");

        //enter mobile number as 437878
        driver.findElement(By.name("reg_email__")).sendKeys("9889888");

        //enter password as welcome123
        driver.findElement(By.id("password_step_input")).sendKeys("welcome123");

        //20 Dec 2000
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("20");

        Select selectMon=new Select(driver.findElement(By.id("month")));
        selectMon.selectByVisibleText("Dec");

        //select the year as 2000
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
        selectYear.selectByVisibleText("2000");


        //click on radio button custom
        driver.findElement(By.xpath("//input[@value='-1']")).click();

        //click on submit
        driver.findElement(By.name("websubmit")).click();

        //assertions
    }
}
