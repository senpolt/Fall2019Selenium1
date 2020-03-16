package com.automation.tests.day7;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WARM_UP {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("https://www.ebay.com/");
        BrowserUtils.wait(2);
        WebElement searchbutton = driver.findElement(By.id("gh-ac"));
        searchbutton.sendKeys("books", Keys.ENTER);
        BrowserUtils.wait(3);
        driver.close();
    }

/**
 * Go to ebay
 * enter search term
 * click on search button
 * print number of results
 * go to amazon
 * Go to ebay
 * enter search term
 * click on search button
 * verify title contains search term
 * Go to wikipedia.org
 * enter search term `selenium webdriver`
 * click on search button
 * click on search result `Selenium (software)`
 * verify url ends with `Selenium_(software)`
 */

}