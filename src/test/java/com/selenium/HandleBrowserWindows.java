package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HandleBrowserWindows {

    @Test
    void handleBrowserWindows() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String windowid = driver.getWindowHandle();
        System.out.println(windowid);

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windows = driver.getWindowHandles();

        /*Iterator<String> itr = windows.iterator();

        String parentWindowID = itr.next();
        String childWindowID = itr.next();

        System.out.println("Paresnt Window :"+parentWindowID);
        System.out.println("Child Window :"+childWindowID);

         */

        /*ArrayList<String> arrayList= new ArrayList<String>(windows);

        String parentWindow = arrayList.get(0);
        System.out.println(parentWindow);

        String childwindow = arrayList.get(1);

        System.out.println(childwindow);

        driver.switchTo().window(parentWindow);

        System.out.println(driver.getTitle());

        driver.switchTo().window(childwindow);

        System.out.println(driver.getTitle());

         */

        ArrayList<String> allWindows= new ArrayList<String>(windows);

        for(String id:allWindows){

            String title = driver.switchTo().window(id).getTitle();

            System.out.println(title);

        }

    }
}
