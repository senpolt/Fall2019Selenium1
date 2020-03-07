package com.automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        //chrome driver setup
        WebDriverManager.chromedriver().setup();
        //creatre chromedriverobject
        ChromeDriver driver = new ChromeDriver();
        //open some website
        driver.get("http://google.com");



    }
}
