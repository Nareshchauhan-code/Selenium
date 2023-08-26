package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigateBackForward {

    @Test
    void Navigate() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://www.facebook.com/");
        //driver.get("https://www.snapdeal.com/");

        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().to("https://www.snapdeal.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

    }
}
