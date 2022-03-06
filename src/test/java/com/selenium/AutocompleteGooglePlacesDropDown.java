package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutocompleteGooglePlacesDropDown {

    @Test
    void autocompleteGooglePlacesDropDown(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.twoplugs.com/newsearchserviceneed");

        WebElement ele = driver.findElement(By.xpath("//input[@id='autocomplete']"));

        ele.clear();
        ele.sendKeys("Toronto");

        String text="";

        do{
            ele.sendKeys(Keys.ARROW_DOWN);
            text=ele.getAttribute("value");

            if(text.equalsIgnoreCase("Toronto, OH, USA")){

                ele.sendKeys(Keys.ENTER);
                break;

            }

        }while (!text.isEmpty());

    }
}
