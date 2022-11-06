package com.mptp.tests;

import com.mptp.utilities.BrowserFactory;
import com.mptp.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondTest {
    public static void main(String[] args) throws InterruptedException {
        saucedemoTest();
    }

    public static void saucedemoTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        String expectedTitle = "Swag Labs";
        StringUtility.verifyEquals(driver.getTitle(), expectedTitle);

        driver.findElement(By.id("user-name")).sendKeys(driver.findElement(By.id("login_credentials")).getText().substring(24, 37));

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(driver.findElement(By.className("login_password")).getText().substring(23));

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='login-button']")).click();

        String expectedProductPageTitle = "Swag Labs";
        StringUtility.verifyEquals(driver.getTitle(),expectedProductPageTitle);

        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//button[@data-test='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

        String numberOfBoughtMaterials="6";
        StringUtility.verifyEquals(driver.findElement(By.xpath("//span[.='6']")).getText(),numberOfBoughtMaterials);
        Thread.sleep(2000);

       driver.findElement(By.xpath("//span[.='6']")).click();

        driver.findElement(By.name("remove-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-bike-light']")).click();
        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.name("remove-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("remove-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//button[@data-test='remove-test.allthethings()-t-shirt-(red)']")).click();

        Thread.sleep(2000);

//        driver.close();
    }
}
