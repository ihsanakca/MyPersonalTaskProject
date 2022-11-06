package com.mptp.tests;

import com.mptp.utilities.BrowserFactory;
import com.mptp.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class FirstTests {
    public static void main(String[] args) throws InterruptedException {
        edgeDriverTest();
        chromeDriverTest();
        firefoxDriverTest();
    }

    public static void edgeDriverTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),googleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),etsyTitle);

        driver.close();
    }

    public static void chromeDriverTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),googleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),etsyTitle);

        driver.close();
    }

    public static void firefoxDriverTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),googleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),etsyTitle);

        driver.close();
    }
}
