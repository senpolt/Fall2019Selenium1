package com.automation.tests.Practices;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorsPractice_CSS {
    public static void main(String[] args) {


        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("supersdet");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwerty123456");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
         driver.findElement(By.cssSelector("input[name='birthday")).sendKeys("01/23/1988");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("571-234-0056");
        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select.selectByVisibleText("SDET");
        driver.findElement(By.cssSelector("input[value='female']")).click();


        driver.findElement(By.id("wooden_spoon")).click();
        BrowserUtils.wait(2);
        driver.quit();
    }
}