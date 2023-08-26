package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {

    @Test
    void autoSuggestDropDown() throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bing.com/");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("Selenium");
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']"));
        System.out.println(list.size());
    }
}
