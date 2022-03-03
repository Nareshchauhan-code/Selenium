package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.desktop.QuitEvent;
import java.util.List;

public class FindElement_FindElements {

    @Test
    void findElement(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");

       // WebElement ele = driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']"));
        //ele.click();

        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='links']/li"));

        for(WebElement eles:elements){

            System.out.println(eles.getText());
        }
                

    }
}
