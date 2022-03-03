package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BootstrapDropDown {
    @Test
    void genericMethod() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hdfcbank.com/");
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]"));
        ele.click();
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println(list.size());

        for (WebElement value : list) {

            if (value.getText().contains("Accounts")) {

                value.click();
                break;
            }


        }
    }
}
