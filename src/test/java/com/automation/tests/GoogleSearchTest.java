package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

            public class GoogleSearchTest {
                public static void main(String[] args) throws Exception {
                    WebDriverManager.chromedriver().setup();
                    WebDriver driver = new ChromeDriver();
                    driver.get("http://google.com");
                    Thread.sleep(2000);
                    //By.name("q")---> name="q"
                    //name is one of the selenium locators
                    //There are 8 locators
                    //We use locators to find elements
                    //to choose locator, just use By. locator
                    WebElement search = driver.findElement(By.name("q"));
                    //once we found element,how to enter text
                    //to enter the text use sendKeys() method
                    //how to press enter after entering the text?
                    //use Key.ENTER
                    // Keys.ENTER  --> perform keybord click
                    //keysToSend- name of the parameters, we don't specify it
                    search.sendKeys("Java", Keys.ENTER);
                    //2000--> 2 seconds
                    //Thread.sleep is used to pause java program
                    Thread.sleep(4000);
                    WebElement news = driver.findElement(By.linkText("News"));

                    news.click();//to click on the element
                    Thread.sleep(4000);
                    driver.quit();
                }
            }