package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DisplayedEnableAndSelected {

    @Test
    void checkDisplayed(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.nopcommerce.com/en/cart");

        WebElement ele = driver.findElement(By.xpath("//span[@class='ico-user sprite-image']"));

        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();

        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        WebElement val = driver.findElement(By.xpath("//input[@id='Username']"));

        System.out.println(val.isDisplayed());
        System.out.println(val.isEnabled());


    }
}
