package com.example.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {
        boolean isCI = System.getenv("CI") != null;

        if (browser == null || browser.isBlank()) {
            browser = "chrome";
        }

        if ("chrome".equalsIgnoreCase(browser)) {
            return createChromeDriver(isCI);
        }

        throw new IllegalArgumentException("Browser not supported: " + browser);
    }

    private static WebDriver createChromeDriver(boolean headless) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        if (headless) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        } else {
            options.addArguments("--start-maximized");
        }

        return new ChromeDriver(options);
    }
}