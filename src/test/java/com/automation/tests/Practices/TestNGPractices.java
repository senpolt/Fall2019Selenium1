package com.automation.tests.Practices;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractices {
    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= DriverFactory.createDriver("chrome");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://google.com");
        String expectedTitle="Google";
        String actualTitle =driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not correct");
        System.out.println(expectedTitle);

    }
    @Test(description = "Verify title of apple.com")
    public void VerifyApplesPageTitle(){
        driver.get("https://www.apple.com/");
        String expectedTitle="Apple";
        BrowserUtils.wait(3);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Not correct");

    }
    @Test
    public void VeryfyAmazonTitle(){
        driver.get("https://amazon.com");
               String  expected =("Amazon.com");
        String actual =driver.getTitle();
        Assert.assertTrue(actual.contains(expected));
    }



}
