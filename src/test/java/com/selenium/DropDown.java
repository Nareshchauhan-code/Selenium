package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDown {

    @Test
    void dropDown() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.twoplugs.com/");

        driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();

        WebElement drp = driver.findElement(By.name("category_id"));

        Select select = new Select(drp);

        List<WebElement> alloptions = select.getOptions();

        ArrayList orginalList = new ArrayList();

        ArrayList sortedList = new ArrayList();

        for (WebElement option : alloptions) {

            orginalList.add(option.getText());
            sortedList.add(option.getText());

        }

        Collections.sort(sortedList);

        if (orginalList.equals(sortedList)) {

            System.out.println("Sorted");

        } else {
            System.out.println("UnSorted");
        }

    }
}
