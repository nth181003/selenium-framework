package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.drivers.DriverFactory;
import com.example.utils.ConfigReader;

public class GoogleTest {

    @Test
    public void testGoogleTitle() {
        String browser = System.getProperty("browser", "chrome");
        WebDriver driver = DriverFactory.createDriver(browser);

        String username = ConfigReader.getUsername();
        String password = ConfigReader.getPassword();

        System.out.println("Username loaded: " + username);
        System.out.println("Password loaded successfully: " + (password != null && !password.isBlank()));

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}