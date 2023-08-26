package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserInvoking {

    @Test
    void browserInvoking() {



        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        webDriver.get("https://www.toolsqa.com/");

        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getPageSource());
        webDriver.quit();


    }
}
