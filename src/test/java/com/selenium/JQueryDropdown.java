package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JQueryDropdown {

    @Test
    void jQueryDropdown(){


        WebDriver driver=  new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/selectmenu/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement ele = driver.findElement(By.xpath("//span[@id='speed-button']"));

        if(ele.getText().equalsIgnoreCase("Slow")){

            ele.click();

        }




    }
}
