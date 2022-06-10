package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DrpNaresh {

    public static void main(String[] args) throws InterruptedException {


        // Start firefox browser

        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();


        // start the application

        driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");


        // First we have to click on menu item then only dropdown items will display

        driver.findElement(By.xpath(".//*[@id='menu1']")).click();


        // adding 2 seconds wait to avoid Sync issue

        Thread.sleep(2000);


        // Dropdown items are coming in <a> tag so below xpath will get all

        // elements and findElements will return list of WebElements

        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));

        for (WebElement as : list) {

            if (as.getAttribute("innerHTML").contains("JavaScript")) {

                as.click();
                break;
            }


        }

    }
}
