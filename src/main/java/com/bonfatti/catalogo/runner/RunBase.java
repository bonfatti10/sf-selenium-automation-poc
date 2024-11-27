package com.bonfatti.catalogo.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunBase {
    private static WebDriver driver;

    // Método para obter a instância do WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    // Método para encerrar o WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
