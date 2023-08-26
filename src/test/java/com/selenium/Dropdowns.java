package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Dropdowns {

    @Test
    void dropDown(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement ele = driver.findElement(By.cssSelector("#input-country"));

        Select select= new Select(ele);

        select.selectByVisibleText("Afghanistan");



    }
}
