package com.example.tests;

import com.example.drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void testGoogleTitle() {
        String browser = System.getProperty("browser", "chrome");
        WebDriver driver = DriverFactory.createDriver(browser);

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}