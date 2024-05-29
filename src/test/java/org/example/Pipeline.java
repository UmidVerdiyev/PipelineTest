package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.impl.StaticLoggerBinder;

public class Pipeline {

    private WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginDemo(){
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submitBtn = driver.findElement(By.id("login-button"));
        submitBtn.click();

       /*
       List<WebElement> elem = driver.findElements(By.xpath("//*[contains(@class, 'header_label') and contains(text(), 'Swag Labs')]"));

        if (!elem.isEmpty()){
            System.out.println("Is good");
        }else {
            System.out.println("Elements not found");
        }
        */
        System.out.println("Page title is: " + driver.getTitle()
                + "Page source is: " +driver.getPageSource()
                + "Page windowHandleData: " + driver.getWindowHandle());


    }
    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
